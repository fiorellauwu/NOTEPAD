/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author PERCY
 */
public class excers13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int saldo=1000;
        int opcion;
        float ingreso,s_actual,retiro;
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automático\n"
        + "1. Ingresar dinero a la cuenta\n"
        + "2. Retirar dinero de la cuenta\n"
        + "3. Salir\n"));
        
        switch(opcion){
            case 1: ingreso=Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar en cuenta: "));
                    s_actual=saldo+ingreso;
                    JOptionPane.showMessageDialog(null,"Dinero en cuenta: "+s_actual);
                    break;
            case 2: retiro=Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea retirar"));        
                if(saldo<retiro){
                JOptionPane.showMessageDialog(null,"El saldo es insuficiente");
                }
                else {
                s_actual=saldo-retiro;
                JOptionPane.showMessageDialog(null,"Dinero en cuenta: "+s_actual);
                }
                break;
            default:
        }
    }
    
}

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
public class Excrs13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float m,sum,rest;
        int t=1000;
        String r = "retirar";
        String i = "ingresar";
        String palabra;
        
        m=Float.parseFloat(JOptionPane.showInputDialog("Digite su monto"));
        palabra = JOptionPane.showInputDialog("Desea ingresar o retirar dinero?");
        //operacion=Float.parseFloat(JOptionPane.showInputDialog("Desea ingresar o retirar dinero?"));
        
        switch(palabra){
            case "ingresar": sum=t+m;
                    JOptionPane.showMessageDialog(null,"Usted ingresó "+m+" su saldo total es: "+sum); 
                    break;
            case "retirar": rest=t-m;
                    JOptionPane.showMessageDialog(null,"Usted retiró "+m+" su saldo total es: "+rest); 
                    break;
            
        }
        
        
        
    }
    
}

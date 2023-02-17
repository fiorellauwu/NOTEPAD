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
public class Switch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato;
        dato = Integer.parseInt(JOptionPane.showInputDialog(""));
        
        switch(dato){
            case 1:JOptionPane.showMessageDialog(null,"Es el número 1");
                break;
            case 2:JOptionPane.showMessageDialog(null,"Es el número 2");
                break;
            case 3:JOptionPane.showMessageDialog(null,"Es el número 3");
                break;
            case 4:JOptionPane.showMessageDialog(null,"El numero es 4");
                break;
            default: JOptionPane.showMessageDialog(null,"El número no esta en el rango del 1 al 4");
            
        
        
        }
    }
    
}

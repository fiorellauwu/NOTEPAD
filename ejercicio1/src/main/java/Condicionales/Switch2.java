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
public class Switch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un número del 1 - 3"));
        switch (dato){
        case 1:JOptionPane.showMessageDialog(null,"El numero es 1");
            break;
        case 2:JOptionPane.showMessageDialog(null,"El numero es 2");
            break;
        case 3:JOptionPane.showMessageDialog(null,"El número es 3");
            break;
        default:JOptionPane.showMessageDialog(null,"El número no esta en el rango del 1 - 3");
        
        }
    }
    
}

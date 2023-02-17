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
public class IE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numero, dato =7.5;
         numero = Double.parseDouble(JOptionPane.showInputDialog("Digita un número"));
         
         if (numero <= dato){
             JOptionPane.showMessageDialog(null,"El número es menor a 7.5");
         }
             else{
             JOptionPane.showMessageDialog(null,"El número es diferente de 7");
         }
         
    }
    
}

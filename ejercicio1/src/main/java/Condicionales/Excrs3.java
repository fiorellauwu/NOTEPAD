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
public class Excrs3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       char letra;
       String mensaje;
       
       letra =JOptionPane.showInputDialog("").charAt(0);
       mensaje = (Character.isUpperCase(letra))?"Es mayuscula":"No es mayuscula";
       JOptionPane.showMessageDialog(null,mensaje);
       
    }
    
}

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
public class Excs1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        String mensaje;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero multiplo de 10"));
        JOptionPane.showMessageDialog(null,(numero%10==0)?"Es multiplo de 10":"No es multiplo de 10");
    }
    
}

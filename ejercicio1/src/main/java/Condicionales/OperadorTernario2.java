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
public class OperadorTernario2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato;
        String mensaje;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        
        mensaje = (dato%3==0) ? "Es multiplo de 3":"no es multiplo de 3";
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}

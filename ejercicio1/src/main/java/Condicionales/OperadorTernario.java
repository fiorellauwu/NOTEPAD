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
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        String mensaje;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        mensaje = (numero%2==0) ? "Es par":"Es impar";
        
        JOptionPane.showMessageDialog(null, mensaje);
        
        
        
        
        
        
    }
    
}

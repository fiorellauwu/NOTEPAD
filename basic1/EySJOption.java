/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic1;

import javax.swing.JOptionPane;
public class EySJOption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Digite una cadena:");
        entero= Integer.parseInt(JOptionPane.showInputDialog("Digite una numero:"));
        letra = JOptionPane.showInputDialog("Digite un caracter:").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal:"));
        
        JOptionPane.showMessageDialog(null,"la cadena es: "+cadena);
        JOptionPane.showMessageDialog(null,"el numero es: "+entero);
        JOptionPane.showMessageDialog(null,"el caracter es: "+letra);
        JOptionPane.showMessageDialog(null,"el decimal es: "+decimal);
    }
    
}

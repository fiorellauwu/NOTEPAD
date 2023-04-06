/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CiclosBloques;

import javax.swing.JOptionPane;

/**
 *
 * @author fcruc
 */
public class ejrc10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, suma=0;
        for(int i=1;i<=10;i++){
         numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrse un número: "));
            
         suma += numero;
           
        }
         System.out.println(suma);
        
    }
    
}

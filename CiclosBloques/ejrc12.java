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
public class ejrc12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        long fact=1;
       num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
      
       for(int i=1;i<=num;i++){ 
           
           fact*=i;
       }
       System.out.println("La factorizacion es: "+fact);
    }
    
}

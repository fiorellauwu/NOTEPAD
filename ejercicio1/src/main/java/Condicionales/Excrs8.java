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
public class Excrs8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        
        n=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
        
        if(n<10){
        JOptionPane.showMessageDialog(null,"Tiene 1 cifra");
        }
        else if(9<n && n<100){
              
        JOptionPane.showMessageDialog(null,"Tiene 2 cifra");
        }
         else if(99<n && n<1000){
              
        JOptionPane.showMessageDialog(null,"Tiene 3 cifra");
        }
         else if(999<n && n<10000){
        JOptionPane.showMessageDialog(null,"Tiene 4 cifra");
        }
        else if(9999<n && n<100000){
              
        JOptionPane.showMessageDialog(null,"Tiene 5 cifra");
        }
         else if(99999<n && n<1000000){
              
        JOptionPane.showMessageDialog(null,"Tiene 6 cifra");
        }
        
    }
    
}

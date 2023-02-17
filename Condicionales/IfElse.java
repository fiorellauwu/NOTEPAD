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
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero, dato =5;
       
       numero = Integer.parseInt(JOptionPane.showInputDialog("Inserte número"));
      
      if(numero == dato){
            JOptionPane.showMessageDialog(null,"El número es 5");
      }
      else{
          JOptionPane.showMessageDialog(null,"El número es diferente a 5");
      }
    }
}
      
    
    
    

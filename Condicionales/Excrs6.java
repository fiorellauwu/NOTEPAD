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
public class Excrs6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog(""));
        n2=Integer.parseInt(JOptionPane.showInputDialog(""));
        
        if(n1%2==0 && n2%2==0){
        JOptionPane.showMessageDialog(null,"Son numeros pares");
        }
        else if(n1%3==0 && n2%3==0){
              
        JOptionPane.showMessageDialog(null,"Son numeros impares");
        }
         else if(n1%2==0 && n2%3==0){
              
        JOptionPane.showMessageDialog(null,"El primero es par y el segundo es impar");
        }
          else if(n1%3==0 && n2%2==0){
              
        JOptionPane.showMessageDialog(null,"El primero es impar y el segundo es par");
        }
     
    }
    
}

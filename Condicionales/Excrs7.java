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
public class Excrs7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,n3;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite un primer numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite un segundo numero"));
        n3=Integer.parseInt(JOptionPane.showInputDialog("Digite un tercer numero:"));
        
        if(n1>n2&&n2>n3){
        JOptionPane.showMessageDialog(null,"Orden: "+n1+" - "+n2+" - "+n3);
        }
        else if(n1>n3&&n3>n2){
              
        JOptionPane.showMessageDialog(null,"Orden: "+n1+" - "+n3+" - "+n2);
        }
         else if(n2>n1&&n1>n3){
              
        JOptionPane.showMessageDialog(null,"Orden: "+n2+" - "+n1+" - "+n3);
        }
         else if(n2>n3&&n3>n1){
        JOptionPane.showMessageDialog(null,"Orden: "+n2+" - "+n3+" - "+n1);
        }
        else if(n3>n1&&n1>n2){
              
        JOptionPane.showMessageDialog(null,"Orden: "+n3+" - "+n1+" - "+n2);
        }
         else if(n3>n2&&n2>n1){
              
        JOptionPane.showMessageDialog(null,"Orden: "+n3+" - "+n2+" - "+n1);
        }
    }
    
}

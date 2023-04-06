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
public class Excrs9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int d,m,a;
         
         d=Integer.parseInt(JOptionPane.showInputDialog("Digite el día:"));
         m=Integer.parseInt(JOptionPane.showInputDialog("Digite el mes:"));
         a=Integer.parseInt(JOptionPane.showInputDialog("Digite el año:"));
         
         if((d>=1)&&(d<=30)){
             if((m<=1)&&(m<=12)){
                 if(a!=0){
                   JOptionPane.showMessageDialog(null,"La fecha es :"+d+"/"+m+"/"+a);
                 }
                 else{
                   JOptionPane.showMessageDialog(null,"Fecha incorrecta, el año es incorrecto");
                 }
             }    
             else{
               JOptionPane.showMessageDialog(null,"Fecha incorrecta, el mes es incorrecto");
             }
         }
         else{
           JOptionPane.showMessageDialog(null,"Fecha incorrecta, el día es incorrecto");
         }
    }
    
}
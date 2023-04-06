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
public class Excrs10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int d,m,a;
       
       d=Integer.parseInt(JOptionPane.showInputDialog("Digite el día:"));
       m=Integer.parseInt(JOptionPane.showInputDialog("Digite el mes:"));
       a=Integer.parseInt(JOptionPane.showInputDialog("Digite el año:"));
       
       if (a==0){
           JOptionPane.showMessageDialog(null,"Fecha incorrecta");
       }
       else if((m==2) && (d>=1 && d<=28)){
       JOptionPane.showMessageDialog(null,"Fecha correcta");
       }
       else if ((m==4)||(m==6)||(m==9)||(m==11)&&(d>=1&&d<=30)){
       JOptionPane.showMessageDialog(null,"Fecha correcta");
       }
       else if ((m==1)||(m==3)||(m==5)||(m==7)||(m==8)||(m==10)||(m==12)&&(d>=1&&d<=30)){
       JOptionPane.showMessageDialog(null,"Fecha correcta");
       }
       else{
       JOptionPane.showMessageDialog(null,"La fecha es incorrecta");
       }
           
           
           
           
           
           
           
           
           
           
           
           
       
       
           
           
       
       
       }      
       
       
       
       
       
       
       
       
    
    
}

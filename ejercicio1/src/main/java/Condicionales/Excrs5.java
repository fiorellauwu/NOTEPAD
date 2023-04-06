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
public class Excrs5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas;
        float ss1,ss2;
        horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese sus horas trabajadas"));
        if(horas>40){
         ss1=((horas-40)*20)+640;   
        JOptionPane.showMessageDialog(null,"Ha trabajado más de 40 horas su sueldo es: "+ss1);
        }
        else if (horas<=40){
          ss2=horas*16;  
        JOptionPane.showMessageDialog(null,"Su sueldo semanal es:"+ss2);
        }
        }
        
        
        
        
        
    }
    


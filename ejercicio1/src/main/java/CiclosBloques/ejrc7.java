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
public class ejrc7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, elementos=0,suma=0;
        float media;
       
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introducir un numero:"));
        while(numero>=0){
            suma+= numero;
            elementos++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introducir un numero:"));
        }
        
        if(elementos==0){
        System.out.println("Ingrese un numero!");
        }
        else{
         media=(float)suma/elementos;
        System.out.println("La media es : "+media); }
    }
    
}

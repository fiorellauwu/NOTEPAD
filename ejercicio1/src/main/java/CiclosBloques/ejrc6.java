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
public class ejrc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,suma=0;
         do{
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
                suma = suma + numero;
        }
        while(numero !=0);
       
        System.out.println("El total es "+suma);
        }
    }
    


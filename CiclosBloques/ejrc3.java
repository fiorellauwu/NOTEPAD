/*
 * Click nbfs://nbhost/SystemFileSystem/Tem,plates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CiclosBloques;

import javax.swing.JOptionPane;

public class ejrc3 {
    public static void main(String[] args) {
     int numero;
     numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
   while(numero != 0){
    if(numero %2 == 0){
    System.out.println("El numero "+numero+" es PAR");
      }
    else{
      System.out.println("El numero "+numero+" es IMPAR");
            }
    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));
    }
    
}
}
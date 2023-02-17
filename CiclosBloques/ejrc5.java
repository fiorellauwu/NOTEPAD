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
public class ejrc5 {

    public static void main(String[] args) {
       int numero,aleatorio,contador =0;
       
       aleatorio = (int)(Math.random()*100);
          
          do{
              numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
              
         if(aleatorio > numero){
            System.out.println("Digite un numero mayor");
         }
          else{
              System.out.println("Digite un numero menor");
         }
         contador++;
          }while(numero != aleatorio); 
          System.out.println("\nGenial!! Adivinaste el numero "+contador+" intentos");
          
    
    }
    
}

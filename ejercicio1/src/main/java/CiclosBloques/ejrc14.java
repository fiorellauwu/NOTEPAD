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
public class ejrc14 {


    public static void main(String[] args) {
   float sueldo,suma=0;
   float contador=0;
    for(int i=1;i<=10;i++){
    sueldo = Float.parseFloat(JOptionPane.showInputDialog("Digite su sueldo: "));
            
      if(sueldo>1000){
         contador++;
       }     
      
      suma += sueldo;
      }
        
    System.out.println("La suma de todos los sueldos es: $"+suma);
    System.out.println("Cantidad de sueldos mayores a 1000: "+contador);
        
    }
    
    
}

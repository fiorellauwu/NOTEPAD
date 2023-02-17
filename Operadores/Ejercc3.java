/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Operadores;

import java.util.Scanner;
public class Ejercc3 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         float guillermo,luis,juan,total; 
         
         System.out.println("Cuanto dinero tiene Guillermo?: ");
         guillermo = entrada.nextFloat();
         
         luis = guillermo/2; 
         juan = (guillermo+luis)/2;
         
         total = guillermo+luis+juan;
         System.out.println("La cantidad total es: "+total);
    
    }
    
}

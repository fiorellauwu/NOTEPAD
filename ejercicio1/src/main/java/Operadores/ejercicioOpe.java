/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Operadores;

import java.util.Scanner;
public class ejercicioOpe {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         float m1,m2,resta;
         
         System.out.print("Un numero: ");
         m1 = entrada.nextFloat();
         m2 = entrada.nextFloat();
         
         resta = m1-m2;
         
         System.out.println("La resta: "+resta);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Operadores;

import java.util.Scanner;

/**
 *
 * @author PERCY
 */
public class Ejercc6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*double base = 5, exponente = 2;
        double resultado = Math.pow(base, exponente);
        (a+b)^2 = a^2+2ab+b^2
        */
        Scanner entrada=new Scanner(System.in);
        double a,b,resultado;
        
        
        System.out.print("Digitar valor de a: ");
        a = entrada.nextDouble();
        System.out.print("Digitar valor de b: ");
        b = entrada.nextDouble();
        
        
        resultado = Math.pow(a,2) + Math.pow(b,2)+ 2*((a)*(b));
        
        System.out.println("La suma de cuadrados es: "+resultado);
    }
    
    
}

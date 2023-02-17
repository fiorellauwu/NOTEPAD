/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Operadores;

import java.util.Scanner;


public class Ejercc8 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double a,b,c,resultado1,resultado2;
    
    System.out.print("Digite el valor de a: ");
    a=entrada.nextDouble();
    System.out.print("Digite el valor de b: ");
    b = entrada.nextDouble();
    System.out.print("Digite el valor de c: ");
    c = entrada.nextDouble();
    
    resultado1 = (-b+Math.sqrt(Math.pow(b,2)-4*(a*b)))/(2*a);
    resultado2 = (-b-Math.sqrt(Math.pow(b,2)-4*(a*b)))/(2*a);
    
    System.out.println("El resultado uno es: "+resultado1+" y el resultadp dos es: "+resultado2);
     
    }
    
}

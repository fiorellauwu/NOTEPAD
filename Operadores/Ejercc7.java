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
public class Ejercc7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x,h,d,s;    
        System.out.print("Digite un número de horas cualquiera: ");
        x = entrada.nextInt();
        
        s = x/168;
        d = x%168/24;
        h = x%24;
        System.out.println("son "+s+" semanas "+d+" días y "+h+" horas");

    }
    
}

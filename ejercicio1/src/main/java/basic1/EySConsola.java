/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basic1;

import java.util.Scanner;

public class EySConsola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
     float s;
     int d;
    
    
        System.out.println("Escriba su salario:");
            s =entrada.nextFloat();
        System.out.println("escriba su días:");
            d =entrada.nextInt();
        
        System.out.println("El número es:"+s/d);
    }
    
}

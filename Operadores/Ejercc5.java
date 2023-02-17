/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Operadores;

import java.util.Scanner;
public class Ejercc5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
      float participacion,primerparcial,segundoparcial,examenfinal,notafinal;
       
       
       System.out.print("Digite nota de participacion: ");
       participacion = entrada.nextFloat();
       System.out.print("Digite nota del primer parcial: ");
       primerparcial = entrada.nextFloat();
       System.out.print("Digite nota del segundo parcial: ");
       segundoparcial = entrada.nextFloat();
       System.out.print("Digite nota del examen final: ");
       examenfinal = entrada.nextFloat();
       
       participacion *= 0.10f;
       primerparcial = primerparcial * 0.25f;
       segundoparcial = segundoparcial * 0.25f;
       examenfinal = examenfinal * 0.40f;
       
       notafinal = participacion+primerparcial+segundoparcial+examenfinal;
       
       System.out.println("La nota final es: "+notafinal);
//parti+pep+ sep + ef
      
    }
    
}

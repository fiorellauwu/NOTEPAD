
package Operadores;

import java.util.Scanner;
public class Ejercc2 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Float hs,sh,multi;
        
        System.out.print("Ingrese sus horas trabajadas semanalmente: ");
        hs = entrada.nextFloat();
        System.out.print("Ingrese su salario por horas: ");
        sh = entrada.nextFloat();
        
        multi = hs*sh;
        System.out.println("El salario semanal es: "+multi);
        
    }
    
}

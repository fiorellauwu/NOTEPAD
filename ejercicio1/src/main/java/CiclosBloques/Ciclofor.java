/*
 */
package CiclosBloques;

import java.util.Scanner;

/**
 * mostrar numeros pares,creciente
 * @author fcruc
 */
public class Ciclofor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int contador;
        
        System.out.print("Digite la cantidad de terminos pares a mostrar");
        contador= entrada.nextInt();
        
        for(int i=2;i<=contador;i+=2){
            System.out.println(i);
        }
    }
    
}
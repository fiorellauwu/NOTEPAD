/*
 
 */
package CiclosBloques;

import java.util.Scanner;

/**
 *
 * @author PERCY
 */
public class CicloWhile {

   
    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in);
       int i=1,contador;
       
       System.out.print("Digite cuantos números quiere en pantalla");
       contador=entrada.nextInt();
       
       while(i<=contador){
           System.out.println(i);
           i++;
    }
    }
    
}

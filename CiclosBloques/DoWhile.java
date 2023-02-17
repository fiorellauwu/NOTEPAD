/*
 */
package CiclosBloques;

import java.util.Scanner;

/**
 * mostrar numeros pares,creciente
 * @author fcruc
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int i=20,contador;
        
        System.out.print("Digite un numero para hacer conteo decreciente: ");
        contador= entrada.nextInt();
        
        do{
            System.out.println(i);
            i--;
        }while(i<=contador&&i>=-4);
        
    }
    
}

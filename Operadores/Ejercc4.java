/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Operadores;

import java.util.Scanner;
public class Ejercc4 {

    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
      int mensual,auto,a,ventaauto,v,sm;
      
      System.out.print("ICuantos autos vendió este mes?:");
      auto = entrada.nextInt();
      System.out.print("De cuanto fue la venta de este mes?");
      ventaauto = entrada.nextInt();
      
      mensual=1000;
      a = auto*150;
      v = (int) ((0.05*ventaauto)*auto);
      sm = mensual + a + v;
        
      System.out.println("Su salario mensual es: "+sm);
    //mensual+150*auto+5%carro

    }
    
}

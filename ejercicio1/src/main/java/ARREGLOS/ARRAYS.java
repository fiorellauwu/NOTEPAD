/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 leer 5 numeros,guardarlos en un arreglo y
mostrarlos en el orden inverso al introducirlo*/
package ARREGLOS;

import java.util.Scanner;


public class ARRAYS {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);/*pedir entrada de datos*/
        float numeros[] = new float[5];/*declarar tipo de variable tipo array 5 es el numero de elementos*/
        
        System.out.print("Guardando los datos del arreglo");/*mensaje de aviso*/
        for(int i=0;i<5;i++){
            System.out.print((i+1)+". Digite 1 numero");
            numeros[i] = entrada.nextFloat();
        }
        System.out.print("Los elementos del arregoo en orden inverso son:");
        for(int i=4;i>=0;i--){
            System.out.print(i);
        }
    }
    
}

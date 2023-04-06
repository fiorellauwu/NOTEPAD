/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CiclosBloques;

import javax.swing.JOptionPane;

/**
 *
 * @author fcruc
 */
public class ejrc15 {

 
    public static void main(String[] args) {
        int edad,sumaEdad=0,conteoMayor18=0,contadorMayor175=0;
        float altura,sumaAltura=0,mediaEdad,mediaAltura;
        for(int i=1; i<=5; i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad: "));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Digite su estatura: "));
        
            sumaEdad += edad;
            sumaAltura += altura;
        
        if(edad > 18){
          conteoMayor18++;
        }
        if(altura>1.75){
          contadorMayor175++;
        }
       }
     mediaEdad = (float) sumaEdad/5;
     mediaAltura = (float) sumaAltura/5;
        
     System.out.println("La edad promedio es : "+mediaEdad);
     System.out.println("La estatura promedio es: "+mediaAltura);
     System.out.println("Cantiadd de alumnos mayores a 18 es: "+conteoMayor18);
     System.out.println("Cantiadad de aliumnos que miden mayor a 1.75 es:"+contadorMayor175);
    }
    
}

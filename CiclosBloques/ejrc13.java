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
public class ejrc13 {

    
    public static void main(String[] args) {
        
        int numero, suma_pos=0, conteo_pos=0, suma_neg=0, conteo_neg=0,conteo_ceros=0;
        float media_pos, media_neg;
        for(int i=1;i<=10;i++){
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número :"));
            if(numero == 0){
                conteo_ceros++;
            }
            else if(numero>0){
                suma_pos += numero;
                conteo_pos++;
            }
            else{
                suma_neg += numero;
                conteo_neg++;
            }
            //tratamos con los positivos
            if(conteo_pos==0){
                System.out.println("No se puede saca la media de los positivos");
            }
            else{
                media_pos = (float) suma_pos/conteo_pos;
                System.out.println("La media de los numeros positivos es: "+media_pos);    
            }            
            //tratamos con los negativos
            if(conteo_neg==0){
            System.out.println("No se puede sacar la media de los negativos");
            }
            else{
                media_neg = (float) suma_neg/conteo_neg;
                System.out.println("La media de los numero negativos es:"+media_neg);
            }
            System.out.println("La cantidad de ceros es: "+conteo_ceros);
        }
        }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CiclosBloques;

import javax.swing.JOptionPane;


public class Ejrc {

    
    public static void main(String[] args) {
        
        int numero, cuadrado;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while(numero>=0){
            cuadrado=(int)Math.pow(numero,2);
         
            JOptionPane.showMessageDialog(null,"El numero "+numero+" elevado al cuadrado es: "+cuadrado);
            numero=Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        
        
        
    }
    
}

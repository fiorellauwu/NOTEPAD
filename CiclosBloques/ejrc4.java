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
public class ejrc4 {
    
    public static void main(String[] args) {
        int numero,contador = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    while(numero>=0){
     contador++;
     
     numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
    }
    System.out.println("Ha introducido "+contador+" no negativos");
    }
    
}

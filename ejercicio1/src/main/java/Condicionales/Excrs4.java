/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author PERCY
 */
public class Excrs4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Double monto;
       Double desct;
       monto=Double.parseDouble(JOptionPane.showInputDialog("Digite su monto total de pago: "));
       
       if (monto>300){
       desct = monto-(monto*0.2);
       JOptionPane.showMessageDialog(null,"Accedió al 20% de descuento, monto totala pagar es de: "+desct);
       }
       else{
       JOptionPane.showMessageDialog(null,"Monto insuficiente para descuento, total a pagar: "+monto);
       }
       
       
       
    }
    
}

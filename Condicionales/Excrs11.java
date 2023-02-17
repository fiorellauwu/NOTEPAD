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
public class Excrs11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,sum,rest,mult,div;
        char operacion;
        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero:"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
       
        operacion=JOptionPane.showInputDialog("Digite la operacion que desea realizar").charAt(0);
        switch (operacion){
            case 's':
            case 'S':sum=n1+n2;
                JOptionPane.showMessageDialog(null,"La suma es"+sum);
                break;
            case'r':
            case'R':rest=n1-n2;
                JOptionPane.showMessageDialog(null,"La resta es"+rest);
                break;
            case'P':
            case'p':
            case'M':
            case'm':mult=n1*n2;
                JOptionPane.showMessageDialog(null,"La multiplicacion es: "+mult);
                break;
            case'D':    
            case'd':div=n1/n2;
                JOptionPane.showMessageDialog(null,"La division es: "+div);
                break;
        }
    }
    
}

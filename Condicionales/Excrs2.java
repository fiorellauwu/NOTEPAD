/* 
 pedir dos numeros y decir cual es mayor o si son iguales

*/
package Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author PERCY
 */
public class Excrs2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numeor cualquiera"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero cualquiera"));
        
        if (n1>n2){
        JOptionPane.showMessageDialog(null,n1+" es mayor a "+n2);
        
        }
        if(n2>n1){
        JOptionPane.showMessageDialog(null,n2+" es mayor a "+n1);
        }
        else{
        JOptionPane.showMessageDialog(null,n1+" es igual a "+n2);
        }
     
    }
    
}

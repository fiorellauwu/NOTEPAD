/*
 convertidor de kg a otras unidades, con opciones
 */
package Condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author PERCY
 */
public class Excrs14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float medida;
        int opcion;
                
        medida=Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de kilogramos"));
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Menú\n"
        +"1. Hectogramos\n"
        +"2. Decagramos\n"
        +"3. Granos\n"
        +"4. Decigramos\n"
        +"5. Centigramos\n"
        +"6. Miligramos\n"));
        
        
        switch(opcion){
            case 1: medida *= 10;
                   JOptionPane.showMessageDialog(null,"La nueva medida en Hectogramos es: "+medida);
                   break;
            case 2: medida *= 100;
                   JOptionPane.showMessageDialog(null,"La nueva medida en Decagramos es: "+medida);
                   break;
            case 3: medida *= 1000;
                   JOptionPane.showMessageDialog(null,"La nueva medida en Gramos es: "+medida);
                   break;
            case 4: medida *= 10000;
                   JOptionPane.showMessageDialog(null,"La nueva medida en Decigramos es: "+medida);
                   break;
            case 5: medida *= 100000;
                   JOptionPane.showMessageDialog(null,"La nueva medida en Centigramos es: "+medida);
                   break;
            case 6: medida *= 1000000;
                   JOptionPane.showMessageDialog(null,"La nueva medida en Hectogramos es: "+medida);
                   break;
            default:JOptionPane.showMessageDialog(null,"Opción erronea");
                   break;
                   
        }
    }
    
}

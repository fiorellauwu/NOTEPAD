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
public class Excrs12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float nota;
        nota=Float.parseFloat(JOptionPane.showInputDialog("Digite una not del 1 al 10"));
        
        if(nota<=10&&nota>=8){
        JOptionPane.showMessageDialog(null, nota+" Sobresaliente");
        }
        else if(nota<8&&nota>=6){
        JOptionPane.showMessageDialog(null, nota+" Notable");
        }
        else if(nota<6&&nota>=4){
        JOptionPane.showMessageDialog(null, nota+" Bien");
        }
        else if(nota<4&&nota>=2){
        JOptionPane.showMessageDialog(null, nota+" Suficiente");
        }
        else if(nota<2&&nota>=0){
        JOptionPane.showMessageDialog(null, nota+" insuficiente");
        }
        else{
        JOptionPane.showMessageDialog(null, nota+" Nota inválida");
        }
        }
    }
    


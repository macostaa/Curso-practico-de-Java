/*
Pedir números hasta que se introduzca uno negativo y calcular la media
 */
package b4_e07_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class B4_e07_Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float suma=0, num;
        int cont=0;
        
        num=Float.parseFloat(JOptionPane.showInputDialog("Entre un número mayor o igual que 0"));
        while(num>=0){
           cont++;
           suma+=num;
           num=Float.parseFloat(JOptionPane.showInputDialog("Entre otro número mayor o igual que 0"));
        }
        
        //media e imprimir
        if(cont>0){
            System.out.println("La media es " +(suma/cont));
        }        
    }
    
}

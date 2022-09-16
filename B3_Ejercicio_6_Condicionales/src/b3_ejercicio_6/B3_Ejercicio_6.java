/*
 tomar dos números y decir si ambos son pares o impares
 */
package b3_ejercicio_6;

import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class B3_Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        int b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número"));
        
        if((a%2==0)&&(b%2==0)){
            JOptionPane.showMessageDialog(null, "Ambos números son pares");
            }
        else if ((a%2==1)&&(b%2==1)){
            JOptionPane.showMessageDialog(null, "Ambos números son impares");
        }else JOptionPane.showMessageDialog(null, "Uno de los números es par y el otro impar");
        
    }    
}

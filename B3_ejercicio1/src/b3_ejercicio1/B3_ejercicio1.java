/*
decir si un número entrado es múltiplo de 10
 */
package b3_ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class B3_ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //entrada de datos
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número y le diré si es múltiplo de 10"));
        //salida
        JOptionPane.showMessageDialog(null, ((num%10==0)? num +" es múltiplo de 10" : num+" no es múltiplo de 10"));        
    }
    
}

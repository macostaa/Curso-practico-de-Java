/*
 pedir 10 números y devolver su suma
 */
package b4_e10_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class B4_e10_Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma=0;
        for(int i=10;i>=1;i--){
            suma+=Integer.parseInt(JOptionPane.showInputDialog("Entre un número"));
        }
        System.out.println("La suma es "+suma);
    }
    
}

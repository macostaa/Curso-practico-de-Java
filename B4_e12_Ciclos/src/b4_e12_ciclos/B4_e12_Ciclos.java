/*
Factorial de un número dado
 */
package b4_e12_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author macostaa
 */
public class B4_e12_Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long factorial=1;
        int num=Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        
        for(int i=num; i>0;i--){
            factorial*=i;
        }
        System.out.println("El factorial de "+num+" es "+factorial);
    }
}

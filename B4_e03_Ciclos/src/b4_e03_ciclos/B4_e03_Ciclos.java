/*
entrar números uno a uno y decir si son pares o impares
el ciclo termina si introduces un cero
 */
package b4_e03_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author macostaa
 */
public class B4_e03_Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número distinto de 0"));
        while(num!=0){
            System.out.println((num%2==0)? +num+" es par": +num+" es impar");
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca otro número distinto de 0"));
        }
    }
    
}

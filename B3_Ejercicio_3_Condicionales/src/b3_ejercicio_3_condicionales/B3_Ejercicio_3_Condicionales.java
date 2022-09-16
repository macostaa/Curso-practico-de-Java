/*
 programa que lea un caracter y compruebe si es una letra mayúscula
 */
package b3_ejercicio_3_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author macostaa
 */
public class B3_Ejercicio_3_Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //entrada
        char caracter = JOptionPane.showInputDialog("Introduzca un caracter").charAt(0);
        //salida
        JOptionPane.showMessageDialog(null, (Character.isUpperCase(caracter))? "Es una letra mayúscula": "No es una letra mayúscula");
    }

}

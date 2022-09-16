/*
 cuántas cifras tiene un número entre 0 y 99 999
 */
package b3_ejercicio_8_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class B3_Ejercicio_8_Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String num =JOptionPane.showInputDialog("Introduzca un número entre 0 y 99 999");
        JOptionPane.showMessageDialog(null, "El número "+num+ " tiene "+num.length()+" digitos");
    }
    
}

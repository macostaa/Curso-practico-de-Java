/*
 recibir 2 números, decir cual es el mayor o si son  iguales*/
package b3_ejercicio2_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class B3_Ejercicio2_Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b;
        //entrada
        a = Integer.parseInt(JOptionPane.showInputDialog("Este es un programa diseñado para comparar dos números.\nIngrese un número"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número"));

        //evaluación y salida
        if (a == b) {
            JOptionPane.showMessageDialog(null, "Ambos números son igaules");
        } else if (a > b) {
            JOptionPane.showMessageDialog(null, a + " es mayor que " + b);
        } else {
            JOptionPane.showMessageDialog(null, b + " es mayor que " + a);
        }
    }
}

/*
Hacer una calculadora capaz de multiplicar, dividir, sumar o restar un par de números.
Se reciben los números y el comando.
Suma: S, s, *
Resta: R, r, -
División: D, d, /
Multiplicación: M, m, P, p, *
 */
package b3_ejercicio_11_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class B3_Ejercicio_11_Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //entrada de datos
        float x = Float.parseFloat(JOptionPane.showInputDialog("Entre un número X"));
        float y = Float.parseFloat(JOptionPane.showInputDialog("Entre un número Y"));
        char op = JOptionPane.showInputDialog("Indique la operación que desea realizar").charAt(0);
        
        //operación y salida
        switch (op){
            //suma
            case 'S':
            case 's': 
            case '+': JOptionPane.showMessageDialog(null, x+" + "+y+" = "+(x+y));break;
            //resta
            case 'R':
            case 'r': 
            case '-': JOptionPane.showMessageDialog(null, x+" - "+y+" = "+(x-y));break;
            //multiplicación
            case 'M':
            case 'm': 
            case 'P':
            case 'p': 
            case '*': JOptionPane.showMessageDialog(null, x+" * "+y+" = "+(x*y));break;
            //división
            case 'D':
            case 'd': 
            case '/': JOptionPane.showMessageDialog(null, x+" / "+y+" = "+(x/y));break;
            default: JOptionPane.showMessageDialog(null, "Ha ocurrido un error");break;
        }
        
        
    }
    
}

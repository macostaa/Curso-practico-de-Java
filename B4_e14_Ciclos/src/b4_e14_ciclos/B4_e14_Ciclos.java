/*
pedir 10 sueldos, mostrar la suma de todos y decir cuántos son mayores que 1000
 */
package b4_e14_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class B4_e14_Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float suma=0;
        int cont=0;
        
        for (int i = 0; i < 10; i++) {
            float sueldo = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el sueldo"));
            suma+=sueldo;
            if(sueldo>1000) cont++;
        }
        System.out.println("La suma de los 10 sueldos es $"+suma);
        System.out.println("Hay un total de "+ cont+" sueldos mayores de $1000");
    }
    
}

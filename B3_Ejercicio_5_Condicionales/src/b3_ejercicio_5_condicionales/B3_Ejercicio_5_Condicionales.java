/*
calcular sueldo semanal
si trabaja 40h o menos, se paga $16 por hora
Si trabaja más de 40h, se paga $16 por hora las 1ras 40 horas + $20 por cada hora extra
 */
package b3_ejercicio_5_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class B3_Ejercicio_5_Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantH, sueldo=0;
        cantH=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas semanales trabajadas"));
         if(cantH>40){
             sueldo+=(cantH-40)*20;
             cantH=40;
         }
         sueldo+=cantH*16;
         JOptionPane.showMessageDialog(null, "Su sueldo total es "+sueldo );
    }
    
}

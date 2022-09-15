/*
Gillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo.
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
Hacer un programa que calcule e imprima la cantidad de dinero que tienen los tres.
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author macostaa
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        float g, l, j, t=0;
        System.out.print("Digite la cantidad de dinero que tiene Guillermo: ");
        g= entrada.nextFloat();
        l=g/2;
        j=(g+l)/2;
        t=g+l+j;
        
        System.out.println("Luis tiene "+l+" y Juan tiene "+j+".\nEntre los tres tienen un total de "+t);
    }
    
}

/*
Hacer un programa que calcule e imprima el salario semanal de un empleado
a partir de sus horas semanales trabajadas y de su salario por horas
 */
package ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author macostaa
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantHoras;
        float sHoras, sSemanal;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzaca la cantidad de horas semanales trabajadas: ");
        cantHoras = entrada.nextInt();
        System.out.print("Introduzaca el sueldo por hora: ");
        sHoras = entrada.nextFloat();
        sSemanal = cantHoras*sHoras;
        
        System.out.println("\nSu sueldo semanal es: "+sSemanal);
    }
    
}

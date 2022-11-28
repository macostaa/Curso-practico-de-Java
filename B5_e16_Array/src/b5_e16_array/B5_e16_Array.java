/*
 ler las notas de 5 estudiantes en 3 trimestres diferntes
devolver la media por semestre
devolver la media de un estudiante N
 */
package b5_e16_array;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class B5_e16_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int[][]notas=new int[3][5];
        
        System.out.println("Entrando las notas por trimestre");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nTrimestre "+(i+1));
            {
                for (int j = 0; j < 5; j++) {
                    System.out.print("Nota del estudiante "+(j+1)+": ");
                    notas[i][j]=entrada.nextInt();
                }
            }
        }
        System.out.println("\nLa nota media por trimestre es la siguiente: ");
        float[]mediaTrimestre=new float[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                mediaTrimestre[i]+=notas[i][j];
            }
            mediaTrimestre[i]/=5;
            System.out.println("Trimestre "+(i+1)+": "+mediaTrimestre[i]);
        }
        
        System.out.print("\nPara conocer la nota promedio de un estudiante en específico, digite su número en la lista: ");
        int estudiante=(entrada.nextInt())-1;
        float mediaIndividual = 0;
        for (int i = 0; i < 3; i++) {
            mediaIndividual+=notas[i][estudiante];
        }
        mediaIndividual/=3;
        System.out.println("La nota promedio del estudiante "+(estudiante+1)+" es: "+mediaIndividual);
        
        
    }
    
}

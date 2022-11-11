/*
leer dos listas de 10 números A y B
mezclar ambas listas en una tercera lista C de la siguiente forma 1ro de A, 1ro de b, 2do de A, 2do de B...
 */
package b5_e05_array;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class B5_e05_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int[]a=new int[10];
        int[]b =new int[10];
        int[]c=new int[20];
        
        System.out.println("Leyendo los valores de la tabla A");
        for (int i = 0; i < 10; i++) {
            System.out.print(i+1+". Entre un número: ");
            a[i]=entrada.nextInt();
        }
        System.out.println("\nLeyendo los valores de la tabla B");
        for (int i = 0; i < 10; i++) {
            System.out.print(i+1+". Entre un número: ");
            b[i]=entrada.nextInt();
        }
        //llenando la tabla C
        int j=0;
        for (int i = 0; i < 10; i++) {
            c[j]=a[i];
            j++;
            c[j]=b[i];
            j++;
        }
        System.out.println("Tabla C");
        for (int i = 0; i < 20; i++) {
            System.out.print(c[i]+" ");
        }
    }    
}

/*
leer 2 tablas de 12 elementos numéricos
mezclarlos en una 3ra tabla: 3 de A, 3 de B, 3 de A, 3 de B...
 */
package b5_e06_array;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class B5_e06_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []a,b,c;
        a=new int[12];
        b=new int[12];
        c=new int[24];
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Entrando valores de la tabla A");
        for (int i = 0; i < 12; i++) {
            System.out.print((i+1)+". Entre un número: ");
            a[i]=entrada.nextInt();
        }
        System.out.println("\nEntrando valores de la tabla B");
        for (int i = 0; i < 12; i++) {
            System.out.print((i+1)+". Entre un número: ");
            b[i]=entrada.nextInt();
        }
        //mezclando A y B
        int aux=0;
        for (int i = 0; i < 12; i+=3) {
            c[aux]=a[i];
            aux++;
            c[aux]=a[i+1];
            aux++;
            c[aux]=a[i+2];
            aux++;
            c[aux]=b[i];
            aux++;
            c[aux]=b[i+1];
            aux++;
            c[aux]=b[i+2];
            aux++;
        }
         System.out.println("\nLista C");
        for(int i:c){
            System.out.print(i +" ");
        }
    }
    
}

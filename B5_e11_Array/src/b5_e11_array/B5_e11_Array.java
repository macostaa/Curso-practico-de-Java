/*
craer una tabla de 10 elemento con 5 elementos ordenados adcendentemente
introducir un 6to número y ubicarlo en l lugar que le toca para que la tabla siga etsando ordenada
 */
package b5_e11_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class B5_e11_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[]={10,20,30,40,50,0,0,0,0,0};
        
        System.out.println(Arrays.toString(arreglo));
        System.out.print("Entre un número y será insertado adecuadamente en la anterior lista ascendente: ");
        int numero=entrada.nextInt();
        
        //insertar número
        for (int i = 0; i<arreglo.length-1; i++) {    
            if(arreglo[i]>numero){
                int aux=arreglo[i];
                arreglo[i]=numero;
                numero=aux;
            }
        }
        arreglo[5]=numero;
        
        System.out.println(Arrays.toString(arreglo));
        
        
        
    }
    
}

/*
leer 10 elementos, guardarlos en un arreglo
poner los pares en un 2do arreglo y los impares en un 3er arreglo
 */
package b5_e13_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class B5_e13_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int[] num=new int[10];
        int[]impar=new int[10];
        int[]par=new int[10];
        int contP=0, contI=0;
        
        System.out.println("A continuación debe introducir 10 números");
        for (int i = 0; i < 10; i++) {
            System.out.print(i+1 +". Digite un número: ");            
            num[i]=entrada.nextInt();
            if(num[i]!=0){                
                if(num[i]%2==0){
                    par[contP]=num[i];
                    contP++;
                }
                else {
                    impar[contI]=num[i];
                    contI++; 
                }
            }
        }
        
        //salida
        System.out.println("\nLista origial: "+Arrays.toString(num));
        
        //impares
        if(contI>0){
            int[]im=new int[contI];
            impar=Arrays.copyOf(impar,contI);            
            System.out.println("Números impares: "+Arrays.toString(impar));
        }
        
        //pares
        if(contP>0){
            int[]p=new int[contP];
            par=Arrays.copyOf(par,contP);            
            System.out.println("Números pares: "+Arrays.toString(par));
        }
    }
}

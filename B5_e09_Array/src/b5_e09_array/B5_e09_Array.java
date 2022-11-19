/*
 entrar 5 números por teclado
desplazar los números en el arreglo: el 1ro de 2do, el 2do de 3ro... el último de 1ro
 */
package b5_e09_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class B5_e09_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[]num=new int[5];
       Scanner entrada=new Scanner(System.in);
       
        System.out.println("Entre 5 números del arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+". Entre un número: ");
            num[i]=entrada.nextInt();
        }
        
        //desplazamiento
        int aux=num[num.length-1];
        for (int i = num.length-1; i>0; i--) {
            num[i]=num[i-1];
        }
        num[0]=aux;
        
        System.out.println("\nEl nuevo arreglo es: "+Arrays.toString(num));
    }
}

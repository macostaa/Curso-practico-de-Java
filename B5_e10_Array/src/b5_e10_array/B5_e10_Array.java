/*
Entrar 10 números en un arreglo y hacer un desplazamiento de N posiciones, similar al ejercicio 9 donde N era igual a 1
 */
package b5_e10_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class B5_e10_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []num=new int[10];
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Llenar tabla de 10 elementos");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Entre un número: ");
            num[i]=entrada.nextInt();
        }
        System.out.print("\nDigite la cantidad de posiciones (entre 1 y 9) que desea desplazar: ");
        int cant=entrada.nextInt();
        
        //desplazamiento
        for(int i=0;i<cant;i++){
            int ultimo=num[num.length-1];
            for (int j = num.length-1; j >0; j--) {
                num[j]=num[j-1];
            }
            num[0]=ultimo;
        }
        
        
        //salida
        System.out.println("\nTabla desplazada en "+cant+" posisiciones");
        System.out.println(Arrays.toString(num));
    }
}    

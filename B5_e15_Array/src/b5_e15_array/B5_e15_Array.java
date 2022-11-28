/*
leer 5 números ordenados, leer un 6to número y decir si está y en qué posición del arreglo entrado
 */
package b5_e15_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class B5_e15_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Scanner entrada=new Scanner(System.in);
        int[]num=new int[5];
        
        //entrada del arreglo
        System.out.println("Entre 5 números ordenados ascendentemente");
        System.out.print("1. Entre un número: ");
        num[0]=entrada.nextInt();
        for (int i = 1; i < 5; i++) {
            System.out.print(i+1+". Entre un número: ");
            int aux=entrada.nextInt();
            if(num[i-1]<=aux){
                num[i]=aux;
            }
            else{
                System.err.println("Entrada incorrecta, "+aux+" es menor que "+num[i-1]);
                i--;
            }
        }
        
        System.out.println("\n"+Arrays.toString(num));
        System.out.print("Entre un número: ");
        int n=entrada.nextInt();
        
        //comprobar la existencia en el arreglpo del númeron N y determinar la posición
        int aux2=-1;       
        int i=0;
        while (i<5 && aux2==-1) {            
            if (num[i]==n) {
                aux2=i;
            }
            i++;
        }
        
        //salida
        System.out.println((aux2>-1)
                ?"El número "+n+" se encuentra en la posición "+(aux2+1)+" del arreglo"
                :"El número "+n+" no se encuentra en el arreglo");
    }
}

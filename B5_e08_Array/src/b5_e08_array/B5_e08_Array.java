/*
crear tabla de 10 elementos, entrar 8
pedir un 9no elemnto e insertarlo en la posición que diga el usuario desplazando los demás números d ela tabla
 */
package b5_e08_array;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class B5_e08_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num[]=new int[10];
        Scanner entrada=new Scanner(System.in);
        
        //llenar tabla con 8 números
        System.out.println("Entre 8 números");
        for (int i = 0; i < 8; i++) {
            System.out.print((i+1)+". Entre un número: ");
            num[i]=entrada.nextInt();
        }
        
        //pedir nuevo número y posición
        System.out.print("\nEntre un nuevo número: ");
        int nuevo=entrada.nextInt();
        System.out.print("Indique en qué posición del 1 al 10 desea colocarlo: ");
        int posicion=entrada.nextInt()-1;
        
        //reordenamiento
        /*int aux;
        for (int i = posicion; i < 10; i++) {
            aux=num[i];
            num[i]=nuevo;
            nuevo=aux;
        }*/
        for (int i = num.length-1; i > posicion; i--) {
            num[i]=num[i-1];
        }
        num[posicion]=nuevo;
        
        //salida
        System.out.println("\nValores actualizados:");
        for (int i = 0; i < num.length; i++) 
            System.out.print(num[i]+" ");
    }
}

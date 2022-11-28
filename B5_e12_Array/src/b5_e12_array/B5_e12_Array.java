/*
Un arreglo de 10 elementos, eliminar un elemento indicando la posición en la que se halla
No dejar espacios vacíos
 */
package b5_e12_array;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class B5_e12_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[]tabla={10,20,30,40,50,60,70,80,90,100};
        System.out.println("Tenemos la siguiente lista: ");
        for (int i = 0; i < 10; i++)
            System.out.print(tabla[i]+" ");
        int posicion;
        
        //entrada de la posición
        do{
            System.out.print("\n\nDigite la posición del 1 al 10 en la que se encuentra el número que desea eliminar: ");
            posicion=entrada.nextInt();
        }while(posicion<1 || posicion>10);
        
        posicion--;
        //eliminar posición
        for (int i = posicion; i < tabla.length-1; i++)
            tabla[i]=tabla[i+1];       
        tabla[tabla.length-1]=0;
        //salida
        System.out.println("\nEl resultado es: ");
        for (int i = 0; i < 9; i++)
            System.out.print(tabla[i]+" ");
        
    }
    
}

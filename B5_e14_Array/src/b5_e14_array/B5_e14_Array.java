/*
leer 2 series de 5 números ordenadas ascendentemente
fusionarlas en un 3er arreglo
 */
package b5_e14_array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author home
 */
public class B5_e14_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int[]arr1=new int[5];
        int[]arr2=new int[5];
        int[]arr3=new int[10];
        
        System.out.println("Introduciendo los primeros 5 números. Deben estar ordenados ascendentemente");        
        int cont=0;
        System.out.print(cont+1+". Digite un número: ");  
        arr1[cont]=entrada.nextInt();  
        cont++;
        do{
            System.out.print(cont+1+". Digite un número: ");
            int aux=entrada.nextInt();
            if(aux>=arr1[cont-1]){
                arr1[cont]=aux;
                cont++;
            }
            else{
                System.err.println("El número "+aux+ " no es mayor que "+arr1[cont-1]);
            }            
        }while (cont<5); 
        
        
        
        System.out.println("\nIntroduciendo los segundos 5 números. Deben estar ordenados ascendentemente");
        cont=0;
        System.out.print(cont+1+ ". Digite un número: ");
        arr2[cont]=entrada.nextInt();
        cont++;
        do{
            System.out.print(cont+1+". Digite un número: ");
            int aux=entrada.nextInt();
            if(aux>=arr2[cont-1]){
                arr2[cont]=aux;
                cont++;
            }
            else{
                System.err.println("El número "+aux+ " no es mayor que "+arr2[cont-1]);
            }            
        }while (cont<5);
        
        //mezclar arreglos
        
        /* VARIANTE 1 USANDO MÉTODOS PREDETERMINADOS
        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
        Arrays.sort(arr3);*/
        
        
        /*VARIANTE 2 UNIENDO 2 ARREGLOS Y USANDO SORT
        for (int i = 0; i < 5; i++) {
            arr3[i]=arr1[i];
            arr3[i+5]=arr2[i];
        }
        Arrays.sort(arr3);*/
        
        
        
        //VARIANTE A LO BESTIA
        int indice1=0, indice2=0, indice3=0;
        while(indice1<arr1.length&&indice2<arr2.length){
            if(arr1[indice1]<=arr2[indice2]){
                arr3[indice3]=arr1[indice1];
                indice1++;
            }
            else{
                arr3[indice3]=arr2[indice2];
                indice2++;
            }
            indice3++;
        }
        
        if (indice1==arr1.length) {
            while (indice2<arr2.length) {                
                arr3[indice3]=arr2[indice2];
                indice2++;
                indice3++;
            }
        }
        else{
            while (indice1<arr1.length) {                
                arr3[indice3]=arr1[indice1];
                indice1++;
                indice3++;
            }
        }
        System.out.println("\nPrimer listado de números: "+Arrays.toString(arr1));
        System.out.println("Segundo listado de números: "+Arrays.toString(arr2));
        System.out.println("Fusión de ambos listados: "+Arrays.toString(arr3));
    }
    
}

/*
leer 5 números, guardarlos en un arreglo y luego mostrarlos en el orden inverso en que fueron introducidos
 */
package b5_e02_array;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class B5_e02_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num[]=new int[5]; 
        
        System.out.println("Recibiendo datos");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+". Entre un número: ");
            num[i]=entrada.nextInt();            
        }
        System.out.println("\nMostrando datos");
        for (int i = num.length-1; i >=0; i--) {
            System.out.print(num[i]+" ");
        }
 {
            
        }
    }
    
}

/*
leer 5 números, guardarlos en un arreglo y luego mostrarlos en el mismo orden en que fueron introducidos
 */
package b5_e01_array;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class B5_e01_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]num=new int[5];
        Scanner entrada=new Scanner(System.in);
        
        System.out.print("Recibiendo datos\n");
        for (int i = 0; i < 5; i++) {
            System.out.print((i+1)+". Entre un úmero: ");
            num[i]=entrada.nextInt();
        }
        
        System.out.print("\nMostrando los datos introducidos\n");
        for(int i:num){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    
}

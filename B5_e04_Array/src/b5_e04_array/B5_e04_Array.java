/*
leer 10 números
mostrarlos 1ro, último, 2do, penúltimo, 3ro, antepenúltimo...
 */
package b5_e04_array;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class B5_e04_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[]num=new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+". Entre un número: ");
            num[i]=entrada.nextInt();
        }
        
        for(int i=0;i<5;i++){
            System.out.print(num[i]+" "+num[9-i]+" ");
        }
    }
}

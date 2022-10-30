/*
leer un # e indicar si es positivo o negativo
repetir el proceso hasta que se introduzca el 0
 */
package b4_e02_ciclos;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class B4_e02_Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //entrada
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite un número distinto de 0: ");
        int num = entrada.nextInt();
        //salida
        while(num!=0){
            System.out.println((num>0)?num+" es positivo":num+" es negativo");
            System.out.print("Digite otro número distinto de 0: ");
            num =entrada.nextInt();
        }
        System.out.println("Ha digitado 0");
        
    }
    
}

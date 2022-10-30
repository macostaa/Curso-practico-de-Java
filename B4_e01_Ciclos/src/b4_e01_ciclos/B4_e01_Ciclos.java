/*
leer un número, mostrar su cuadrado, repetir la operación hasta que encuentre un número negativo
 */
package b4_e01_ciclos;

import java.util.Scanner;

/**
 *
 * @author macostaa
 */
public class B4_e01_Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //entrada de datos
        Scanner entrada =new Scanner(System.in);             
        System.out.print("Ente un número mayor o igual a cero y te mostraé su cuadrado: ");
        float num =entrada.nextFloat();
        
        //salida cíclica
        
        while (num>=0) {
            System.out.println(num+ "² = " +Math.pow(num, 2));
            System.out.print("Ente otro número mayor o igual a cero: ");
            num=entrada.nextFloat();
        }
                
        System.out.println(num+" nos es mayor o igual a cero");
        
    }
    
}

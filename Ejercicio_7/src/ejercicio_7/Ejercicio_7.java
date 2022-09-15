/*
 a partir de un número X de horas calcular semanas, días y horas
 */
package ejercicio_7;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class Ejercicio_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int h, s, d;
        
        //entada de datos
        System.out.print("Digite la cantidad de horas: ");
        h=entrada.nextInt();
        
        //calculo
        s=h/168;
        d=h%168/24;
        h%=24;
        
        System.out.println("El equivalente es:\n"+s+" semanas\n"+d+" días\n"+h+" horas");
    }
    
}

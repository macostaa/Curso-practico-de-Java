/*
 imprimir el cuadrado de una suma
(a + b)²
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c;
        
        //introducir los datos
        System.out.print("Este es un programa para calcular (a + b)².\nDigite el valor de a: ");
        a=entrada.nextDouble();
        System.out.print("Digite el valor de b: ");
        b=entrada.nextDouble();
        
        //calcular
        c= (Math.pow(a,2))+(Math.pow(b,2))+(2*a*b);
        
        //imprimir
        System.out.println("Resultado: \n("+a+" + "+b+")²\n= "+a+"² + "+b+"² + 2*"+a+"*"+b+"\n= "+c);        
    }    
}

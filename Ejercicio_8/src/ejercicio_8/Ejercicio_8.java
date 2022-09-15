/*
raíces de una ecuación de segundo grado
ax²+bx+c=0
con la entrada a=1, b=0 y c=-1 debe arrojar los resultados 1.0 y -1.0
 */
package ejercicio_8;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class Ejercicio_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, x1, x2;
        
        //entrada de datos
        System.out.print("Este es un programa para calcular ax²+bx+c=0.\nDigite el valor de a: ");
        a=entrada.nextDouble();
        System.out.print("Digite el valor de b: ");
        b=entrada.nextDouble();
        System.out.print("Digite el valor de c: ");
        c=entrada.nextDouble();
        
        //cálculo
        x1=(-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        x2=(-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a);
        
        System.out.println("\nEl resultado es: \n"+x1+"\n"+x2);
        
    }
    
}

/*
Calcular el sueldo mensual de un vendedor de carros.
1000 + (150*cantidad de carros vendidos) + 5% del valor de cada carro vendido.
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int salarioBasico=1000;
        int cantCarrosVendidos;
        float valorCarro, total;
        
        Scanner entrada= new Scanner(System.in);
        System.out.print("Digite la cantidad de carros vendidos: ");
        cantCarrosVendidos=entrada.nextInt();
        
        System.out.print("Digite el valor de los carros vendidos: ");
        valorCarro=entrada.nextFloat();
     
        total=salarioBasico+(150*cantCarrosVendidos)+(valorCarro*0.05f*cantCarrosVendidos);
        
        System.out.println("\nEl sueldo del trabajador para este mes será "+total);
        
    }
    
}

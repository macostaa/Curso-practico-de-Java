/*
Calcular nota final de un estudiante teniendo en cuenta que esta se calcula de acuerdo a las siguientes ponderaciones:
participación -> 10%
1er examen parcial -> 25%
2do examen parcial -> 25%
examen final -> 40%

 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float participacion, examen1,examen2,examenfinal,notafinal;
        Scanner entrada=new Scanner(System.in);
        
        //solicitar los datos
        System.out.print("Digite la nota de su participación: ");
        participacion=entrada.nextFloat();
        System.out.print("Digite la nota de su primer examen parcial: ");
        examen1=entrada.nextFloat();
        System.out.print("Digite la nota de su segundo examen parcial: ");
        examen2=entrada.nextFloat();
        System.out.print("Digite la nota de su examen final: ");
        examenfinal=entrada.nextFloat();
        
        //calcular la nota final
        notafinal=(participacion*0.1f)+(examen1*0.25f)+(examen2*0.25f)+(examenfinal*0.4f);
        
        //imprimir la nota final
        System.out.println("Su nota final es: "+notafinal);
        
    }
    
}

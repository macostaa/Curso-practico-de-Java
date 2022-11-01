/*
leer 5 números, guardarlos en un arreglo, dar la media de los +, media de los - y cantidad de ceros
 */
package b5_e03_array;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class B5_e03_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[]numeros=new float[5];
        int contP=0, contN=0, cont0=0;
        float sumaP=0f, sumaN=0f;
        
        System.out.println("Entrada de datos");
        for(int i=0;i<5;i++){
            System.out.print((i+1)+". Entre un número: ");
            numeros[i]=entrada.nextFloat();
            if(numeros[i]==0){
                cont0++;
            }else if(numeros[i]>0){
                contP++;
                sumaP+=numeros[i];
            }else{
                contN++;
                sumaN+=numeros[i];
            }
        }
        
        System.out.println("Cantidad de ceros introducida: "+cont0);
        System.out.println(contP==0?"No se introdujeron números positivos":"Introdujo "+contP+" números positivos. La media de ellos es: "+(sumaP/contP));
        System.out.println(contN==0?"No se introdujeron números negativos":"Introdujo "+contN+" números negativos. La media de ellos es: "+(sumaN/contN));
        
    }
    
}

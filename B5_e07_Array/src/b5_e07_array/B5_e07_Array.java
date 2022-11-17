/*
leer 3 números y decir si están ordenado ascendentemente, descendentemente o si están desordenados
 */
package b5_e07_array;

import java.util.Scanner;

/**
 *
 * @author home
 */
public class B5_e07_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int []num=new int[3];
        Scanner entrada=new Scanner(System.in);
        
        boolean desc=false, asc=false;
        System.out.println("Entre 3 númeors");
        for (int i = 0; i < 3; i++) {
            System.out.print((i+1)+". Entre un número: ");
            num[i]=entrada.nextInt();
        }
        
        for (int i = 0; i < 2; i++) {
            if(num[i]>num[i+1]){
                desc=true;
            }
            if(num[i]<num[i+1]){
                asc=true;
            }
        }
        
        if(asc==true && desc==false){
            System.out.println("Los números están ordenados ascendentemente");
        }else if (desc==true && asc==false){
            System.out.println("Los números están ordenados descendentemente");
            }
        else if(asc==true && desc==true){
            System.out.println("Los números están desordenados");
        }
        else{
            System.out.println("Todos los números son iguales");
        }            
    }
}
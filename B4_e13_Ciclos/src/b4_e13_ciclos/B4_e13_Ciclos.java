/*
entrar 10 números
media de positivos
media de los negativos
cantidad de 0
 */
package b4_e13_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author macostaa
 */
public class B4_e13_Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumaP=0, sumaN=0, contP=0, contN=0, cont0=0;
        //entrada
        for(int i=1; i<=10;i++){
            int num=Integer.parseInt(JOptionPane.showInputDialog("Entre un número"));
            if(num>0){
                sumaP+=num;
                contP++;
            }
            else if (num <0) {
                sumaN+=num;
                contN++;                
            }
            else
                cont0++;
        }
        
        String mensaje="";
        //tratamiento de positivos
        if(contP==0) mensaje+="No introdujo números positivos";
        else mensaje +="La media de los números positivos es: "+((float)sumaP/contP);
        //tratamiento d enegativos
        if(contN==0) mensaje+="\nNo introdujo números negativos";
        else mensaje +="\nLa media de los números negativos es: "+((float)sumaN/contN);
        //tratamiento del cero
        if (cont0>0) mensaje+="\nCantidad de veces que introdujo el números 0: "+cont0;
        else mensaje+="\nNo introduje el número 0";
        
        //salida
        System.out.println(mensaje);
    }
    
}

/*
 el producto de los 10 1ros números impares
 */
package b4_e11_ciclos;

/**
 *
 * @author home
 */
public class B4_e11_Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int resultado=1;
        for(int i=1;i<20;i+=2){
            resultado*=i;
        }
        System.out.println("El producto de los primeros 10 números es "+resultado);
    }
    
}

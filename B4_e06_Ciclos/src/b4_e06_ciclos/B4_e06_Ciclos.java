/*
leer números hasta que se introduzca 0
mostra la sumatoria de todos esos números
 */
package b4_e06_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class B4_e06_Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, suma=0;
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog("Digite un número distinto de cero"));
            suma+=num;
            
        }while(num!=0);
        System.out.println("La suma es "+suma);
            
        
    }
    
}

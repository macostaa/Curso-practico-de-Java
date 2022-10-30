/*
pdir números hasta que se teclee uno negativo
y mostrar cuántos números se han introducido
 */
package b4_e04_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class B4_e04_Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=0, num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Digite un número positivo"));
        
        while(num>=0){            
            System.out.println((++cont)+" ha digitado el número " +num);
            num=Integer.parseInt(JOptionPane.showInputDialog("Digite otro número positivo"));            
        }
        System.out.println("\nIntrodujo un total de "+cont+" números positivos");
    }
    
}

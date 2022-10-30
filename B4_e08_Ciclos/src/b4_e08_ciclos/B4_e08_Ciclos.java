/*
mostrar los números entre 1 y N
 */
package b4_e08_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class B4_e08_Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        for(int i=1; n>=1;n--){
            System.out.print(i++ +" ");
        }        
    }
    
}

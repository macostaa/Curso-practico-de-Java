/*
 pedir 3 números y ordenarlos de mayor a menor
 */
package b3_ejercicio_7_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class B3_Ejercicio_7_Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c;
        a=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));
        c=Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer número"));
        
        if(a>=b){
            if(b>=c){
                JOptionPane.showMessageDialog(null, "Orden descendente: "+a+" "+b+" "+c);
            }
            else if (a>=c) JOptionPane.showMessageDialog(null, "Orden descendente: "+a+" "+c+" "+b);
            else JOptionPane.showMessageDialog(null, "Orden descendente: "+c+" "+a+" "+b);
            
        }else{
            if(a>=c){
                JOptionPane.showMessageDialog(null, "Orden descendente: "+b+" "+a+" "+c);
            }
            else if (b>=c) JOptionPane.showMessageDialog(null, "Orden descendente: "+b+" "+c+" "+a);
            else JOptionPane.showMessageDialog(null, "Orden descendente: "+c+" "+b+" "+a);
        }
    }
    
}

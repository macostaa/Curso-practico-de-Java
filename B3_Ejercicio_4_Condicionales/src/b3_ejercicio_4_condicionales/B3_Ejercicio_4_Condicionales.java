/*
descuento del 20% a clientes cuya compra supere los $300
 */
package b3_ejercicio_4_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author macostaa
 */
public class B3_Ejercicio_4_Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float compra =Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto de la compra"));
        if(compra >300){
            compra -=compra*0.2;
        }
        JOptionPane.showMessageDialog(null, "Debe pagar "+compra);
    }
    
}

/*
cajero automático
Saldo inicial 1000
Operaciones:
1. Ingresar dinero
2. Retirar dinero
3. Salir
 */
package b3_ejercicio_12_condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author macostaa
 */
public class B3_Ejercicio_12_Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float saldo= 1000f;
        
        //entrada de datos
        int op = Integer.parseInt(JOptionPane.showInputDialog(
                "BIENVENIDO AL CAJERO AUTOMÁTICO\n"
                + "1. Ingresar dinero\n"
                + "2. Retirar dinero\n"
                + "3. Salir "));
        
        switch (op){    
            //depósito
            case 1: float dep= Float.parseFloat(JOptionPane.showInputDialog("Inserte la cantidad de dinero a depositar"));
                    saldo+=dep;
                    JOptionPane.showMessageDialog(null, 
                        "Operación terminada\n"
                         + "Su saldo es: "+saldo+"\n"
                         + "Gracias por utilizar nuestros servicios");
                    break;
            //extracción    
            case 2: float ex= Float.parseFloat(JOptionPane.showInputDialog("Inserte la cantidad de dinero que desea extraer"));
                    if(ex<=saldo){
                        saldo-=ex;
                        JOptionPane.showMessageDialog(null, 
                            "Operación terminada. \n"
                            + "Su saldo es "+saldo+"\n"
                            + "Gracias por utilizar nuestros servicios");
                    }
                    else JOptionPane.showMessageDialog(null, "Su saldo es menor que la cantidad de dinero que desea extraer");
                    break;                
            //salir
            case 3: JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestros servicios");
                    break;    
            default: JOptionPane.showMessageDialog(null, op+ " no es una opción válida");
                    break;
        }
        
        
    }
    
}

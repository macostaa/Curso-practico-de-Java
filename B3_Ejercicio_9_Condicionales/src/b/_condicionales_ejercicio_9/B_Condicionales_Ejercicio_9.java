/*
decir si una fecha entrada es válida suponiendo que no hay años bisiestros
 */
package b._condicionales_ejercicio_9;

import javax.swing.JOptionPane;

/**
 *
 * @author home
 */
public class B_Condicionales_Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //entrada de datos
        int a =Integer.parseInt(JOptionPane.showInputDialog("ingrese año"));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Ingrese mes"));
        int d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese día"));
                              
        //evaluación y salida
        //fecha correcta
        if((d>0 && d<=31)&&(m>0 && m<=12)&&(a>0)){      
            if((m==2)&&(d>28)){
                JOptionPane.showMessageDialog(null,"Fecha correcta: \ndía incorrecto (febrero no tiene"+d+" días)");
            }else if((m==2)||(m==4)||(m==6)||(m==9)||(m==11)&&(d==31)){
                JOptionPane.showMessageDialog(null,"Fecha incorrecta: \ndía incorrecto (el mes "+m+" no tiene"+d+" días)");
            }
            else 
                JOptionPane.showMessageDialog(null,"Fecha correcta");
        }
        //fecha incorrecta
        else {
            String errores="Fecha incorrecta:";//variable para el mensaje de error, en las condicionales se enriquece el mensaje con detalles del error
            if(!(d>0 && d<=30)){
                errores += "\n-día incorrecto";
            }
            if(!(m>0 && m<=12)){
                errores += "\n-mes incorrecto";
            }
            if(!(a>0)){
                 errores += "\n-año incorrecto";
            }
            JOptionPane.showMessageDialog(null,errores);
        }   
    }
    
}

/*
 Juego de adivinar un número N entre 1 y 100. 
El usuario introduce un número y el programa dirá si es menor o mayor que N.
Termina cuando el usuario acierta.
El sistema muestra el número de intentos.
 */
package b4_e05_ciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author macostaa
 */
public class B4_e05_Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, cont=0, incognita;
        incognita=(int)(Math.random()*100); //generrar un número aleatorio entre 0 y 100
                
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Adivine un número entre 0 y 100")); //entrada
            cont++; //número de intentos
            String signo = (incognita>num)?" > ":" < ";  //saber si el números es mayor o menor          
            System.out.println( (num==incognita)?
                    "\nEnhorabuena, has adivinado, el número es "+incognita+"\nNúmero de intentos: "+cont //adivina
                    :"?"+ signo +num); //no adivina
            
        }while (num!=incognita);
        
    }
    
}

package com.mycompany.random_semana;

/**
 *
 * @author home
 */
public class Random_semana {

    public static void main(String[] args) {
        String[] semana={"lunes","martes","miércoles","jueves","viernes","sabado","domingo"};
        for (int i = 0; i < 10; i++) {
            System.out.println(semana[(int)(Math.random()*7)]);
        }
    }
}

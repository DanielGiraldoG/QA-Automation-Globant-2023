/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:


 */
package IntroJava;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejercicio10_Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        int num;

        for (int i = 0; i < 4; i++) {
            System.out.println("\nIngrese un número");
            num = leer.nextInt();
            System.out.print(num + ":");
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }

        }

    }

}

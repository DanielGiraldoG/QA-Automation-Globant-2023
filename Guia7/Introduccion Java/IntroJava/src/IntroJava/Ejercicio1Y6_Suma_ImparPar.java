/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Crear un programa que dado un numero determine si es par o impar.
 */
package IntroJava;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejercicio1Y6_Suma_ImparPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        
        System.out.println("La suma es: " + suma);
*/
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        
        if (num1%2 == 0){
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJava;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejercicio9_PrimeraLetra {
        public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String palabra = leer.nextLine();
        
        if (palabra.substring(0,1).equalsIgnoreCase("a")){
            System.out.println("correcto");
        } else{
            System.out.println("incorrecto");
        }
        
        
        }
}

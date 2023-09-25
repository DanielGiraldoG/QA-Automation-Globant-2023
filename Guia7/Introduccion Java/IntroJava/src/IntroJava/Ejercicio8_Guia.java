/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJava;

import java.util.Scanner;

/**
 *
 * Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta. 
 */
public class Ejercicio8_Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingresa una nota");
        int nota = leer.nextInt();
        
        while (nota<0 || nota>10) {
            System.out.println("Por favor ingresa un nota valida");
            nota = leer.nextInt();
          
            
                     
            
        }
        
        System.out.println("Has ingresado una nota correcta");
        
        
        
    }
    
}

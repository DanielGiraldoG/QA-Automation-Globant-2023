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
public class Ejercicio03_FraseMayusMinus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String frase;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Favor escribe una frase");
        frase = leer.nextLine();
        
        System.out.println("Mayuscula: " + frase.toUpperCase() );
        System.out.println("Minuscula: " + frase.toLowerCase() );
        
        leer.close();
    }
    
}

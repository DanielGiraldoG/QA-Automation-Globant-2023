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
public class Ejercicio5_DobleTripleRaiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double num, doble, triple, raiz;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Favor escribe un número");
        num = leer.nextInt();
        
        doble = num * 2;
        triple = num * 3; 
        raiz = Math.sqrt(num);
        
        System.out.println("Doble: " + doble);
        System.out.println("Triple: " + triple);
        System.out.println("raiz: " + raiz);
        
        
    }
    
}

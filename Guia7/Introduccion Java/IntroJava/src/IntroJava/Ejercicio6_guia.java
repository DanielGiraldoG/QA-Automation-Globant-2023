/*
Implementar un programa que le pida dos números enteros a 
usuario y determine si ambos o
alguno de ellos es mayor a 25.
 */
package IntroJava;

import java.util.Scanner;

public class Ejercicio6_guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1, num2;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Favor ingresa numero 1");
        num1 = leer.nextInt();
        System.out.println("Favor ingresa numero 2");
        num2 = leer.nextInt();
        
        if (num1>25 && num2>25) {
            System.out.println("Ambos números son mayores a 25");
        } else if (num1>25 || num2>25){
            System.out.println("Al menos uno de los dos "
                    + "números es mayor a 25");
        } else {
            
            System.out.println("Ninguno de los dos números es "
                    + "mayor a 25");
        }

        
    }
    
}

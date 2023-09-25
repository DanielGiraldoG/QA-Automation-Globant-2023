/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.
 */
package IntroJava;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class EjEx03_esVocal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        String letra;
        
        System.out.println("Ingrese una letra");
        letra = read.next().toLowerCase();
        
        
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("es una vocal");
                
                break;
            default:
                System.out.println("no es una vocal");
        }
    }
    
}

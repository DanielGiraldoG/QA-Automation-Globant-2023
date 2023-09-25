package IntroJava;

import java.util.Scanner;

/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial. 
 */
/**
 *
 * @author Daniel
 */
public class Ejercicio10_SumaLimite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int num, numLimite, suma;

        Scanner leer = new Scanner(System.in);
        System.out.println("Favor escribe un número límite");

        numLimite = leer.nextInt();
        suma = 0;

        do {

            System.out.println("Favor escribe un número");
            num = leer.nextInt();
            suma += num;

        } while (suma <= numLimite);
        
        System.out.println("Ha superado el límite");
    }

}

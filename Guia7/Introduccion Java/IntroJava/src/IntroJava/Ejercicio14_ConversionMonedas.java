/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package IntroJava;

import java.util.Scanner;

public class Ejercicio14_ConversionMonedas {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        double euros;
        String opcionMoneda;

        System.out.println("Ingrese la cantidad de euros que desea convertir");
        euros = leer.nextDouble();

        System.out.println("Eliga la moneda a la que desea convertir:");
        System.out.println("1. Libras");
        System.out.println("2. Dolares");
        System.out.println("3. Yenes");
        opcionMoneda = leer.next();

        convertirEuros(euros, opcionMoneda);

    }

    public static void convertirEuros(double euros, String opcionMoneda) {

        double libras, dolares, yenes;

        switch (opcionMoneda) {
            case "1":
                libras = euros * 0.86;
                System.out.println(euros + " euros " + "Son " + libras + " libras");
                break;
            case "2":
                dolares = euros * 1.28611;
                System.out.println(euros + " euros " + "Son " + dolares + " dolares");
                break;
            case "3":
                dolares = euros * 129.852;
                System.out.println(euros + " euros " + "Son " + dolares + " yenes");
                break;

            default:
                System.out.println("No ha ingresado una opcion válida");
        }

    }

}

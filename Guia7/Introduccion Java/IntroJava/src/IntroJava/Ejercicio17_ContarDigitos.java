/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package IntroJava;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejercicio17_ContarDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);

        int n;

        System.out.println("Favor ingrese el tamaño del vector: ");
        n = read.nextInt();

        int[] vector = new int[n];

        llenarVector(vector, n);
        mostrarVector(vector, n);
        contarDigitos(vector, n);
    }

    public static void llenarVector(int[] vector, int n) {

        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 150000);

        }

    }

    public static void mostrarVector(int[] vector, int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(" [ " + vector[i] + " ] ");

        }

    }

    public static void contarDigitos(int[] vector, int n) {
      
        int longitud = 0, contador1Digito = 0, contador2Digitos = 0, contador3Digitos = 0;
        int contador4Digitos = 0, contador5Digitos = 0, contadorMasDigitos = 0;

        for (int i = 0; i < n; i++) {
            longitud = 0;
           
            while (vector[i] != 0) {
                vector[i] = vector[i] / 10;
                longitud++;

            }

            switch (longitud) {
                case 1:
                    contador1Digito++;
                    break;
                case 2:
                    contador2Digitos++;
                    break;
                case 3:
                    contador3Digitos++;
                    break;
                case 4:
                    contador4Digitos++;
                    break;
                case 5:
                    contador5Digitos++;
                    break;
                default:
                    contadorMasDigitos++;
            }

        }

        System.out.println("La cantidad de números de 1 digito es de: " + contador1Digito);
        System.out.println("La cantidad de números de 2 digitos es de: " + contador2Digitos);
        System.out.println("La cantidad de números de 3 digitos es de: " + contador3Digitos);
        System.out.println("La cantidad de números de 4 digitos es de: " + contador4Digitos);
        System.out.println("La cantidad de números de 5 digitos es de: " + contador5Digitos);
        System.out.println("La cantidad de números de más de 5 digitos es de: " + contadorMasDigitos);
    }
}

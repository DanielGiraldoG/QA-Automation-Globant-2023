/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package IntroJava;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejercicio20_MatrizMagica {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);

        int n;

        System.out.println("Favor ingrese el tamaño de la matriz ");
        n = read.nextInt();

        int[][] matriz = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8},};

        //llenarMatriz(matriz, n);
        System.out.println(Arrays.deepToString(matriz));
        ValidarMatriz(matriz, n);
    }
//mostrarMatriz(matriz, n);
    
//


    public static void ValidarMatriz(int[][] matriz, int n) {

        int sumaFila = 0, sumaColumna = 0, sumaDiagPrincipal = 0, sumaDiagSecundaria = 0;
        boolean validar = true;

        for (int i = 0; i < n; i++) {
            sumaFila = 0;
            sumaColumna = 0;

            for (int j = 0; j < n; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[i][j];

                if (i == j) {
                    sumaDiagPrincipal += matriz[i][j];
                }

            }

            if (sumaFila != sumaColumna) {
                validar = false;
                break;

            }
            sumaDiagSecundaria += matriz[i][n - 1 - i];

        }
        
        if ((sumaFila != sumaDiagPrincipal) || (sumaFila != sumaDiagSecundaria)) {
            validar = false;
        }

        if (validar) {
            System.out.println("La matriz es mágica");
        } else {
            System.out.println("La matriz no es mágica");
        }

    }
}
//    public static void mostrarMatriz(int[][] matriz, int n) {
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(" [ " + matriz[i][j] + " ] ");
//            }
//            System.out.println("");
//
//        }
//
//    }



    
//
//    public static void llenarMatriz(int[][] matriz, int n) {
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                matriz[i][j] = (int) (Math.random() * 10);
//            }
//
//        }
//
//    }

//    public static void llenarMatriz(int[][] matriz, int n) {
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                matriz[i][j] = (int) (Math.random() * 10);
//            }
//
//        }
//
//    }
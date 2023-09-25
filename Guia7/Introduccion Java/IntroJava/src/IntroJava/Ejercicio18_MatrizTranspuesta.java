/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package IntroJava;

import java.util.Scanner;

public class Ejercicio18_MatrizTranspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);

        int n;

        System.out.println("Favor ingrese el tamaño del vector: ");
        n = read.nextInt();

        int[][] matriz = new int[n][n];

        llenarMatriz(matriz, n);
        mostrarMatriz(matriz, n);
        System.out.println("\nMatriz transpuesta");
        matrizTranspuesta(matriz, n);

    }

    public static void llenarMatriz(int[][] matriz, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }

        }

    }

    public static void mostrarMatriz(int[][] matriz, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" [ " + matriz[i][j] + " ] ");
            }
            System.out.println("");

        }

    }

    public static void matrizTranspuesta(int[][] matriz, int n) {
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" [ " + matriz[j][i] + " ] ");
            }
            System.out.println("");

        }
    }
}
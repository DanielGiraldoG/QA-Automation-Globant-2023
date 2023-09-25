/*
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package IntroJava;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejercicio19_MatrizAntiSimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);

        int n;

        System.out.println("Favor ingrese el tamaño de la matriz: ");
        n = read.nextInt();

        //int[][] matriz = new int[n][n];
        int[][] matriz = {
            {0, -2, 4},
            {2, 0, 2},
            {-4, -2, 0},};

        int[][] matrizT = new int[n][n];

        //llenarMatriz(matriz, n);
        matrizTranspuesta(matrizT, matriz, n);
        mostrarMatriz(matriz, n);

        System.out.println("\nMatriz transpuesta");
        mostrarMatriz(matrizT, n);

        validarAntiSimetrica(matrizT, matriz, n);

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

    public static void matrizTranspuesta(int[][] matrizT, int[][] matriz, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizT[i][j] = matriz[j][i];
            }

        }
    }

    public static void validarAntiSimetrica(int[][] matrizT, int[][] matriz, int n) {

        boolean validar = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != (matriz[j][i] * -1)) {
                    validar = false;
                }

            }

        }
        System.out.println("Es " + validar + " que la matriz es antisimetrica ");
    }
}

/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package IntroJava;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejercicio21_EncontrarMatrizMenMatrizP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);

        int[][] matrizM = {
            {1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
            {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
            {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 98, 90, 67, 12, 41, 65, 12},};

        int[][] matrizP = {
            {36, 5, 67},
            {89, 90, 75},
            {14, 22, 26},};

        //llenarMatriz(matriz, n);
        System.out.println(Arrays.deepToString(matrizM));
        System.out.println(Arrays.deepToString(matrizP));

        buscarMatriz(matrizP, matrizM);

    }

    public static void buscarMatriz(int matrizP[][], int matrizM[][]) {

        boolean validar = false;

        for (int k = 0; k < 10; k++) {
            for (int l = 0; l < 10; l++) {
                if ((matrizP[0][0] == matrizM[k][l]) && (k < 8) && (l < 8)) {
                    System.out.println("encontre en k: " + k + " j: " + l);
                    if ((matrizP[0][1] == matrizM[k][l + 1]) && (matrizP[0][2] == matrizM[k][l + 2])
                            && (matrizP[1][0] == matrizM[k + 1][l]) && (matrizP[1][1] == matrizM[k+1][l+1]) && (matrizP[1][2] == matrizM[k + 1][l + 2])
                            && (matrizP[2][0] == matrizM[k + 2][l]) && (matrizP[2][1] == matrizM[k + 2][l + 1]) && (matrizP[2][2] == matrizM[k + 2][l + 2])) {
                        validar = true;

                    }

                }
            }
        }

        System.out.println("Es " + validar + " que la matriz M contiene la matriz P");

    }

}

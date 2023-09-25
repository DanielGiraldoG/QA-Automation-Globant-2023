/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ej10;

import java.util.Arrays;


/**
 *
 * @author Daniel
 */
public class POO_Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double[] vectorA = new double[50];
        double[] vectorB = new double[20];

        llenarVector(vectorA, 50);
        llenarVector(vectorB, 20);

        System.out.println(Arrays.toString(vectorA) + "\n");
        System.out.println(Arrays.toString(vectorB) + "\n");

        Arrays.sort(vectorA);

        System.out.println("Vector A ordenado de manera ascendente: ");
        System.out.println(Arrays.toString(vectorA) + "\n");

        System.arraycopy(vectorA, 0, vectorB, 0, 10);
        
       // vectorB = Arrays.copyOfRange(vectorA, 0, 10);

        System.out.println("Vector B con 10 primeros valores de A");
        System.out.println(Arrays.toString(vectorB) + "\n");

        Arrays.fill(vectorB, 10, 20, 0.5);
        System.out.println("Vector B con 10 siguientes valores iguales a 0,5");
        System.out.println(Arrays.toString(vectorB) + "\n");

//        mostrarMatriz(vectorA, 50);
//        mostrarMatriz(vectorA, 20);

    
    }

    public static void llenarVector(double[] vector, int n) {
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
    }

//    public static void mostrarMatriz(double[] vector, int n) {
//        for (int i = 0; i < n; i++) {
//            System.out.println(" [ " + vector[i] + " ] ");
//        }
//    }
}

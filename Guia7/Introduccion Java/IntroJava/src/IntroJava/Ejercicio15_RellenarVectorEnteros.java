/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.

 */
package IntroJava;

public class Ejercicio15_RellenarVectorEnteros {

    public static void main(String[] args) {
        // TODO code application logic here

        int[] vector = new int[100];

        llenarVector(vector);

        mostrarVector(vector);

    }

    public static void llenarVector(int[] vector) {

        for (int i = 0; i < 100; i++) {
            vector[i] = i+1;

        }

    }

    public static void mostrarVector(int[] vector) {

        for (int i = 99; i >= 0; i--) {
            System.out.println(" [ " + vector[i] + " ] ");
        
        }

    }
    
}

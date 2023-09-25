/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package IntroJava;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejercicio16_BuscarEnVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner read = new Scanner(System.in);

        int n, valorBuscar, contador=0;

        System.out.println("Favor ingrese el tamaño del vector: ");
        n = read.nextInt();

        int[] vector = new int[n];

        llenarVector(vector, n);
        mostrarVector(vector, n);
        
        System.out.println("Favor ingrese el valor que desea buscar ");
        valorBuscar = read.nextInt();
        
        contador = buscarNumero(vector, n, valorBuscar);
        
        if (contador == 0 ) {
            System.out.println("El número no se ha encontrado dentro del vector");
        }else if(contador>1){
            System.out.println("El número se ha encontrado " + contador + " veces");
        }
    }

    public static void llenarVector(int[] vector, int n) {
        
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);

        }

    }

    public static void mostrarVector(int[] vector, int n) {

        for (int i = 0; i < n; i++) {
            System.out.println(" [ " + vector[i] + " ] ");

        }

    }
    
    
    public static int buscarNumero(int[] vector, int n, int valorBuscar){
        
        int contador=0;
        
        for (int i = 0; i < n; i++) {
            if (valorBuscar == vector[i]) {
                System.out.println("El valor buscado está en la posición: " + i);
                contador++;
            }
          
            }
        return contador;
        }
        
        
    
}

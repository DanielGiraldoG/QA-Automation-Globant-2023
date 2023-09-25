/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package IntroJava;

import java.util.Scanner;

public class Ejercicio13_CuadradoAsteriscos {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresa el tamaño del cuadrado");
        int nElementos = leer.nextInt();
        
        for (int i = 0; i < nElementos; i++) {
            for (int j = 0; j < nElementos; j++) {
                
                if (i == 0 || i == nElementos-1 || j == 0 || j == nElementos-1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
        
        
    }

}

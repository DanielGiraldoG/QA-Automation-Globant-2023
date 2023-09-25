/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.
 */
package IntroJava;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class EjExtra07_numMaxMinProm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner read = new Scanner(System.in);
        int n, num, valMax, valMin, contador = 0, suma = 0;
        double promedio;

        System.out.println("Ingrese la cantidad de números que desea entrar: ");
        n = read.nextInt();

        System.out.println("Ingrese un número");
        num = read.nextInt();

        valMax = num;
        valMin = num;

        while (contador < n - 1) {
            System.out.println("Ingrese un número");
            num = read.nextInt();

            if (num > valMax) {
                valMax = num;
            } else {
                valMin = num;
            }

            suma += num;
            contador++;

        }
        promedio = suma / n;

        System.out.println("El número mayor es " + valMax);
        System.out.println("El número menor es " + valMin);
        System.out.println("El promedio es " + promedio);

    }

}

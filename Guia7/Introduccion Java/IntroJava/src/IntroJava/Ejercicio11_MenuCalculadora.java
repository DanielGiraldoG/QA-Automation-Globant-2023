/*
@
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
 */
package IntroJava;

import java.util.Scanner;

public class Ejercicio11_MenuCalculadora {

    
    public static void main(String[] args) {
        // TODO code application logic here

        double num1, num2, resultado;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        num1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();

        resultado = Menu(num1, num2);
        System.out.println("El resultado es:" + resultado);

    }

    public static double Menu(double num1, double num2) {

        int opcion;
        double resultado = 0;
        String confirmacion="Y";
        Scanner leer = new Scanner(System.in);

        System.out.println("num1: " + num1 + " & num 2: " + num2);

        do {

            System.out.println("Ingrese una opción: ");
            System.out.println("1: Sumar ");
            System.out.println("2: Restar ");
            System.out.println("3: Multiplicar ");
            System.out.println("4: Dividir ");
            System.out.println("5: Salir ");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    resultado = num1 / num2;
                    break;

                default:
                    System.out.println("Esta seguro que desea salir del programa (Y/N)");
                    opcion = 5;
                    confirmacion = leer.next();
                   

            }
        } while (confirmacion.equalsIgnoreCase("N") && opcion == 5);

        if (confirmacion.equalsIgnoreCase("Y")) {
            System.out.println("Has salido del programa");
        } 
        
        return resultado;
    }

}

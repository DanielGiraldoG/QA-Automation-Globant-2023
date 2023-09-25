/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJava;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejercicio11_version2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double num1, num2, resultado=0;
        int opcion;
        String confirmacion = "N";

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        num1 = leer.nextInt();

        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();
        
        do {

            System.out.println("\nIngrese una opción: ");
            System.out.println("1: Sumar ");
            System.out.println("2: Restar ");
            System.out.println("3: Multiplicar ");
            System.out.println("4: Dividir ");
            System.out.println("5: Salir ");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado es:" + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado es:" + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado es:" + resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println("El resultado es:" + resultado);
                    break;

                default:
                    System.out.println("Esta seguro que desea salir del programa (Y/N)");
                    confirmacion = leer.next();

            }
        } while (confirmacion.equalsIgnoreCase("N"));


        System.out.println("Has salido del programa");

    }



}

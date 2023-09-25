/*
Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package ejex1_colecciones_sumapromedionumeros;

import java.util.ArrayList;
import java.util.Scanner;

public class EjEx1_Colecciones_SumaPromedioNumeros {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Integer> numeros = new ArrayList();
        Integer numero = -1;
        int suma = 0;
        double promedio = 0;

        System.out.println("Por favor ingrese un numero");
        numero = scan.nextInt();

        while (numero != -99) {

            numeros.add(numero);

            suma += numero;

            System.out.println("Por favor ingrese un numero");
            numero = scan.nextInt();
        }
        
        
        
        promedio = suma / numeros.size();
        System.out.println("--------------------------------------");
        System.out.println("El promedio de los numeros ingresados es: " + promedio);

    }

}

/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package ej05_paises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ej05_Paises {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        HashSet<String> paises = new HashSet();
        boolean opcion = false;
        
        do {
            System.out.println("Ingrese el nombre del Pais que desea agregar");
            paises.add(scan.next());

            System.out.println("Desea agregar otro paìs (S/N ");
            opcion = scan.next().equalsIgnoreCase("s");

        } while (opcion);

        for (String pais : paises) {
            System.out.println(pais);
        }
        System.out.println("-----------------");

        ArrayList<String> paisesList = new ArrayList(paises);
        Collections.sort(paisesList);

        for (String pais : paisesList) {
            System.out.println(pais);
        }

        Iterator<String> it = paises.iterator();
        boolean isRemoved = false;
        System.out.println("Ingrese el pais que desea remover");
        
        while (it.hasNext()) {
               if (it.next().equalsIgnoreCase(scan.next())) {
                it.remove();
                isRemoved = true;
                break;
            }
        }
         
         
        

        if (isRemoved) {
            System.out.println("------------");
            System.out.println("El pais se ha removido con exito, la lista final es:");
        } else {
            System.out.println("------------");
            System.out.println("No se ha encontrado el pais a remover, la lista se mantiene de la siguiente manera");
        }

        for (String pais : paises) {
            System.out.println(pais);
        }
    }
    
    
    

}

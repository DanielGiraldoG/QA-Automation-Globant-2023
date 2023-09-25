/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razas = new ArrayList();

        String razaEliminar;

        boolean opcion, isRemoved = false;
//Agregar razas a lista
        do {
            System.out.println("Ingrese la raza de su perro");
            razas.add(leer.next());

            System.out.println("¿Quiere ingresar otra raza? (S / N)");
            opcion = leer.next().equalsIgnoreCase("S");

        } while (opcion);

//        System.out.println("Las razas de los perros registradas son:");
//Iterador
        Iterator<String> it = razas.iterator();

        System.out.println("Ingrese la raza de perro que desea eliminar");
        razaEliminar = leer.next();

        while (it.hasNext()) {
            if (it.next().equals(razaEliminar)) {
                it.remove();
                isRemoved = true;

            }
        }

        if (isRemoved) {
            System.out.println("Se eliminado correctamente la raza de la lista, "
                    + "la nueva lista es:");
        } else {
            System.out.println("No se ha encontrado alguna raza que coincida"
                    + "con la ingresada. La lista se mantiene de la siguiente forma");
        }
//Mostrar lista

        Collections.sort(razas);

        for (String raza : razas) {
            System.out.println(raza);
        }

    }
}

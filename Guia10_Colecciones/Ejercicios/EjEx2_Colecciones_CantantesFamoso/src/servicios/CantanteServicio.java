/*
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
 */
package servicios;

import entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

public class CantanteServicio {
    
    Scanner scan;
    
    public CantanteServicio() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
    }
    
    public CantanteFamoso crearCantante() {
        
        CantanteFamoso cantante = new CantanteFamoso();
        
        System.out.println("Favor ingrese el nombre del cantante");
        cantante.setNombre(scan.next());
        
        System.out.println("Ingrese el disco con mas ventas del cantante ingresado");
        cantante.setDiscoConMasVentas(scan.next());
        
        return cantante;
    }
    
    public void agregarALista(ArrayList<CantanteFamoso> cantantes) {
        
        CantanteFamoso cantante = crearCantante();
        cantantes.add(cantante);
        
    }
    
    public void mostrarCantantes(ArrayList<CantanteFamoso> cantantes) {
        int i = 1;
        System.out.println("--------------Lista de cantantes actualizados-------------");
        for (CantanteFamoso cantante : cantantes) {
            System.out.println(" Cantante " + i + " : " + cantante);
            i++;
        }
        System.out.println("------------------------------------------------");
        
    }
    
    public void eliminarCantante(ArrayList<CantanteFamoso> cantantes) {
        
        mostrarCantantes(cantantes);
        System.out.println("Favor ingrese el nombre del cantante que desea eliminar");
        String cantanteEliminado = scan.next();
        boolean isRemoved = false;
        
        for (int i = 0; i < cantantes.size(); i++) {
            if (cantantes.get(i).getNombre().equalsIgnoreCase(cantanteEliminado)) {
                cantantes.remove(cantantes.get(i));
                
                isRemoved = true;
            }            
            
        }
              
        
        
        if (isRemoved) {
            System.out.println("Se ha eliminado correctamente el cantante");
            mostrarCantantes(cantantes);
        } else {
            System.out.println("No se ha encontrado el cantante, la lista se mantiene de la siguiente forma");
            mostrarCantantes(cantantes);
        }
        
    }
    
}

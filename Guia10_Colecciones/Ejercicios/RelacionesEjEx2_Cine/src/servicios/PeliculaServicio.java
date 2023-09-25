/*

 */
package servicios;

import entidades.Pelicula;
import java.util.Scanner;

public class PeliculaServicio {

    private Scanner scan;

    public PeliculaServicio() {
        this.scan = new Scanner(System.in).useDelimiter("\n");

    }

    public Pelicula crearPelicula(){
        
        Pelicula pelicula = new Pelicula();
        
        System.out.println("Favor ingrese el titulo de la pelicula");
        pelicula.setTitulo(scan.next());
        
        System.out.println("Ingrese la edad minima de la pelicula");
        pelicula.setEdadMin(scan.nextInt());
        
        System.out.println("Ingrese el director de la pelicula");
        pelicula.setDirector(scan.next());
        
        System.out.println("Ingrese la duracion de la pelicula");
        pelicula.setDuracion(scan.nextInt());
        
        
        return pelicula;
        
    }
    
}

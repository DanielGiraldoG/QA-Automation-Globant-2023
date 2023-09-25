package servicios;

import entidades.Pelicula;
import java.util.Scanner;

public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private static Pelicula[] peliculas = new Pelicula[20];
    private int contadorPeliculas = 0;

    public Pelicula crearPelicula() {

        Pelicula pelicula = new Pelicula();
        

        System.out.println("Ingrese el titulo de la pelicula: ");
        pelicula.setTitulo(leer.next());

        System.out.println("Ingrese el género de la pelicula: ");
        pelicula.setGenero(leer.next());

        System.out.println("Ingrese el año de la pelicula: ");
        pelicula.setAnio(leer.nextInt());

        System.out.println("Ingrese la duración de la pelicula en minutos: ");
        pelicula.setDuracion(leer.nextInt());

        peliculas[contadorPeliculas] = pelicula;

        contadorPeliculas++;

        // System.out.println(Arrays.toString(peliculas));
        return pelicula;
    }

    public void ListarPeliculasDisponibles() {

        for (int i = 0; i < contadorPeliculas; i++) {
            System.out.println("Pelicula " + (i + 1) + " : " + peliculas[i]);
        }

    }

    public boolean buscarPeliculaTitulo() {

        System.out.println("Ingrese la pelicula que desea buscar");
        String peliculaBuscada = leer.next();
        Boolean peliculaEncontrada = false;

        for (int i = 0; i < contadorPeliculas; i++) {
            if (peliculas[i].getTitulo().equalsIgnoreCase(peliculaBuscada)) {
                peliculaEncontrada = true;

                System.out.println(peliculas[i].toString());
            }

        }
        return peliculaEncontrada;
    }

    public Pelicula[] getPeliculas() {
        return peliculas;
    }

    public int getContadorPeliculas() {
        return contadorPeliculas;
    }

}

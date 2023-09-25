
package ejex2_cooperativo_alquiler;

import entidades.Alquiler;
import entidades.Pelicula;
import servicios.AlquilerServicio;
import servicios.PeliculaServicio;

public class EjEx2_Cooperativo_Alquiler {


    public static void main(String[] args) {
        
        
        PeliculaServicio ps = new PeliculaServicio();
        AlquilerServicio as = new AlquilerServicio();
        Pelicula p1 = ps.crearPelicula();
        Alquiler a1 = as.crearAlquiler();
        
        
        //ps.ListarPeliculasDisponibles();
        //ps.buscarPeliculaTitulo();
        
        as.listarAlquileres();
        //as.buscarAlquilerFecha();
        
        
            
    }
    
}

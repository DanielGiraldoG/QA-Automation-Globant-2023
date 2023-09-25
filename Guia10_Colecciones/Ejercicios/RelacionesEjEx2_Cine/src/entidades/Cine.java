/*
Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. 
 */
package entidades;


public class Cine {
    
    private Pelicula pelicula;
    private Espectador[][] salaEspectadores;
    private int precioEntrada;

    public Cine() {
    }

    public Cine(Pelicula pelicula, Espectador[][] salaEspectadores, int precioEntrada) {
        this.pelicula = pelicula;
        this.salaEspectadores = salaEspectadores;
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Espectador[][] getSalaEspectadores() {
        return salaEspectadores;
    }

    public void setSalaEspectadores(Espectador[][] salaEspectadores) {
        this.salaEspectadores = salaEspectadores;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", salaEspectadores=" + salaEspectadores + ", precioEntrada=" + precioEntrada + '}';
    }
    
    
    
    
    
    
}

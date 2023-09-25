/*
Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
página: https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el
número.

 */
package entidades;

public class Ciudad {
    
    private String nombre;
    private Integer codigoPostal;

    public Ciudad() {
    }

    public Ciudad(String nombre, Integer codigoPostal) {
        this.nombre = nombre;
        this.codigoPostal = codigoPostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", codigoPostal=" + codigoPostal + '}';
    }
    
    
    
    
}

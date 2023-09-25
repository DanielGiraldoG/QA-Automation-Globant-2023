/*
 Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 Constructores, tanto el vacío como el parametrizado.
 */
package entidades;

public class Ahorcado {
    
    private String[] palabraBuscar;
    private int cantidadLetrasEncontradas;
    private int cantidadJuegosMaximos;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabraBuscar, int cantidadLetrasEncontradas, int cantidadJuegosMaximos) {
        this.palabraBuscar = palabraBuscar;
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
        this.cantidadJuegosMaximos = cantidadJuegosMaximos;
    }

    public String[] getPalabraBuscar() {
        return palabraBuscar;
    }

    public void setPalabraBuscar(String[] palabraBuscar) {
        this.palabraBuscar = palabraBuscar;
    }

    public int getCantidadLetrasEncontradas() {
        return cantidadLetrasEncontradas;
    }

    public void setCantidadLetrasEncontradas(int cantidadLetrasEncontradas) {
        this.cantidadLetrasEncontradas = cantidadLetrasEncontradas;
    }

    public int getCantidadJuegosMaximos() {
        return cantidadJuegosMaximos;
    }

    public void setCantidadJuegosMaximos(int cantidadJuegosMaximos) {
        this.cantidadJuegosMaximos = cantidadJuegosMaximos;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabraBuscar=" + palabraBuscar + ", cantidadLetrasEncontradas=" + cantidadLetrasEncontradas + ", cantidadJuegosMaximos=" + cantidadJuegosMaximos + '}';
    }
    
    
    
    
}

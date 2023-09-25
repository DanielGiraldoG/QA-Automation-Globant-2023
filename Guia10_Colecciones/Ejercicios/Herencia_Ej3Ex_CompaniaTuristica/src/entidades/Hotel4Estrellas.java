/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Daniel
 */
public class Hotel4Estrellas extends Hotel {

    private String gimnasio;
    private String nombreRestaurante;
    private int capacidadRestaurante;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(String gimnasio, String nombreRestaurante, int capacidadRestaurante, int cantidadHabitaciones, int cantidadCamas, int cantidadPisos, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, cantidadCamas, cantidadPisos, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.precioHabitacion = calcularPrecioHabitacion();
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return super.toString() + "Hotel4Estrellas{" + "gimnasio=" + gimnasio + ", "
                + "nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + '}';
    }
    
    
    
    
    
    @Override
    public double calcularPrecioHabitacion() {
        return super.calcularPrecioHabitacion() + (calcularValorRestaurante()) + (calcularValorGimnasio());
    }

    public double calcularValorRestaurante() {

        double valorRestaurante = 0;

        if (capacidadRestaurante < 30) {
            valorRestaurante = 10;
        } else if (capacidadRestaurante <= 50) {
            valorRestaurante = 30;
        } else if (capacidadRestaurante <= 50) {
            valorRestaurante = 50;

        }

        return valorRestaurante;
    }

    public double calcularValorGimnasio() {
        double valorGimnasio = 0;

        if (gimnasio.equalsIgnoreCase("A")) {
            valorGimnasio = 50;
        } else if (gimnasio.equalsIgnoreCase("B")) {
            valorGimnasio = 30;
        }

        return valorGimnasio;

    }
    
    

    
    

}

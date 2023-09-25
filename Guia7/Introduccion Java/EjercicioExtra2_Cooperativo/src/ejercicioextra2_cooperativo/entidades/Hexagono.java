/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2_cooperativo.entidades;

/**
 *
 * @author Daniel
 */
public class Hexagono {
    
    private double lado; 
    private double apotema; 

    public Hexagono() {
    }

    public Hexagono(double lado, double apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    @Override
    public String toString() {
        return "Hexagono{" + "lado=" + lado + ", apotema=" + apotema + '}';
    }
    
    
    
    
    
}

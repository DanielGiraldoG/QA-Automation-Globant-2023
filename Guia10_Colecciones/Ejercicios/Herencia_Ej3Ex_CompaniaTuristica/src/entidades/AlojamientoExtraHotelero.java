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
public class AlojamientoExtraHotelero extends Alojamiento{
    
    protected boolean esPrivado;
    protected int m2;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(boolean esPrivado, int m2, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.esPrivado = esPrivado;
        this.m2 = m2;
    }

    

    public boolean isEsPrivado() {
        return esPrivado;
    }

    public void setEsPrivado(boolean esPrivado) {
        this.esPrivado = esPrivado;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    @Override
    public String toString() {
        return super.toString() + "AlojamientoExtraHotelero{" + "esPrivado=" + esPrivado + ", m2=" + m2 + '}';
    }
    
    
    
    
    
}

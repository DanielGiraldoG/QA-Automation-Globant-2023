/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniel
 */
public class NewClass {
    private double precio;
    private double descuento;
   
        
    public NewClass(double descuento) {
        this.precio = 1000;
        this.descuento = descuento;
    }

    public NewClass() {
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    public double calcularDescuento(){
         
        return precio*(descuento/100);
        
    }
}

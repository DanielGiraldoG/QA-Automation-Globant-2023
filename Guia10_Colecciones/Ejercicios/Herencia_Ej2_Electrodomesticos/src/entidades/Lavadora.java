/*

 */
package entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora() {

    }

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public Lavadora crearLavadora() {
        Lavadora lavadora = new Lavadora();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico(lavadora);

        System.out.println("Ingrese la carga de la lavadora");
        lavadora.carga = scan.nextDouble();

        precioFinal(lavadora);
        return lavadora;
    }

    
    public double precioFinal( Lavadora lavadora) {
        
        double lavPrecio = super.precioFinal(lavadora);
        
        if (lavadora.carga > 30) {
            lavadora.precio =  lavPrecio + 500;

        }
        return precio;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso +  ", carga=" + carga + '}';
    }
    
    

}

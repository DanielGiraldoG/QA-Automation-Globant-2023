/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

public class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
        this.precio = 1000;
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        comprobarColor(color,this);
        comprobarConsumoEnergetico(consumoEnergetico,this);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico, Electrodomestico electromestico) {
        electromestico.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico(char letra, Electrodomestico electromestico) {

        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E') {
            electromestico.consumoEnergetico = letra;
        } else {
            electromestico.consumoEnergetico = 'F';
        }

    }

    public void comprobarColor(String color, Electrodomestico electromestico) {

        if (color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo")
                || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {

            electromestico.color = color;

        } else {
            electromestico.color = "Blanco";
        }

    }

    public void crearElectrodomestico(Electrodomestico electrodomestico) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el color del electrodomestico");
        comprobarColor(scan.next(),electrodomestico);

        System.out.println("Ingrese el consumo del electrodomestico");
        comprobarConsumoEnergetico(scan.next().charAt(0), electrodomestico);

        System.out.println("Ingrese el peso del electrodomestico");

        electrodomestico.peso = scan.nextDouble();

    }

    public double precioFinal(Electrodomestico electrodomestico) {

        switch (electrodomestico.consumoEnergetico) {
            case 'A':
                electrodomestico.precio += 1000;
                break;
            case 'B':
                electrodomestico.precio += 800;
                break;
            case 'C':
                electrodomestico.precio += 600;
                break;
            case 'D':
                electrodomestico.precio += 500;
                break;
            case 'E':
                electrodomestico.precio += 300;
                break;
            case 'F':
                electrodomestico.precio += 100;
                break;
        }

        if (peso <= 19) {
            electrodomestico.precio += 100;
        } else if (peso <= 49) {
            electrodomestico.precio += 500;
        } else if (peso <= 79) {
            electrodomestico.precio += 800;
        } else if (peso <= 80) {
            electrodomestico.precio += 1000;
        }
        
        return electrodomestico.precio;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }
    

}

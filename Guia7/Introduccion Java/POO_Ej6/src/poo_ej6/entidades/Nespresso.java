/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ej6.entidades;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Nespresso {

    private double capacidadMaxima;
    private double cantidadActual;
    private Scanner sc = new Scanner(System.in);

    public Nespresso(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public Nespresso() {
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Nespresso{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
    
      public void crearNespresso(){
        
        System.out.println("Ingrese capacidad máxima: ");
        capacidadMaxima = sc.nextDouble();
        
        System.out.println("Ingrese Cantidad actual: ");
        cantidadActual = sc.nextDouble();
      }

    public void llenarCafetera() {
        cantidadActual = capacidadMaxima;

    }

    public double servirTaza() {
        System.out.println("Ingresa el tamaño de la taza: ");
        double tazaVacia = sc.nextInt();
        
        if (tazaVacia >= cantidadActual) {
            
            System.out.println("La taza no se llenó completamente, "
                    + "la cantidad de café en la taza es de " + cantidadActual
                    + ", la cantidad restante en la taza es de: " + (tazaVacia - cantidadActual));
            return cantidadActual;
        } else {
            
            System.out.println("La taza se llenó completamente");
            cantidadActual -= tazaVacia; 
            return cantidadActual;
        }
    }

    public void vaciarCafetera() {

        cantidadActual = 0;
    }

    public double agregarCafe() {

        System.out.println("Ingrese la cantidad de café que desea agregar a la cafetera:");
        double cafeAgregado = sc.nextDouble();
        
        
        cantidadActual += cafeAgregado;
        
        if (cantidadActual > capacidadMaxima) {
            System.out.println("La cafetera ha excedido el límite");
            cantidadActual = capacidadMaxima;
        }
        return cantidadActual; 
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio4;

import java.text.DecimalFormat;
import poo_ejercicio4.entidad.Rectangulo;
import poo_ejercicio4.servicios.RectanguloServicio;

/**
 *
 * @author Daniel
 */
public class POO_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo rect = rs.crearRectangulo();
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("superficie: " + df.format(rs.calcularArea(rect)) + "\n");
        System.out.println("permimetro: " + df.format(rs.calcularPerimetro(rect)) + "\n");

    }

}

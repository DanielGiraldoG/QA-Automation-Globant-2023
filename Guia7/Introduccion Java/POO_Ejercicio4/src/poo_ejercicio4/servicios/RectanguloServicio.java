/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio4.servicios;

import java.util.Scanner;
import poo_ejercicio4.entidad.Rectangulo;

/**
 *
 * @author Daniel
 */
public class RectanguloServicio {

    private Scanner sc = new Scanner(System.in);

    public Rectangulo crearRectangulo() {

        Rectangulo rectangulo = new Rectangulo();

        System.out.println("Ingrese base: ");
        rectangulo.setAltura(sc.nextInt());
        System.out.println("Ingrese altura: ");
        rectangulo.setBase(sc.nextInt());

        return rectangulo;

    }
    
    public int calcularArea(Rectangulo rectangulo){
        int base = rectangulo.getBase();
        int altura = rectangulo.getAltura();
        
        return base*altura;
        
    }
    
    public int calcularPerimetro(Rectangulo rectangulo){
        int base = rectangulo.getBase();
        int altura = rectangulo.getAltura();
        
        return 2*(base+altura);
        
    }
    
    
    

}

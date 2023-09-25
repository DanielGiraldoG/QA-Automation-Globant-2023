/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra2_cooperativo.servicios;

import ejercicioextra2_cooperativo.entidades.Hexagono;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class HexagonoService {

    public Hexagono crearHexagono() {

        Scanner sc = new Scanner(System.in);
        Hexagono h1 = new Hexagono();

        System.out.println("Ingrese el lado: ");
        h1.setLado(sc.nextDouble());

        System.out.println("Ingrese la apotema");
        h1.setApotema(sc.nextDouble());

        return h1;

    }

    public double calcularArea(Hexagono h) {
        double perimetro = h.getLado() * 6;
        double area = (perimetro * h.getApotema()) / 2;
        
        return area;
    }
    
    public double calcularPerimetro(Hexagono h){
        double perimetro = h.getLado() * 6;
              
        return perimetro;
        
    }
    

}

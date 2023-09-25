/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ej6.servicios;

import java.util.Scanner;
import poo_ej6.entidades.Nespresso;

/**
 *
 * @author Daniel
 */
public class ServicioNespresso {
     
    private Scanner sc = new Scanner(System.in);
    
    public Nespresso crearNespresso(){
        
        System.out.println("Ingrese capacidad máxima: ");
        double capacidadMaxima = sc.nextDouble();
        
        System.out.println("Ingrese Cantidad actual: ");
        double cantidadActual = sc.nextDouble();
        
               
        Nespresso n = new Nespresso(capacidadMaxima, cantidadActual);
        
        return n;
    
    }
    
    
    

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio7;

import poo_ejercicio7.entidades.Persona;
import poo_ejercicio7.servicios.PersonaService;

/**
 *
 * @author Daniel
 */
public class POO_Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PersonaService ps = new PersonaService();
        Persona persona1 = ps.crearPersona();
        Persona persona2= ps.crearPersona();
        Persona persona3 = ps.crearPersona();
        Persona persona4 = ps.crearPersona();
        
        //System.out.println(persona.toString()); 
              
        
        System.out.println("Peso Ideal: " + ps.calcularIMC(persona1));
        System.out.println("es mayor: " + ps.esMayorDeEdad(persona1));
        
        System.out.println("Peso Ideal: " + ps.calcularIMC(persona2));
        System.out.println("es mayor: " + ps.esMayorDeEdad(persona2));
        
        System.out.println("Peso Ideal: " + ps.calcularIMC(persona3));
        System.out.println("es mayor: " + ps.esMayorDeEdad(persona3));
        
        System.out.println("Peso Ideal: " + ps.calcularIMC(persona4));
        System.out.println("es mayor: " + ps.esMayorDeEdad(persona4));
        
        
        
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_intro;

import Entidad.Persona;

/**
 *
 * @author Daniel
 */
public class POO_Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("Daniel",25, 1035873279);
        
        System.out.println(p1.nombre);
    }
    
}

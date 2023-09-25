/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3_alumno;

import servicios.AlumnoServicio;

/**
 *
 * @author Daniel
 */
public class Ej3_Alumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AlumnoServicio as = new AlumnoServicio();
        as.crearAlumno();
        double notaFinal = as.notaFinal();
        System.out.println("La nota final es: " + notaFinal);
                
                
        
    }
    
}

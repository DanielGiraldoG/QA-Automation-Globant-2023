/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Anio;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class AnioService {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void adivinarMes(Anio anio) {
        
        String mesValido;
        
        do {
            System.out.println("escriba un mes del año");
            mesValido = leer.next();
            
            
        } while (!mesValido.equalsIgnoreCase(anio.getMesSecreto()));

        System.out.println("Haz adivinado");  
    }
    
}

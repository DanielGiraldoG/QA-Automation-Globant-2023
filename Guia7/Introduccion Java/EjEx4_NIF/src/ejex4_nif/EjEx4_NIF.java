/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejex4_nif;

import entidades.NIF;
import servicios.NIFService;

/**
 *
 * @author Daniel
 */
public class EjEx4_NIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        NIFService ns = new NIFService();
        NIF nif1 = ns.crearNIF();
        NIF nif2 = ns.crearNIF();
        NIF nif3 = ns.crearNIF();
        
        ns.mostrarNIF(nif1);
        ns.mostrarNIF(nif2);
        ns.mostrarNIF(nif3);
        
        
        
    }
    
}

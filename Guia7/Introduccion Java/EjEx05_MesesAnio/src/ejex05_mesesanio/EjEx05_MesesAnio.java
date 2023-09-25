/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejex05_mesesanio;

import entidades.Anio;
import servicios.AnioService;

/**
 *
 * @author Daniel
 */
public class EjEx05_MesesAnio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AnioService as = new AnioService();
        Anio anio1 = new Anio();
        
        as.adivinarMes(anio1);
            
        
        
        
    }
    
}

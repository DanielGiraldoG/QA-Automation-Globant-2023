/*

 */
package ejex4_poo_digitoverificador;

import entidades.NIF;
import servicios.NIFServicio;


public class EjEx4_POO_DigitoVerificador {

 
    public static void main(String[] args) {
       
        NIFServicio ns = new NIFServicio();
        NIF nif1 = ns.crearNIF();
        
        ns.mostrarNIF(nif1);
        
        
        
    }
    
}

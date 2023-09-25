
package ejex2_poo_puntos;

import entidades.Punto;
import servicios.PuntoServicio;


public class EjEx2_POO_Puntos {


    public static void main(String[] args) {
    
        PuntoServicio ps = new PuntoServicio();
        Punto p1 = ps.crearPuntos();
        
        System.out.println(ps.calcularDistancia(p1));
        
        
    }
    
}

/*


 */
package ejex06_ahorcado;

import entidades.Ahorcado;
import servicios.AhorcadoService;

/**
 *
 * @author Daniel
 */
public class EjEx06_Ahorcado {


    public static void main(String[] args) {
        // TODO code application logic here
        
        AhorcadoService as  = new AhorcadoService();
        Ahorcado ahorcado1  = as.crearJuego();
        
        as.juego(ahorcado1);
        
        
        
        
    }
    

    
}

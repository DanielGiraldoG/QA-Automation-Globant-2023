/*
 
 */
package relaciones_ej1_personaperro;

import entidades.Perro;
import entidades.Persona;

/**
 *
 * @author Daniel
 */
public class Relaciones_Ej1_PersonaPerro {

   
    public static void main(String[] args) {
        
        Perro perro1 = new Perro("Lia", "Criollo", 1, "mediano");
        Perro perro2 = new Perro("Chiquito", "Criollo", 6, "Chico");
        
        Persona persona1 = new Persona("Daniel", "Giraldo", 27, 10358, perro1);
        Persona persona2 = new Persona("Juan", "Serrudo", 36, 10355, perro2);
        
        System.out.println(persona1);
        System.out.println(perro1);
        System.out.println("-------------------");
        System.out.println(persona2.toString());
        
    }
    
}

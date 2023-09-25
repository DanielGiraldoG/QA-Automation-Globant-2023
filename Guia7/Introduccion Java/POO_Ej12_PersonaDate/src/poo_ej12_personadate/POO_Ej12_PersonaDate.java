package poo_ej12_personadate;

import entidades.Persona;
import servicios.PersonaServicio;

public class POO_Ej12_PersonaDate {

    public static void main(String[] args) {
        // TODO code application logic here
        PersonaServicio sc = new PersonaServicio();
        Persona p1 = sc.crearPersona();

        sc.calcularEdad(p1);
        System.out.println(p1.toString());

    }

}

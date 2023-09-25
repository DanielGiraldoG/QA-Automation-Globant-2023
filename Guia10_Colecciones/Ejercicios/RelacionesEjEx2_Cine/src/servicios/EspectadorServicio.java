/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Espectador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class EspectadorServicio {

    private Scanner scan;

    public EspectadorServicio() {
        this.scan = new Scanner(System.in).useDelimiter("\n");

    }

    public Espectador crearEspectador() {

        Espectador espectador = new Espectador();

        System.out.println("Ingrese nombre del espectador");
        espectador.setNombre(scan.next());
        System.out.println("Ingrese la edad del espectador");
        espectador.setEdad(scan.nextInt());
        System.out.println("Ingrese el dinero disponible");
        espectador.setDineroDisponible(scan.nextInt());

        return espectador;

    }
    
    public ArrayList<Espectador> inicializarEspectadores(){
        ArrayList<Espectador> espectadores = new ArrayList();
        
        Espectador espectador1 = new Espectador("Daniel", 27, 100);
        Espectador espectador2 = new Espectador("Lis", 29, 150);
        Espectador espectador3 = new Espectador("Natalia", 25, 125);
        Espectador espectador4 = new Espectador("Juan", 27, 20);
        Espectador espectador5 = new Espectador("Valentino", 18, 10);
        Espectador espectador6 = new Espectador("Cristian", 20, 200);
        Espectador espectador7 = new Espectador("Manuela", 30, 400);
        Espectador espectador8 = new Espectador("Carlos", 40, 50);
        
        espectadores.add(espectador1);
        espectadores.add(espectador2);
        espectadores.add(espectador3);
        espectadores.add(espectador4);
        espectadores.add(espectador5);
        espectadores.add(espectador6);
        espectadores.add(espectador7);
        espectadores.add(espectador8);
        
         
        
        return espectadores;
    }
    
    
}

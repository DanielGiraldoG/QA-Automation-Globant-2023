/*
     Agregar un método de creación del objeto que respete la siguiente firma:
    crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
    usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
    fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.

     Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
    en cuenta que para conocer la edad de la persona también se debe conocer la fecha
    actual.

     Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
    edad y retorna true en caso de que el receptor tenga menor edad que la persona que
    se recibe como parámetro, o false en caso contrario.

     Metodo mostrarPersona(): este método muestra la persona creada en el método
    anterior.
 */
package servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class PersonaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        Date fecha = new Date();
        Persona p = new Persona();
        
        System.out.println("Ingrese un nombre");
        p.setNombre(leer.nextLine());
        
        System.out.println("día, mes y fecha de nacimiento");
        int dia = leer.nextInt();
        int mes = leer.nextInt();
        int anio = leer.nextInt()-1900;
        
        fecha.setYear(anio);
        fecha.setMonth(mes);
        fecha.setDate(dia);
        
        
        p.setFecha(fecha);
        
        return p;
        
        
    }
    
    public void calcularEdad(Persona p){
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - p.getFecha().getYear();
        System.out.println("La edad de la persona es: " + edad);
        
        
        
    }
    
    public boolean menorQue(Persona p, int fecha){
        
        return p.getFecha().getYear() < fecha;
        
    }
    

    
    
}

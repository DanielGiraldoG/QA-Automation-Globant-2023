/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package poo_ej1;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class POO_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro l1 = new Libro();
        //IngresarDatos(l1);
        
        Libro l2 = new Libro("ZAX", "QAW", "ZZ", 10);
        l2.setAutor("New");
        
        System.out.println(l2.autor);
        System.out.println(l2.getAutor());
        
//MostrarLibro(l1);
        //Libro l2 = new Libro("ZAX", "QAW", "ZZ", 10);
        //MostrarLibro(l2);

    }

    public static void IngresarDatos(Libro l1) {
       
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese ISBN: ");
        l1.isbn = leer.nextLine();
        
        System.out.println("Ingrese Titulo");
        l1.titulo = leer.nextLine();
        
        System.out.println("Ingrese Autor");
        l1.autor = leer.nextLine();
       
        System.out.println("Ingrese Numero de paginas");
        l1.nPaginas = leer.nextInt();
        
        
        
    }
    
    public static void MostrarLibro(Libro l){
        System.out.println("ISBN:" + l.isbn + "\nTitulo: " + l.titulo + "\nAutor: " + l.autor + "\nNúmero de páginas: " + l.nPaginas);
    }
     

}

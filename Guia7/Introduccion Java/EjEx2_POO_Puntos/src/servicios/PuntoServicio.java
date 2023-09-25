/*
 Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
 */
package servicios;

import entidades.Punto;
import java.util.Scanner;

public class PuntoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Punto crearPuntos(){
        Punto p = new Punto();
        
        System.out.println("Ingrese coordenadas x1,x2,y1,y2");
        p.setX1(leer.nextInt());
        p.setX2(leer.nextInt());
        p.setY1(leer.nextInt());
        p.setY1(leer.nextInt());
        
        
        return p;
        
    }
    
    
    public double calcularDistancia(Punto p){
        
        int x1 = p.getX1();
        int x2 = p.getX2();
        int y1 = p.getY1();
        int y2 = p.getY2();
        
        double distancia = Math.sqrt((Math.pow(x2-x1, 2)) + (Math.pow(y2-y1, 2)));
        
        return distancia;
    }
    
}

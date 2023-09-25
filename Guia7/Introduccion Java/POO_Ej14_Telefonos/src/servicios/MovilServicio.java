/*
  Un constructor por defecto.
     Un constructor con todos los atributos como parámetro.
     Métodos getters y setters de cada atributo.
     Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
    instanciar un objeto Celular y poder cargarlo en nuestro programa.
     Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
    números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package servicios;

import entidades.Movil;
import java.util.Scanner;

public class MovilServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Movil cargarCelular() {

        Movil m = new Movil();

        System.out.println("Ingrese la marca ");
        m.setMarca(leer.next());

        System.out.println("Ingrese el modelo");
        m.setModelo(leer.next());

        System.out.println("Ingrese el precio en $");
        m.setPrecio(leer.nextDouble());

        System.out.println("Ingrese la capacidad de la memoria ram");
        m.setMemoriaRam(leer.nextInt());

        System.out.println("Ingrese la capacidad de almacenamiento");
        m.setAlmacenamiento(leer.nextInt());

        return m;

    }

    public void ingresarCodigo(Movil m) {

        int[] arregloCodigos = new int[m.getCodigo().length];

        for (int i = 0; i < arregloCodigos.length; i++) {
            System.out.println("Ingrese el número del codigo correspondiente a la posicion " + (i + 1) );
            arregloCodigos[i] = leer.nextInt();

        }

        m.setCodigo(arregloCodigos);

    }

}

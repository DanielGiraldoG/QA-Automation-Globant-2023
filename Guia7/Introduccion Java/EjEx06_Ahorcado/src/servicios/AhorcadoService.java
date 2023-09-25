/*






Un ejemplo de salida puede ser así:

Ingrese una letra:
a
Longitud de la palabra: 6
Mensaje: La letra pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 4
----------------------------------------------
Ingrese una letra:
z
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (3,4)
Número de oportunidades restantes: 3
---------------------------------------------
Ingrese una letra:
b
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 2
----------------------------------------------
Ingrese una letra:
u
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Número de letras (encontradas, faltantes): (4,3)
Número de oportunidades restantes: 1
----------------------------------------------
Ingrese una letra:

q
Longitud de la palabra: 6
Mensaje: La letra no pertenece a la palabra
Mensaje: Lo sentimos, no hay más oportunidades
 */
package servicios;

import entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    /*
     Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
    Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
    vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
    de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
    máximas, el valor que ingresó el usuario y encontradas en 0.
     */
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int contadorEncontrados = 0;
    static int contadorNoEncontrados = 0;
    //String letra = "";

    public Ahorcado crearJuego() {

        Ahorcado ahorcado = new Ahorcado();

        System.out.println("Ingrese la palabra que desea adivinar");

        String palabraUsuario = leer.next();
        String[] vectorPalabra = new String[palabraUsuario.length()];

        for (int i = 0; i < palabraUsuario.length(); i++) {
            vectorPalabra[i] = palabraUsuario.substring(i, i + 1);
        }

        ahorcado.setPalabraBuscar(vectorPalabra);

        System.out.println("Ingrese la cantidad de juegos máximos");
        ahorcado.setCantidadJuegosMaximos(leer.nextInt());

        ahorcado.setCantidadLetrasEncontradas(0);

        return ahorcado;

    }

    /*
     Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
    buscar como se usa el vector.length.
     */
    public int hallarLongitud(Ahorcado ahorcado) {

        int longitud = ahorcado.getPalabraBuscar().length;

        return longitud;
    }

    /*
     Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
    letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    
     */
    public boolean buscarLetra(Ahorcado ahorcado, String letra) {

//        System.out.println("Ingrese una letra: ");
//        letra = leer.next();
//        
        boolean encontrado = false;

        for (String palabraBuscar : ahorcado.getPalabraBuscar()) {
            if (palabraBuscar.equalsIgnoreCase(letra)) {

                System.out.println("La letra es parte de la palabra");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("La letra no es parte de la palabra");
        }
        return encontrado;

    }

    /*
     Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
    cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
    devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
    busque una letra que no esté, se le restará uno a sus oportunidades.
    
     */
    public static boolean encontradas(Ahorcado ahorcado, String letra) {

        int letrasEncontradas = ahorcado.getCantidadLetrasEncontradas();
        contadorNoEncontrados = ahorcado.getPalabraBuscar().length - letrasEncontradas;
        boolean encontrado = false;

        for (String letraBuscar : ahorcado.getPalabraBuscar()) {
            if (letraBuscar.equalsIgnoreCase(letra)) {
                letrasEncontradas++;
                ahorcado.setCantidadLetrasEncontradas(letrasEncontradas);

                contadorNoEncontrados--;
                encontrado = true;
            } else {
                encontrado = false;

            }

        }

        System.out.println("Número de letras (encontradas, faltantes):"
                + "( " + ahorcado.getCantidadLetrasEncontradas() + " , " + contadorNoEncontrados + ")");

        return encontrado;

    }

    /*
    

     Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
     */
    public void mostrarIntentos(Ahorcado ahorcado, String letra) {

        int nIntentos = ahorcado.getCantidadJuegosMaximos();

        if (!buscarLetra(ahorcado, letra)) {
            nIntentos--;

        }

        ahorcado.setCantidadJuegosMaximos(nIntentos);
        System.out.println("Número de intentos: " + nIntentos);

    }

    /*
    
    

     Método juego(): el método juego se encargará de llamar todos los métodos
    previamente mencionados e informará cuando el usuario descubra toda la palabra o
    se quede sin intentos. Este método se llamará en el main.
     
    
     */
    public void juego(Ahorcado ahorcado) {

        int intentos;
        contadorNoEncontrados = ahorcado.getPalabraBuscar().length;

        do {
            intentos = ahorcado.getCantidadJuegosMaximos();
            System.out.println("Favor ingrese una letra: ");
            String letra = leer.next();

//            System.out.println("no encontrados: " + contadorNoEncontrados);
//            System.out.println("intentos: " + intentos);
//            System.out.println("");

            hallarLongitud(ahorcado);
            buscarLetra(ahorcado, letra);

            if (intentos == 0) {
                System.out.println("Lo sentimos no hay más oportunidades");
                break;
                
            } else {
                encontradas(ahorcado, letra);
                mostrarIntentos(ahorcado, letra);

            }

//            System.out.println("no encontrados: " + contadorNoEncontrados);
//            System.out.println("intentos: " + intentos);

        } while (intentos > 0 && (contadorNoEncontrados> 0));

        if (contadorNoEncontrados == 0) {
            System.out.println("Felicidades has encontrado la palabra");
        }
        
    }

}

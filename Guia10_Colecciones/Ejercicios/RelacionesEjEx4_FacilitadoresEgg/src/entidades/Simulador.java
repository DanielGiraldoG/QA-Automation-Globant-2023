/*Además, crearemos una clase Simulador que va a
tener los métodos para manejar los alumnos y sus votaciones. Estos métodos serán llamados
desde el main.

La clase Simulador debe tener un método que genere un listado de alumnos manera
aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.


Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
debe retornar la lista de dnis.


• Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de
objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos
listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si con el
mismo nombre.


• Se debe imprimir por pantalla el listado de alumnos.


• 



• Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
para cada alumno genera tres votos de manera aleatoria. En este método debemos
guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
mismo alumno. Utilizar un hashset para resolver esto.
• Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales
fueron sus 3 votos.

13
• Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y
comienza a hacer el recuento de votos.
• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5
facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, mostrar
los 5 facilitadores y los 5 facilitadores suplentes.


 */
package entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Simulador {

    ArrayList<String> nombres;
    ArrayList<String> apellidos;
    

    public Simulador() {
        nombres = new ArrayList<>(Arrays.asList("Daniel", "Lis", "Juan", "Camilo",
            "Daniela", "Natalia", "Cristian", "Eli", "Ana"));
        
        apellidos = new ArrayList<>(Arrays.asList("Giraldo", "Rivas", "Garcia", "Gallego",
            "Gomez", "Segura"));
    }

    public ArrayList<Alumno> inicializar() {
        
        Random random = new Random();
        
        
        
        
        
        
        return alumnos
    }

}

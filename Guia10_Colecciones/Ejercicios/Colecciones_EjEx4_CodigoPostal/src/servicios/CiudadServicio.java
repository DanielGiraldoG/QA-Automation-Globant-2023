/*
• Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos
 */
package servicios;

import entidades.Ciudad;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CiudadServicio {

    Scanner scan;

    public CiudadServicio() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
    }

    public Ciudad crearCiudad() {

        Ciudad ciudad = new Ciudad();

        System.out.println("Ingrese el nombre de la ciudad: ");
        ciudad.setNombre(scan.next());
        System.out.println("Ingrese el codigo postal de la ciudad");
        ciudad.setCodigoPostal(scan.nextInt());

        return ciudad;

    }

    public void agregarCiudadAMapa(HashMap<Integer, String> ciudades) {

        Ciudad ciudad = crearCiudad();
        ciudades.put(ciudad.getCodigoPostal(), ciudad.getNombre());
    }

    public void mostrarCiudades(HashMap<Integer, String> ciudades) {

        int i = 1;

        for (Map.Entry<Integer, String> entry : ciudades.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println(i + ". Codigo Postal : " + key + ", Ciudad: " + value);
            i++;

        }
    }

    public void encontrarCiudad(HashMap<Integer, String> ciudades) {

        System.out.println("Ingrese la ciudad que desea buscar: ");
        int codigoBuscado = scan.nextInt();

        if (ciudades.containsKey(codigoBuscado)) {
            System.out.println("Se ha encontrado la ciudad en la base de datos \n"
                    + "la ciudad es : " + ciudades.get(codigoBuscado));
        } else {
            System.out.println("La ciudad no se ha encontrado");

        }
    }

    public void agregarDiezCiudades(HashMap<Integer, String> ciudades) {

        ciudades.put(78267, "Aach");
        ciudades.put(79280, "Au");
        ciudades.put(78166, "Aasen");
        ciudades.put(77855, "Achem");
        ciudades.put(79618, "Adelhausen");
        ciudades.put(79674, "Aftersteg");
        ciudades.put(79809, "Aisperg");
        ciudades.put(78554, "Aixheim");
        ciudades.put(79837, "Albtal");
        ciudades.put(78476, "Allensbach");
    }

    public void eliminarCiudades(HashMap<Integer, String> ciudades) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el codigo postal de la ciudad");
            int ciudadEliminar = scan.nextInt();

            ciudades.remove(ciudadEliminar);

        }
        System.out.println("Ha eliminado las tres ciudades");

    }

}

/*

 */
package servicios;

import java.util.HashMap;
import java.util.Scanner;

public class CiudadApp {

    HashMap<Integer, String> ciudades;
    Scanner scan;

    public CiudadApp() {
        this.ciudades = new HashMap();
        this.scan = new Scanner(System.in).useDelimiter("\n");
    }

    public void iniciarApp() {

        CiudadServicio cs = new CiudadServicio();
        int opcion ;
        
        do {
            menu();
            opcion = scan.nextInt();
            
            switch (opcion) {
                case 1:
                    cs.agregarCiudadAMapa(ciudades);
                    break;
                case 2:
                    cs.agregarDiezCiudades(ciudades);
                    break;
                case 3:
                    cs.mostrarCiudades(ciudades);
                    break;
                    
                case 4:
                    cs.eliminarCiudades(ciudades);
                    break;
                case 5:
                    cs.encontrarCiudad(ciudades);
                    break;
                case 6:
                    System.out.println("Has salido del programa");
                    break;
                
                default:
                    System.out.println("Opcion invalida, favor ingrese "
                            + "nuevamente una opcion");
            }
            
            
        } while (opcion!=6);
        

    }

    public void menu() {

        System.out.println("-----------MENU------------");
        System.out.println("1. Agregar ciudad");
        System.out.println("2. Agregar diez ciudades");
        System.out.println("3. Mostrar ciudades");
        System.out.println("4. Eliminar 3 ciudades");
        System.out.println("5. encontrar ciudad");        
        System.out.println("6. Salir");
        System.out.println("----------------------");

    }

}



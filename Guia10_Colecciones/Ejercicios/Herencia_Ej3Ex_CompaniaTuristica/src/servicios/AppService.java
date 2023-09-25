/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Alojamiento;
import entidades.Camping;
import entidades.Hotel4Estrellas;
import entidades.Hotel5Estrellas;
import entidades.Residencia;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class AppService {

    ArrayList<Alojamiento> alojamientos = new ArrayList();

    public void iniciar() {

        Scanner leer = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            menu();

            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    inicializar();
                    break;
                case 2:
                    mostrarAlojamientos();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default: // En caso de que el numero ingresado no corresponda a ningún "case"
                    System.out.println("Opcion invalida!!!!!!!");
            }
        }
    }

    public void menu() {
        System.out.println("----------------MENU----------------");
        System.out.println(" 1 - Inicializar lista Alojamiento");
        System.out.println(" 2 - Mostrar lista alojamientos");
        System.out.println(" 3 - Mostrar lista hoteles en precio descendente");
        System.out.println(" 4 - Mostrar campings con restaurantes");
        System.out.println(" 5 - Mostrar residencias que tienen descuentos");
        System.out.println(" 0 - Salir ");
        System.out.print("Ingrese opcion: ");

    }

    public void inicializar() {

        Alojamiento hotel1 = new Hotel4Estrellas("A", "ElCielo", 20, 50, 2, 4, "Marriott", "Calle 50", "Medellin", "Daniel");
        Alojamiento hotel2 = new Hotel4Estrellas("B", "ElJardin", 15, 30, 3, 3, "Gallery", "Calle 51", "Medellin", "Paola");
        Alojamiento hotel3 = new Hotel5Estrellas(2, 1, 5, "B", "IlForno", 10, 30, 1, 5, "Gallery5Stars", "Calle 52", "Medellin", "Juan");
        Alojamiento extraHotel1 = new Camping(5, 2, true, true, 20, "San Rafel", "Avenida las palmas", "Medellin", "Cristian");
        Alojamiento extraHotel2 = new Residencia(4, false, true, true, 40, "San Rafel2", "Avenida las palmas2", "Medellin", "Fernando");
        
        alojamientos.add(hotel1);
        alojamientos.add(hotel2);
        alojamientos.add(hotel3);
        alojamientos.add(extraHotel1);
        alojamientos.add(extraHotel2);
        
        
    }
    
    public void mostrarAlojamientos(){
        
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento);
        }
        
    }
    
    
    
    

}

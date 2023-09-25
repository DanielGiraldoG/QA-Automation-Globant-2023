/*

 */
package servicios;

import entidades.Lavadora;
import java.util.ArrayList;
import java.util.Scanner;

public class AppService {

    public void iniciar() {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        Lavadora lavadora = new Lavadora();
        ArrayList<Lavadora> lavadoras = new ArrayList();
        
        int opcion;

        do {
            menu();
            opcion = scan.nextInt();
            System.out.print("Ingrese una opcion: ");

            switch (opcion) {
                case 1:
                    lavadora = lavadora.crearLavadora();
                    lavadoras.add(lavadora);
                    System.out.println(lavadora.toString());;
                    System.out.println("Has creado el producto con exito");
                    break;
                case 2:
                    System.out.println("Opcion en mantenimiento");
                    break;
                    
                case 3:
                    mostrarLista(lavadoras);
                    break;
                case 4:
                  System.out.println("Has salido del programa");
                    break;
                default:
                    System.out.println("Opcion invalida, por favor ingrese una nueva opcion");
            }

        } while (opcion != 4);

    }



    public void menu() {
        System.out.println("");
        System.out.println("-------------MENU-----------");
        System.out.println("1. Crear Lavadora");
        System.out.println("2. Crear Televisor ");
        System.out.println("3. Mostrar Lista");
        System.out.println("4. Salir");
        System.out.println("----------------------------");

    }
    

    public void mostrarLista(ArrayList<Lavadora> lavadoras){
        
        for (Lavadora lavadora : lavadoras) {
            System.out.println(lavadora);
        }
            
        }
        
        
    }


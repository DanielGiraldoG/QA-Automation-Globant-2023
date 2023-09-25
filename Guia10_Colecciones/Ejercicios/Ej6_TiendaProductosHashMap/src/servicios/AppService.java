/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class AppService {

    TiendaServicio ts = new TiendaServicio();
    Scanner scan;

    public AppService() {
        scan = new Scanner(System.in).useDelimiter("\n");

    }

    public void menu() {

        System.out.println("------------------ MENÚ-------------");
        System.out.println("1. Agregar producto a tienda");
        System.out.println("2. Modificar Producto");
        System.out.println("3. Eliminar producto");
        System.out.println("4. Mostrar productos");
        System.out.println("5. Salir");

    }

    public void iniciar() {
        int option;

        do {
            menu();
            option = scan.nextInt();

            switch (option) {
                case 1:
                    ts.agregarProductoATienda();
                    break;
                case 2:
                    ts.modificarPrecio();
                    break;
                case 3:
                    ts.eliminarProducto();
                    break;
                case 4:
                    ts.mostrarTienda();
                    break;
                case 5:
                    System.out.println("Has salido de la tienda........");
                    break;

                default:
                    System.out.println("Opción invalida, ingrese nuevamente una opción");
            }

        } while (option != 5);

    }

}

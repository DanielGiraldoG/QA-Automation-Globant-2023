/*

Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package servicios;

import entidades.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServicio {

    Scanner scan;
    HashMap<String, Double> productos;

    public TiendaServicio() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
        this.productos = new HashMap();
    }

    public Tienda crearProducto() {

        Tienda tienda = new Tienda();

        System.out.println("Ingrese el nombre del producto");
        tienda.setNombreProducto(scan.next());

        System.out.println("Ingrese el precio del producto");
        tienda.setPrecio(scan.nextDouble());

        return tienda;
    }

    public void agregarProductoATienda() {

        Tienda tienda = crearProducto();
        productos.put(tienda.getNombreProducto(), tienda.getPrecio());

    }

    public void modificarPrecio() {

        mostrarTienda();
        System.out.println("Ingrese el nombre del producto que desea modificar");
        String productoModificar = scan.next();

        if (productos.containsKey(productoModificar)) {
            System.out.println("Ingrese el nuevo precio del producto");
            Double precioModificar = scan.nextDouble();
            productos.put(productoModificar, precioModificar);
            System.out.println("El producto se ha modificado correctamente");
            mostrarTienda();
        } else {
            System.out.println("Lo sentimos, no hemos podido encontrar el "
                    + "elemento deseado");

        }

    }

    public void mostrarTienda() {

        int i = 1;

        System.out.println("------Lista Actual de la tienda---------");

        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();

            System.out.println( "Producto " + i + " : " + key + " , Precio: " + value);
            i++;
        }

    }

    public void eliminarProducto() {
        mostrarTienda();
        System.out.println("Ingrese el nombre del producto que desea eliminar");
        String productoModificar = scan.next();

        if (productos.containsKey(productoModificar)) {
            productos.remove(productoModificar);
            mostrarTienda();
        } else {
            System.out.println("Lo sentimos, no hemos podido encontrar el "
                    + "elemento deseado, el mapa se mantiene de la siguiente manera");
            mostrarTienda();
        }

    }

}

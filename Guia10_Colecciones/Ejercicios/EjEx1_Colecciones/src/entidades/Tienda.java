/*
Método venta(): El usuario ingresa el nombre del producto que quiere comprar y se lo busca en el
ArrayList. Si está en el ArrayList, se llama con ese objeto Producto al método. El método se
decrementa de a uno, como un carrito de compras, el atributo cantidad en inventario, del producto que
ingresó el usuario. Esto sucederá cada vez que se realice una venta del producto. No se podrán vender
productos de los que no queden inventario disponible para vender. Devuelve true si se ha podido
realizar la operación y false en caso contrario.


Método reposición(): El usuario ingresa el nombre del producto que quiere reponer y se lo busca en el
ArrayList. Si está en el ArrayList, se llama con ese objeto al método. El método incrementa de a uno,
como un carrito de compras, el atributo cantidad en inventario, del producto seleccionado por el
usuario. Esto sucederá cada vez que se produzca una reposición de un producto.
Método toString para mostrar los datos de los productos.
 */
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

    Scanner scan;

    public Tienda() {
        scan = new Scanner(System.in).useDelimiter("\n");
    }

    public boolean crearVenta(ArrayList<Producto> productos) {

        
        
        boolean isVentaValida = false;

        System.out.println("Por favor ingrese el nombre del producto que desea comprar");
        String productoAComprar = scan.next();

//        for (int i = 0; i < productos.size(); i++) {
//            if (productoAComprar.equalsIgnoreCase(productos.get(i).getNombre())) {
//                productos.get(i).setInventario((productos.get(i).getInventario()-1)); 
//            }
//            
//            
//        }
        for (Producto producto : productos) {
            if (productoAComprar.equalsIgnoreCase(producto.getNombre())) {
                if (producto.getInventario() == 0) {
                    isVentaValida = false;
                    System.out.println("El producto no tiene inventario no fué"
                            + " posible realizar la venta");
                } else {
                    producto.setInventario((producto.getInventario() - 1));
                    isVentaValida = true;
                    break;
                }

            }

        }
        return isVentaValida;

    }

    public void reposicion(ArrayList<Producto> productos) {

        System.out.println("Por favor ingrese el nombre del producto que desea reponer");
        String productoAReponer = scan.next();
        
         for (Producto producto : productos) {
            if (productoAReponer.equalsIgnoreCase(producto.getNombre())) {
                producto.setInventario((producto.getInventario() + 1));
                break;
            }
        
    }
    }
}

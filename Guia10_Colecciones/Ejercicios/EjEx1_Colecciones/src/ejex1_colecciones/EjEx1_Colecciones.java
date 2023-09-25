
package ejex1_colecciones;

import entidades.Tienda;
import servicios.ProductoServicio;

public class EjEx1_Colecciones {


    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        ProductoServicio ps = new ProductoServicio();
        Tienda tienda1 = new Tienda();
        
        
        
        ps.agregarALista();
        System.out.println("-----------------");
        ps.mostrarLista();
        System.out.println("-----------------");
        
        
         
        tienda1.crearVenta(ps.getProductos());
        ps.mostrarLista();
        System.out.println("-----------------");
        
        
        tienda1.reposicion(ps.getProductos());
        ps.mostrarLista();
        System.out.println("-----------------");
        
        
        
        
    }
    
}

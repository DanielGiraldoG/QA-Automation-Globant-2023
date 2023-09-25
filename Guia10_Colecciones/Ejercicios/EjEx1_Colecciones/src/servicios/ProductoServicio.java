/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Producto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ProductoServicio {

    ArrayList<Producto> productos;
    Scanner scan;
    

    public ProductoServicio() {
        
        this.scan = new Scanner(System.in).useDelimiter("\n");
        this.productos = new ArrayList();

    }

    public Producto crearProducto() {

            Producto producto = new Producto();
            
            System.out.println("Por favor ingrese el nombre del producto ");
            producto.setNombre(scan.next());
            System.out.println("Por favor ingrese la categoria del producto ");
            producto.setCategoria(scan.next());
            System.out.println("Por favor ingrese el precio del producto en USD");
            producto.setPrecio(scan.nextDouble());
            System.out.println("Por favor ingrese el inventario inicial del producto");
            producto.setInventario(scan.nextInt());
                
            
            
            return producto;
   }
    
    
    public void agregarALista(){
        
        boolean opcion = false;
        Producto producto1;
        
        do {
            producto1 = crearProducto();
            
            productos.add(producto1);
            System.out.println("Desea ingresar otro producto: ( S / N )");
            opcion = scan.next().equalsIgnoreCase("S");
            
            
        } while (opcion);
        
        
        
    }
    
    public void mostrarLista(){
        
        for (Producto producto1 : productos) {
            System.out.println(producto1);
        }
        
        
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }
    
    
    
    

    
    

}

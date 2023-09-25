/*
Implementa un programa para una tienda de productos utilizando un ArrayList. Para ello, se debe crear una
clase llamada Producto que guarde la información de cada uno de los productos de la tienda. La clase
Producto debe guardar el nombre del producto, la categoría, el precio y la cantidad en inventario.
En el main, se creará un ArrayList de tipo Producto que guardará todos los productos creados. A
continuación, tendrás que crear un bucle que solicite al usuario los datos de cada producto y los setee en
el objeto Producto correspondiente, que se agregará al ArrayList
 */
package entidades;


public class Producto {
    
    
    private String nombre;
    private String categoria;
    private double precio;
    private int inventario;

    public Producto() {
    }

    public Producto(String nombre, String categoria, double precio, int inventario) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.inventario = inventario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", inventario=" + inventario + '}';
    }
    
    
    
    
    
}

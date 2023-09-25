
package servicios;

import entidades.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public Cliente registrarCliente(ArrayList<Cliente> clientes ){
        
        Cliente cliente = new Cliente();
        
        System.out.println("Ingrese el id:");
        cliente.setId(leer.nextInt());
        
        System.out.println("Ingrese el nombre");
        cliente.setNombre(leer.next());
        
        System.out.println("Ingrese la edad");
        cliente.setEdad(leer.nextInt());
        
        System.out.println("Ingrese la altura en m");
        cliente.setAltura(leer.nextDouble());
        
        System.out.println("Ingrese el peso en kg");
        cliente.setPeso(leer.nextDouble());
        
        System.out.println("Ingrese el objetivo\nAdelgazar\nAumentar Masa Muscular\nDefinición");
        cliente.setObjetivo(leer.next());
        
        clientes.add(cliente);
        
        return cliente;
          
    }
    
    public void obtenerClientes(ArrayList<Cliente> clientes ){
        
        for (Cliente cliente: clientes) {
            System.out.println(cliente);
        }
    }
    
    public void actualizarCliente(ArrayList<Cliente> clientes, String nombre, int edad, double altura, double peso, String objetivo){
        
       System.out.println("Ingrese el Id del cliente que desea actualizar");
       int id = leer.nextInt();
       
              
       
        
        for (Cliente cliente:clientes) {
            if (id == cliente.getId()) {
                cliente.setNombre(nombre);
                cliente.setEdad(edad);
                cliente.setAltura(altura);
                cliente.setPeso(peso);
                cliente.setObjetivo(objetivo);
                break;
            }
        }
               
    }
    
    public void eliminarCliente(ArrayList<Cliente> clientes, int id){
        
        for (Cliente cliente:clientes) {
            if (id == cliente.getId()) {
                    clientes.remove(cliente);
                break;
            }
        }
        
    }
    
    
    
    
    
    
}


package main;

import entidades.Cliente;
import java.util.ArrayList;
import servicios.ClienteService;


public class Main {
    public static void main(String[] args) {
        
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        ClienteService cs = new ClienteService();
        Cliente cliente1 = cs.registrarCliente(clientes);
        Cliente cliente2 = cs.registrarCliente(clientes);
        
        cs.obtenerCliente(clientes);
        System.out.println("-----------");
        
        
        cs.actualizarCliente(clientes, 0, "Lis", 29, 160, 50, "Definicion");
        cs.obtenerCliente(clientes);
        System.out.println("------------");
        cs.eliminarCliente(clientes, 0);
        cs.obtenerCliente(clientes);
        
        
        
        
        
        
    }
}

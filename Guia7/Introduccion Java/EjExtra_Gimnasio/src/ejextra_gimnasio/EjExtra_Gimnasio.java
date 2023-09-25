
package ejextra_gimnasio;

import entidades.Cliente;
import java.util.ArrayList;
import servicios.ClienteServicio;


public class EjExtra_Gimnasio {


    public static void main(String[] args) {
        
        ArrayList<Cliente> clientes1 = new ArrayList<>();
        ClienteServicio cs = new ClienteServicio();
        
        Cliente cliente1 = cs.registrarCliente(clientes1);
        cs.obtenerClientes(clientes1);
        System.out.println("----------");
        cs.actualizarCliente(clientes1, "Daniel", 20, 1.7, 70, "Definicion");
        
        cs.obtenerClientes(clientes1);
        
        
        
        
        
        
    }
    
}

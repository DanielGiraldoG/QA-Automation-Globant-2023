package servicios;

import entidades.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cliente registrarCliente(ArrayList<Cliente> clientes) {

        Cliente cliente = new Cliente();

        System.out.println("Ingrese el id: ");
        cliente.setId(leer.nextInt());

        System.out.println("Ingrese el nombre:");
        cliente.setNombre(leer.next());

        System.out.println("Ingrese la edad:");
        cliente.setEdad(leer.nextInt());

        System.out.println("Ingrese la altura en centimetros:");
        cliente.setAltura(leer.nextInt());

        System.out.println("Ingrese el peso en kg:");
        cliente.setPeso(leer.nextDouble());

        System.out.println("Ingrese el objetivo del cliente: \nAdelgazar\nMasa muscular\nDefinicion ");
        cliente.setObjetivo(leer.next());

        clientes.add(cliente);

        return cliente;

    }

    public void obtenerCliente(ArrayList<Cliente> clientes) {

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).toString());
        }
    }

    public void actualizarCliente(ArrayList<Cliente> clientes, int id, String nombre, int edad, int altura, double peso, String objetivo) {

        for (Cliente cliente : clientes) {
            if (id == cliente.getId()) {
                cliente.setNombre(nombre);
                cliente.setEdad(edad);
                cliente.setAltura(altura);
                cliente.setPeso(peso);
                cliente.setObjetivo(objetivo);
            }

        }

    }

    public void eliminarCliente(ArrayList<Cliente> clientes, int id) {
//        for (Cliente cliente : clientes) {
//            if (id == cliente.getId()) {
//            
//                clientes.remove(cliente);
//            }
//
//        }
        for (int i = 0; i < clientes.size(); i++) {
            if (id == clientes.get(i).getId()) {
                clientes.remove(i);
            }
            
        }

    }

}

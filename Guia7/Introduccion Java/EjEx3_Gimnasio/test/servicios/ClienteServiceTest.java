/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cliente;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
//
/**
 *
 * @author Daniel
 */
public class ClienteServiceTest {
    
    public ClienteServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of registrarCliente method, of class ClienteService.
     */
    @Test
    public void testRegistrarCliente() {
        System.out.println("registrarCliente");
        ArrayList<Cliente> clientes = null;
        ClienteService instance = new ClienteService();
        Cliente expResult = null;
        Cliente result = instance.registrarCliente(clientes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCliente method, of class ClienteService.
     */
    @Test
    public void testObtenerCliente() {
        System.out.println("obtenerCliente");
        ArrayList<Cliente> clientes = null;
        ClienteService instance = new ClienteService();
        instance.obtenerCliente(clientes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarCliente method, of class ClienteService.
     */
    @Test
    public void testActualizarCliente() {
        System.out.println("actualizarCliente");
        ArrayList<Cliente> clientes = null;
        int id = 0;
        String nombre = "";
        int edad = 0;
        int altura = 0;
        double peso = 0.0;
        String objetivo = "";
        ClienteService instance = new ClienteService();
        instance.actualizarCliente(clientes, id, nombre, edad, altura, peso, objetivo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarCliente method, of class ClienteService.
     */
    @Test
    public void testEliminarCliente() {
        System.out.println("eliminarCliente");
        ArrayList<Cliente> clientes = null;
        int id = 0;
        ClienteService instance = new ClienteService();
        instance.eliminarCliente(clientes, id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

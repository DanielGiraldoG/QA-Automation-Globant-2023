/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel
 */
public class NewClassTest {
    
    public NewClassTest() {
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
     * Test of getPrecio method, of class NewClass.
     */
    @org.junit.Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        NewClass instance = new NewClass();
        double expResult = 0.0;
        double result = instance.getPrecio();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio method, of class NewClass.
     */
    @org.junit.Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        double precio = 0.0;
        NewClass instance = new NewClass();
        instance.setPrecio(precio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescuento method, of class NewClass.
     */
    @org.junit.Test
    public void testGetDescuento() {
        System.out.println("getDescuento");
        NewClass instance = new NewClass();
        double expResult = 0.0;
        double result = instance.getDescuento();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescuento method, of class NewClass.
     */
    @org.junit.Test
    public void testSetDescuento() {
        System.out.println("setDescuento");
        double descuento = 0.0;
        NewClass instance = new NewClass();
        instance.setDescuento(descuento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularDescuento method, of class NewClass.
     */
    @org.junit.Test
    public void testCalcularDescuento() {
        System.out.println("calcularDescuento");
        NewClass instance = new NewClass();
        double expResult = 0.0;
        double result = instance.calcularDescuento();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

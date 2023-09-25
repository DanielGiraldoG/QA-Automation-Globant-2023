/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_discountcalculator;

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
public class DiscountCalculatorTest {

    public DiscountCalculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        //DiscountCalculator instance = new DiscountCalculator();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getPrecio method, of class DiscountCalculator.
     */
//    @Test
//    public void testGetPrecio() {
//        System.out.println("getPrecio");
//        DiscountCalculator instance = new DiscountCalculator();
//        double expResult = 0.0;
//        double result = instance.getPrecio();
//        assertEquals(expResult, result, 0.0);
//
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//
//    }
//
//    /**
//     * Test of setPrecio method, of class DiscountCalculator.
//     */
//    @Test
//    public void testSetPrecio() {
//        System.out.println("setPrecio");
//        double precio = 0.0;
//        DiscountCalculator instance = new DiscountCalculator();
//        instance.setPrecio(precio);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDescuento method, of class DiscountCalculator.
//     */
//    @Test
//    public void testGetDescuento() {
//        System.out.println("getDescuento");
//        DiscountCalculator instance = new DiscountCalculator();
//        double expResult = 0.0;
//        double result = instance.getDescuento();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDescuento method, of class DiscountCalculator.
//     */
//    @Test
//    public void testSetDescuento() {
//        System.out.println("setDescuento");
//        double descuento = 0.0;
//        DiscountCalculator instance = new DiscountCalculator();
//        instance.setDescuento(descuento);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of calcularDescuento method, of class DiscountCalculator.
//     */
//    @Test
//    public void testCalcularDescuento() {
//        System.out.println("calcularDescuento");
//        DiscountCalculator instance = new DiscountCalculator();
//        double expResult = 0.0;
//        double result = instance.calcularDescuento();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    @Test

    public void testCalcularDescuentos() {

        assertEquals(100, new DiscountCalculator(10).calcularDescuento(),0.00);
        assertEquals(500, new DiscountCalculator(50).calcularDescuento(),0.00);
      //  assertEquals(1000, new DiscountCalculator(0).calcularDescuento());

    }
    @Test
    public void testCalcularSinDescuento() {


        assertEquals(1000, new DiscountCalculator(0).calcularDescuento(),0.00);

    }
    

}

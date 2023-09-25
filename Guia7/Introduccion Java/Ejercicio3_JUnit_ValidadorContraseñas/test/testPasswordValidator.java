/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejercicio3_junit_validadorcontraseñas.PasswordValidator;
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
public class testPasswordValidator {

    public testPasswordValidator() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testValidarLongitudMinima() {

        assertFalse(new PasswordValidator("Pas").validarLongitudMinima());

    }

    @Test
    public void testValidarLongitudMaxima() {
        assertFalse(new PasswordValidator("Password12345678").validarLongitudMaxima());

    }

    @Test
    public void testValidarContraseñaValidas() {
        assertTrue(new PasswordValidator("Password1%").validarContraseña());
        assertTrue(new PasswordValidator("Password$").validarContraseña());
        assertTrue(new PasswordValidator("P!$#/").validarContraseña());
        assertFalse(new PasswordValidator("12345678").validarContraseña());
        assertFalse(new PasswordValidator("password1").validarContraseña());
        assertFalse(new PasswordValidator("password1&").validarContraseña());
        assertFalse(new PasswordValidator("").validarContraseña());
       
    }
    
    
    
    
    

}

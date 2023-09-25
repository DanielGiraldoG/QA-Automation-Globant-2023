/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ej4_junit_taskmanager.TaskManager;
import java.util.ArrayList;
import java.util.Arrays;
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
public class taskManagerTest {

    TaskManager tm = new TaskManager();

    public taskManagerTest() {

    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        ArrayList<String> test = new ArrayList<>(Arrays.asList("tarea4", "tarea5"));
//        ArrayList<String> test = {"tarea4", "tarea5"};
        tm.setListaTarea(test);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testAgregarTarea() {
        System.out.println("Test agregarTarea");
        tm.mostrarTarea();
        tm.agregarTarea("tarea1");
        assertEquals(3, tm.getListaTarea().size());
        tm.agregarTarea("tarea2");
        assertEquals(4, tm.getListaTarea().size());
        tm.agregarTarea("tarea3");
        assertEquals(5, tm.getListaTarea().size());
    }

    @Test
    public void testEliminarTarea() {
        System.out.println("Test eliminarTarea");
        tm.mostrarTarea();
        tm.eliminarTarea("tarea4");
        assertEquals(1, tm.getListaTarea().size());
        tm.eliminarTarea("tarea5");
        assertEquals(0,tm.getListaTarea().size());

    }

}

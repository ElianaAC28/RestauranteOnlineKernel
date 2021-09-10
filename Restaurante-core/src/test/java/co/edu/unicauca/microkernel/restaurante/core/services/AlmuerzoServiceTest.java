/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.microkernel.restaurante.core.services;

import co.edu.unicauca.microkernel.restaurante.commons.entities.Almuerzo;
import co.edu.unicauca.microkernel.restaurante.commons.entities.Componente;
import co.edu.unicauca.microkernel.restaurante.commons.interfaces.IAlmuerzoRepository;
import co.edu.unicauca.microkernel.restaurante.core.access.Factory;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Luis
 */
public class AlmuerzoServiceTest {

    public AlmuerzoServiceTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of createAlmuerzo method, of class AlmuerzoService.
     */
    @Test
    public void testCreateAlmuerzo() {
//        System.out.println("createAlmuerzo");
//        Almuerzo parAlmuerzo = null;
//        AlmuerzoService instance = new AlmuerzoService();
//        String expResult = "";
//        String result = instance.createAlmuerzo(parAlmuerzo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
        System.out.println("CreateAlmuerzo");
        Almuerzo parAlmuerzo = new Almuerzo();
        parAlmuerzo.setIdAlmuerzo("122");
        parAlmuerzo.setRestId("1");
        parAlmuerzo.setCostoAlm("10000");

        IAlmuerzoRepository repo = Factory.getInstance().getRepositoryAlmuerzo();
        AlmuerzoService instance = new AlmuerzoService(repo);
        String expResult = "122";
        String result = instance.createAlmuerzo(parAlmuerzo);
        assertEquals(expResult, result);

        // Validar un dato erroneo
        parAlmuerzo.setIdAlmuerzo("");
        result = instance.createAlmuerzo(parAlmuerzo);
        assertEquals("", result);
    }


    /**
     * Test of updateAlmuerzo method, of class AlmuerzoService.
     */
//    @Test
//    public void testUpdateAlmuerzo() {
//        System.out.println("updateAlmuerzo");
//        Almuerzo parAlmuerzo = null;
//        parAlmuerzo.setIdAlmuerzo("122");
//        
//        
//        IAlmuerzoRepository repo = Factory.getInstance().getRepositoryAlmuerzo();
//        AlmuerzoService instance = new AlmuerzoService(repo);
//        String expResult = "";
//        String result = instance.updateAlmuerzo(parAlmuerzo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of updateCosto method, of class AlmuerzoService.
     */
//    @Test
//    public void testUpdateCosto() {
//        System.out.println("updateCosto");
//        Almuerzo parAlmuerzo = null;
//        AlmuerzoService instance = new AlmuerzoService();
//        String expResult = "";
//        String result = instance.updateCosto(parAlmuerzo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of deleteCompAlmuerzo method, of class AlmuerzoService.
     */
//    @Test
//    public void testDeleteCompAlmuerzo() {
//        System.out.println("deleteCompAlmuerzo");
//        Almuerzo parAlmuerzo = null;
//        AlmuerzoService instance = new AlmuerzoService();
//        String expResult = "";
//        String result = instance.deleteCompAlmuerzo(parAlmuerzo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of contarAlmu method, of class AlmuerzoService.
     */
//    @Test
//    public void testContarAlmu() {
//        System.out.println("contarAlmu");
//        Almuerzo parAlmuerzo = null;
//        AlmuerzoService instance = new AlmuerzoService();
//        String expResult = "";
//        String result = instance.contarAlmu(parAlmuerzo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of asociarComp method, of class AlmuerzoService.
     */
//    @Test
//    public void testAsociarComp() {
//        System.out.println("asociarComp");
//        String almuid = "";
//        String compid = "";
//        AlmuerzoService instance = new AlmuerzoService();
//        String expResult = "";
//        String result = instance.asociarComp(almuid, compid);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

}

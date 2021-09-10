/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.microkernel.restaurante.core.services;

import co.edu.unicauca.microkernel.restaurante.commons.entities.Usuario;
import co.edu.unicauca.microkernel.restaurante.commons.interfaces.IUsuarioRepository;
import co.edu.unicauca.microkernel.restaurante.core.access.Factory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Software Team
 */
public class UsuarioServiceTest {

    public UsuarioServiceTest() {
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
     * Test of autenticarUsuario method, of class UsuarioService.
     */
    @Test
    public void testAutenticarUsuario() {

        System.out.println("autenticarCustomer");
        String username = "mezcly08";
        String userpassword = "12345678";
        IUsuarioRepository repo = Factory.getInstance().getRepositoryUsuario();
        UsuarioService instance = new UsuarioService(repo);
        //CustomerService instance = null;
        String expResult = "admin";
        String result = instance.autenticarUsuario(username, userpassword);
        assertEquals(expResult, result);

        // Datos que no existen
        result = instance.autenticarUsuario("lma", "453");
        assertEquals("", result);
    }

}

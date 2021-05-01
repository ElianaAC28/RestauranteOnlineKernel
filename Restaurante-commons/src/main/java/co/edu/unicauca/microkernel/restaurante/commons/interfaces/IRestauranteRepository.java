/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.microkernel.restaurante.commons.interfaces;

import co.edu.unicauca.microkernel.restaurante.commons.entities.Restaurante;
import java.util.List;

/**
 *
 * @author SoftwareTeam
 */
public interface IRestauranteRepository {
    
    /**
     * Crea un nuevo Restaurante.
     *
     * @param parRestaurante Objeto de tipo Restaurante.
     * @return valor especifico (restId)
     */
    public String createRestaurante(Restaurante parRestaurante);

    /**
     * Elimina un restaurante
     * @return
     */
    public String deleteRestaurante();

    /**
     * Actualiza un restaurante
     * @return
     */
    public String uptadeRestaurante();

    /**
     * Busca un restaurante
     * @return
     */
    public String findRestaurante();
    
    /**
     * Busca un restaurante de un administrador
     * @return
     */
    public Restaurante findRestauranteUser(String userId);
    
    /**
     * Lista todos los restaurantes
     * @return
     */
    public List<Restaurante> findAllRestaurantes();
    
}

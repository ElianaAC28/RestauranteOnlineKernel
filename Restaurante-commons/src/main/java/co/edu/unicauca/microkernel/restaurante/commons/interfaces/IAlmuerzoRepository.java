/**
 * Interface del repositorio de Almuerzos.
 *
 * @author
 */
package co.edu.unicauca.microkernel.restaurante.commons.interfaces;

import co.edu.unicauca.microkernel.restaurante.commons.entities.Almuerzo;

import java.util.List;

/**
 *
 * @author SoftwareTeam
 */
public interface IAlmuerzoRepository {

    /**
     * Crea un nuevo Almuerzo.
     *
     * @param parAlmuerzo Objeto de tipo Almuerzo.
     * @return valor especifico (idAlmuerzo)
     */

    public String createAlmuerzo(Almuerzo parAlmuerzo);
    public String updateAlmuerzo(Almuerzo parAlmuerzo);
    public String deleteCompAlmuerzo(Almuerzo parAlmuerzo);
    public List<Almuerzo> findAllAlmuerzos();

}

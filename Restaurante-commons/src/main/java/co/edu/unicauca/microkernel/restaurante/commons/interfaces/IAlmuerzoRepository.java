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

    /**
     *Actualiza almuerzo
     * @param idAlmuerzo
     * @return
     */
    public Almuerzo updateAlmuerzo(String idAlmuerzo);

    /**
     *Busca un almuerzo
     * @param idAlmuerzo
     * @return
     */
    public Almuerzo findAlmuerzo(String idAlmuerzo);

    /**
     *Busca todos los almuerzos
     * @return
     */
    public List<Almuerzo> findAllAlmuerzos();

    /**
     *Crea un almuerzo
     * @param parAlmuerzo
     * @return
     */
    public String createAlmuerzoID(Almuerzo parAlmuerzo);
}

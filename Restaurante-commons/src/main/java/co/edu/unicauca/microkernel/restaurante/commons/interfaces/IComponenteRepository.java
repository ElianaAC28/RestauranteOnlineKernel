package co.edu.unicauca.microkernel.restaurante.commons.interfaces;

import co.edu.unicauca.microkernel.restaurante.commons.entities.Componente;
import java.util.List;

/**
 * Interface del repositorio de Componentes.
 *
 * @author SoftwareTeam
 */
public interface IComponenteRepository {

    /**
     * Crea un nuevo Componente.
     *
     * @param parComponente Objeto de tipo Componente.
     * @return valor especifico (idComponente)
     */
    public String createComponente(Componente parComponente);

    public String extraerTipoComponente(int idComp);
    
    public String contarComponente(int almuid, int idtipocom);
    /**
    * Retornar todos los datos de los componente sin mostar
    * Un componente con el id que llega
    */
    public List<Componente> findAllComponentes(String idcomp);
    
    public List<Componente> findAllComponentes();
    
    public List<Componente> almuerzoComponentes(int almuerzo);

    public String contarComponentex(int almuid, String nomComp);
}

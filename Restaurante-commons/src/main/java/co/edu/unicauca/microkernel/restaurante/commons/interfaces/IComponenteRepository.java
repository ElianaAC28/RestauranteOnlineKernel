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


    public String contarComponente(int almuid, int idtipocom);
    
    public List<Componente> findAllComponentes();
    
    public List<Componente> almuerzoComponentes(int almuerzo);
}

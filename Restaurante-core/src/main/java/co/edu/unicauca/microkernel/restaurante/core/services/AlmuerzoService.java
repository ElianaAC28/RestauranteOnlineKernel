
package co.edu.unicauca.microkernel.restaurante.core.services;


import co.edu.unicauca.microkernel.restaurante.commons.interfaces.IAlmuerzoRepository;
import co.edu.unicauca.microkernel.restaurante.commons.entities.Almuerzo;
import co.edu.unicauca.microkernel.restaurante.commons.infra.JsonError;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;




/**
 * Servicio de usuarios del sistema
 * @author SoftwareTeam
 */
public class AlmuerzoService {
    IAlmuerzoRepository repositoryAlm;
  
    
    public AlmuerzoService( IAlmuerzoRepository repositoryAlm) {
        this.repositoryAlm = repositoryAlm;
    }

public Almuerzo findAlmuerzo(String idAlmuerzo) throws Exception {
        return repositoryAlm.findAlmuerzo(idAlmuerzo);
    }
public Almuerzo updateAlmuerzo(String idAlmuerzo) throws Exception {
        return repositoryAlm.updateAlmuerzo(idAlmuerzo);
    }
  /**
     * Metodo encargado de obtener una lista de todos los componentes
     * existentes.
     *
     */
    public List<Almuerzo> listAlmuerzos() {
        List<JsonError> errors = new ArrayList<>();
        if (!repositoryAlm.findAllAlmuerzos().isEmpty()) {
            if (!errors.isEmpty()) {
                errors.add(new JsonError("400", "BAD_REQUEST", "ERROR AL GENERAR PEDIDO SQL"));
            }
        }
        return repositoryAlm.findAllAlmuerzos();
    }
    
    
    
     /**
      *Crea el identificador de Almuerzo 
      * 
      **/
     public String createAlmuerzoID(Almuerzo parAlmuerzo) {
        List<JsonError> errors = new ArrayList<>();
        if (parAlmuerzo.getIdAlmuerzo().isEmpty() || parAlmuerzo.getRestId().isEmpty() || parAlmuerzo.getCostoAlm().isEmpty()){
            errors.add(new JsonError("400", "BAD_REQUEST", "LA INFORMACION X ES OBLIGATORIA "));
        }
        if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorJson = gson.toJson(errors);
            return errorJson;
        }
        return repositoryAlm.createAlmuerzoID(parAlmuerzo);
    }
     
     /**
      *Crea Almuerzo 
      * 
      **/
     public String createAlmuerzo(Almuerzo parAlmuerzo) {
        List<JsonError> errors = new ArrayList<>();
        if (parAlmuerzo.getIdAlmuerzo().isEmpty() || parAlmuerzo.getComp().isEmpty() || parAlmuerzo.getIdComp().isEmpty()){
            errors.add(new JsonError("400", "BAD_REQUEST", "LA INFORMACION X ES OBLIGATORIA "));
        }
        if (!errors.isEmpty()) {
            Gson gson = new Gson();
            String errorJson = gson.toJson(errors);
            return errorJson;
        }
        return repositoryAlm.createAlmuerzo(parAlmuerzo);
    }
   
}

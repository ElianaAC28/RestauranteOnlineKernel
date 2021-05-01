package co.edu.unicauca.microkernel.restaurante.core.access;

import co.edu.unicauca.microkernel.restaurante.commons.entities.Componente;
import co.edu.unicauca.microkernel.restaurante.commons.infra.Utilities;
import co.edu.unicauca.microkernel.restaurante.commons.interfaces.IComponenteRepository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SoftwareTeam
 */
public class ComponenteRepositoryImplMysql implements IComponenteRepository {

    /**
     * Objeto de tipo Connection, encargado de realizar la Conexion con Mysql.
     */
    public Connection conn;

    /**
     * Metodo encargado de crear un componente.
     *
     * @param parComponente Objeto de tipo Dish.
     * @return cadena de texto con el valor de platoId.
     */
    @Override
    public String createComponente(Componente parComponente) {
        try {
            this.connect();
            String sql = "INSERT INTO componente(COMPID,RESTID, COMPNOMBRE, COMPTIPO, COMPIDTIPO) VALUES (?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, parComponente.getIdComponente()+"");
            pstmt.setString(2, parComponente.getIdRestaurante()+"");
            pstmt.setString(3, parComponente.getNombreComponente());
            pstmt.setString(4, parComponente.getTipoComponente());
            pstmt.setString(5, parComponente.getIdtipoComponente()+"");
            pstmt.executeUpdate();

            pstmt.close();

            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ComponenteRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al insertar el registro", ex);
        }
        return (parComponente.getNombreComponente());
    }

    @Override
    public String deleteComponente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String uptadeComponente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String findComponente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    /**
     * Metodo encargado de obtener una lista de todos los componentes.
     *
     * @return Se retorna una lista con los resultados de la busqueda.
     */
    @Override
    public List<Componente> findAllComponentes() {
        List<Componente> objList = new ArrayList<Componente>();
        this.connect();
        Componente objComponente = new Componente();
        try {
            String sql = "SELECT * FROM componente;";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet comp = pstmt.executeQuery();
            while (comp.next()) {
                objComponente.setIdComponente(comp.getInt("COMPID"));
                objComponente.setNombreComponente(comp.getString("COMPNOMBRE"));
                objComponente.setTipoComponente(comp.getString("COMPTIPO"));
                objList.add(objComponente);
                objComponente = new Componente();
            }
            this.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ComponenteRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar el restaurante de la base de datos", ex);
        }
        return objList;
    }

    /**
     * Metodo que se encarga de realizar la conexion con la base de datos.
     *
     * @return 1, si la conexion fue exitosa, -1 si la conexion fue fallida.
     */
    public int connect() {
        try {
            Class.forName(Utilities.loadProperty("server.db.driver"));
            //crea una instancia de la controlador de la base de datos
            String url = Utilities.loadProperty("server.db.url");
            //String url = "jdbc:mysql://localhost:3306/bdrestauranteonline?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String username = Utilities.loadProperty("server.db.username");
            //String username = "root";
            String pwd = Utilities.loadProperty("server.db.password");
            //String pwd = "admin";
            conn = DriverManager.getConnection(url, username, pwd);
            return 1;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(ComponenteRepositoryImplMysql.class.getName()).log(Level.SEVERE, "Error al consultar Componente de la base de datos", ex);
        }
        return -1;
    }

    /**
     * Metodo encargado de desconectar la aplicacion de la base de datos.
     */
    private void disconnect() {
        try {
            conn.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ComponenteRepositoryImplMysql.class.getName()).log(Level.FINER, "Error al cerrar Connection", ex);
        }
    }

}

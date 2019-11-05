
package controlador;
import java.sql.*;
import java.util.ArrayList;
import modelo.ModeloRestaurante;
import modelo.Restaurante;

/**
 *
 * @author Paco
 */

public class ControladorRestaurante{
    ModeloRestaurante m = null;
    ArrayList<Restaurante> listarestaurantes = null;


    public ControladorRestaurante() {
        this.m = new ModeloRestaurante();
        this.listarestaurantes =  new ArrayList<Restaurante>();
    }     
    
    public  ArrayList <Restaurante> getRestaurantes() throws SQLException {   
        this.listarestaurantes = m.getRestaurantes();
        return this.listarestaurantes;
        
    }
    
    
}


 


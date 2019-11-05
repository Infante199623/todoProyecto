/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Paco
 */
public class ModeloPlato extends Conexion {
    public String nombretabla;
    public Statement st = null;
    public ResultSet rs = null;    
    ArrayList <Plato> listaplatos = null;
    boolean establecida;
    
    
 public ModeloPlato() { 
        super();
        this.basedatos = "cristeat";    
        this.login = "root";
        this.password = "";
        this.url = "jdbc:mysql://localhost:3306/cristeat" ;
        this.nombretabla = "plato";       
        //mapeo de atributos de la tabla
        listaplatos = new ArrayList<Plato>();
    }    
    
    public ArrayList <Plato> getPlatos() throws SQLException {
            String query = "SELECT * FROM "+ this.basedatos + "." + this.nombretabla;
        try {
            this.conectar();
            //Crear la conexion con la query
            st = this.conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                Plato pla = new Plato(rs.getInt("id"),rs.getString("nombre"),rs.getString("descripcion"),rs.getString("precio"),rs.getInt("idRestaurante"));
                listaplatos.add(pla); //Añadimos un objeto usuario a la arraylist de tipo usuario

            }  
            this.desconectar();
        } catch (SQLException e ) {
            System.out.println("error"+e);
        } 
         return listaplatos;
    }
}   

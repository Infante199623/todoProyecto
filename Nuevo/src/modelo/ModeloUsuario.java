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
public class ModeloUsuario extends Conexion{
    public String nombretabla;
    public Statement st = null;
    public ResultSet rs = null;  
    ArrayList <Usuario> listaUsuarios = null;
    boolean establecida;
    
    public ModeloUsuario() { 
        super();
        this.basedatos = "cristeat";    
        this.login = "root";
        this.password = "";
        this.url = "jdbc:mysql://localhost:3306/cristeat" ;
        this.nombretabla = "usuario";       
        //mapeo de atributos de la tabla
        listaUsuarios = new ArrayList<Usuario>();
    }    
    public ArrayList <Usuario> getUsuarios() throws SQLException {       
         String query = "SELECT * FROM "+ this.basedatos + "." + this.nombretabla;
        try {
            this.conectar();
            //Crear la conexion con la query
            st = this.conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                Usuario usu = new Usuario(rs.getInt("id"),rs.getString("login"),rs.getString("password"));
                listaUsuarios.add(usu); //Añadimos un objeto usuario a la arraylist de tipo usuario

            }    
             this.desconectar();
        } catch (SQLException e ) {
            System.out.println("error"+e);
        } 
         return listaUsuarios;
    }

}

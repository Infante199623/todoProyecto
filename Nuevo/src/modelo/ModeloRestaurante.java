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
//import modelo.Conexion.conn;


/**
 *
 * @author Paco
 */
public class ModeloRestaurante extends Conexion {
    ArrayList <Restaurante> listaRestaurantes = null;
    public Statement st = null;
    public ResultSet rs = null;
    public String nombretabla;
    //declaración de atributos de la tabla

    public ModeloRestaurante() { 
        super();
        this.basedatos = "cristeat";    
        this.login = "root";
        this.password = "";
        this.url = "jdbc:mysql://localhost:3306";
        this.nombretabla = "restaurante";       
        //mapeo de atributos de la tabla
        listaRestaurantes = new ArrayList<Restaurante>();
    }
    
    public ArrayList <Restaurante> getRestaurantes() throws SQLException {
        String query = "SELECT * FROM "+ this.basedatos + "." + this.nombretabla;
        try {
            this.conectar();
            //Crear la conexion con la query
            st = this.conn.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                Restaurante res = new Restaurante(rs.getInt("id"),rs.getString("nombre"),rs.getString("tipoComida"),rs.getString("direccion"),rs.getString("valoracion"),rs.getString("pedidoMinimo"),rs.getString("horaApertura"),rs.getString("horaCierre"),rs.getBoolean("abierto"));
                listaRestaurantes.add(res); //Añadimos un objeto usuario a la arraylist de tipo usuario                 
            }
            this.desconectar();
            } catch (SQLException e ) {
                System.out.println("error"+e);
        }
        return listaRestaurantes;
    }

   
}

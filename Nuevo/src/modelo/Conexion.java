/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Paco
 */
public class Conexion {
    protected String basedatos = "";    
    protected String login = "";
    protected String password = "";
    protected String url = "" ;
    protected Connection conn = null;
    
    
    public void conectar() {
        try{
            System.out.println("Debug: Conexion a la base de datos..." +basedatos);
        Class.forName("com.mysql.jdbc.Driver");        
        conn = DriverManager.getConnection(url,login,password);

        if (conn!=null)
            System.out.println("Conexion a base de datos " + basedatos + " realizada con exito");
        }catch(SQLException e){
        System.out.println(e);
        }catch(ClassNotFoundException e){
        System.out.println(e);
        }catch(Exception e){
        System.out.println(e);
        }
    }
    
    public void desconectar() throws SQLException{
        System.out.println("DEBUG: Cerrando Conexión.... " +basedatos);
        conn.close();
    }
 
    public Connection getConnection(){
        return conn;
    }


    
     public String getBasedatos() {
        return basedatos;
    }

    public void setBasedatos(String basedatos) {
        this.basedatos = basedatos;
    }

    public String getLogin() {
        return login;
    }

    public  void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
       this.url = url;
    }
}

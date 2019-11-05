/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CristoMessenger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author pedro
 */

public  class ConexionGlobal {
    
    protected String modo;
    protected String contrasena;
    protected String puerto;
    protected Connection con;
    protected String driver;
    protected String url;
    
    public ConexionGlobal(){
       
        this.modo = "clasedam2";
        this.contrasena = "root";
        this.url = "jdbc:mysql://clasedam2.ddns.net:3306/cristomessenger";
        this.driver = "com.mysql.jdbc.Driver";
 
        try{
           
            this.con =  (Connection) DriverManager.getConnection(this.url,this.modo,this.contrasena);
           
            if(this.con != null){
//               JOptionPane.showMessageDialog(null,"Conexion establecida");
          
            }
        }catch (SQLException e){

           System.out.println(e.getMessage());
        }
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public ConexionGlobal(String modo, String contrasena,String puerto) {
        this.modo = modo;
        this.contrasena = contrasena;
        this.puerto = puerto;
        
        
    }
    //hacer una cadena global de conexion
    public void setCadenaGlobal(String mod,String contrasen,String puert,String ur,Connection co){
    
        this.con = co;
        this.contrasena = contrasen;
        this.url = ur;
        this.modo = mod;
        this.puerto = puert;
        
    }
    
    //aqui devolvemos la conexion 
        public Connection getConexion(){
            
            return con; 
       
        }
        public void desconectarBD(){
        
            con = null;
            if(con == null)
                System.out.println("Conexion cerrada");
        }

}

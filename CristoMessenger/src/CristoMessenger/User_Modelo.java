/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CristoMessenger;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
public class User_Modelo{

        public static Statement ps; 
        protected String nombreTabla;
        
    public User_Modelo() {
  //      super(modo, contrasena, puerto);
        this.nombreTabla = "user";
    }
         
    public void almacenarUsuarioBD (String id_user,String name,String password,String surmame1,String surmame2,String photo,int states,Connection con) throws SQLException{
    
        Statement  rs;
        
        String query = "INSERT INTO user VALUES ('"+id_user+"','"+name+"','"+password+"','"+surmame1+"','"+surmame2+"','"+photo+"','"+states+"')";
        
            try {
                
                ps = (PreparedStatement) con.prepareStatement(query);
                
                ps.executeUpdate(query);
                ps.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(User_Modelo.class.getName()).log(Level.SEVERE, null, ex);
            }
      
    }    
    
    public static void get_UsuarioSistema(ArrayList<Usuario> usuariosSistema,Connection con) throws SQLException{
  
    Statement stmt = null;
    String id_user = null;
    String name = null;
    String password = null;
    String surname1 = null;
    String surname2 = null;
    String photo = null;
    String state = null;
    
    String query = "select id_user,name,password,surname1,surname2,photo,state from cristomessenger.user";
  
   try {
            
            stmt = (com.mysql.jdbc.Statement) con.createStatement();
             
            ResultSet rs = stmt.executeQuery(query);
          
            while (rs.next()) {
                Usuario u = new Usuario();
                
                id_user = rs.getString("id_user");
                u.setId_user(id_user);
                
                name = rs.getString("name");
                u.setName(name);
                
                password = rs.getString("password");
                u.setPassword(password);
                
                surname1 = rs.getString("surname1");
                u.setSurmame1(surname1);
                
                surname2 = rs.getString("surname2");
                u.setSurmame2(surname2);
                
                photo = rs.getString("photo");
                u.setPhoto(photo);
                
                state = rs.getString("state");
                u.setState(state); 
                
                usuariosSistema.add(u);
            }
        } catch (SQLException e ) {
            JDBCTutorialUtilities.printSQLException(e);
        } finally {
        //Cerramos la conexion..
            if (stmt != null) { stmt.close(); }
        }
    
    }
    
}

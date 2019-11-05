/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CristoMessenger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class Friend_Model {
       protected String nombreTabla;
    
    public Friend_Model() {
  //      super(modo, contrasena, puerto);
        this.nombreTabla = "friend";
    }

    public static void get_friendModel(ArrayList<Friend> friendSistema,Connection con) throws SQLException{
          
    Statement stmt = null; 
    String id_user_orig = null;
    String id_user_dest= null;
    String accept_request;  
           accept_request = null;
    
    String query;
    query = "select id_user_orig,id_user_dest,accept_request from cristomessenger.friend";
           
   try {
            stmt = (com.mysql.jdbc.Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Friend f  = new Friend();
                
                id_user_orig = rs.getString("id_user_orig");
                f.setId_user_orig(id_user_orig);
 
                id_user_dest = rs.getString("id_user_dest");
                f.setId_user_dest(id_user_dest); 
                
                
                accept_request = rs.getString("accept_request");
                f.setAccept_request(accept_request);
                friendSistema.add(f);
                
            }
        } catch (SQLException e ) {
                JDBCTutorialUtilities.printSQLException(e);
            }  
    }
    
}

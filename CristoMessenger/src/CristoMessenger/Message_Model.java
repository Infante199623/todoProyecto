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
public class Message_Model {

    
    public static void  get_messageModel(ArrayList<Message> mesageSistema,Connection con) throws SQLException{
  
    Statement stmt = null;   
    String id_user_orig = null;
    String id_user_dest= null;
    String date= null;
    String hour= null;
    String read= null;
    String sent = null; 
    String text = null;    
    
    String query = "select * from cristomessenger.message";
  
   
   try {
            stmt = (com.mysql.jdbc.Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Message m  = new Message();
                id_user_orig = rs.getString("id_user_orig");
                m.setId_user_orig(id_user_orig);
                
                id_user_dest = rs.getString("id_user_dest");
                m.setId_user_dest(id_user_dest);
                
                date = rs.getString("date");
                m.setDate(date);
                
                hour = rs.getString("hour");
                m.setHour(hour);
                
                read = rs.getString("read");
                m.setRead(read);
                
                sent = rs.getString("sent");
                m.setSent(sent);
                
                text = rs.getString("text");
                m.setText(text); 
                
                mesageSistema.add(m);
            }
        } catch (SQLException e ) {
            JDBCTutorialUtilities.printSQLException(e);
        } finally {
        //Cerramos la conexion..
            if (stmt != null) { stmt.close(); }
        }
    
    }
    
}


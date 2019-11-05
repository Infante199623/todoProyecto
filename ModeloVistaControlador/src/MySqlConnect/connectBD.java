/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySqlConnect;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pedro
 */
public class connectBD {

    public static String llamadaBD(){
    
        String cadena_tabla = "";
        String modo = "root";
        String user = "admin";
        String puerto = "3306";
        
        try{
            Connection connec =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:"+puerto,modo,user);
          //  Connection connec =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:"+puerto+",root,"+user);
            cadena_tabla = BaseDatosVer(connec,"alumnos");
            
        }catch (SQLException e){

           System.out.println(e.getMessage());
        }
        
        return cadena_tabla;
    
    }
    public static String BaseDatosVer(Connection con,String n_bd) throws SQLException{
    
    Statement stmt = null;
    String query = "select DNI, nom_alum from alumnos.alumno";
    String DNI = null;
    String nom_alum = null;
    String cadena_tabla = "";
    
    try {
            stmt = (Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                DNI = rs.getString("DNI");
                nom_alum = rs.getString("nom_alum");
                cadena_tabla+="\t"+DNI+"\t "+nom_alum+"\n";
            }
        } catch (SQLException e ) {
            JDBCTutorialUtilities.printSQLException(e);
        } finally {
            if (stmt != null) { stmt.close(); }
        }
    
        return cadena_tabla;
    }
}

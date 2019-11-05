/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySqlConnect1;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class connectBD {
    
    
    public static void BaseDatosVer(Connection con,String n_bd,ArrayList<Alumno> alumnosArrayList,String query) throws SQLException{
  
    Statement stmt = null;
    String DNI = null;
    String nom_alum = null;
    
    try {
            stmt = (Statement) con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Alumno a = new Alumno();
                DNI = rs.getString("DNI");
                a.setDNI(DNI);
                nom_alum = rs.getString("nom_alum");
                a.setNom_alum(nom_alum);
                
                alumnosArrayList.add(a);
            }
        } catch (SQLException e ) {
            JDBCTutorialUtilities.printSQLException(e);
        } finally {
            if (stmt != null) { stmt.close(); }
        }
    
    }
}
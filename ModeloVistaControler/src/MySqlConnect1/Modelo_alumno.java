/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySqlConnect1;

import static MySqlConnect1.connectBD.BaseDatosVer;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class Modelo_alumno extends Modelo_global {

    public Modelo_alumno(String modo, String contrasena, String puerto) {
        super(modo, contrasena, puerto);
    }
    public String getConsulta(){
        
        String query;
        query = null;
        query = "select DNI, nom_alum from alumnos.alumnos";
    
        return query;
    }
    public void get_alumnos(ArrayList<Alumno> alumnosArrayList){
   
         Modelo_alumno.llamadaBD(alumnosArrayList,getConsulta());   
         
    }
    
    public static void llamadaBD(ArrayList<Alumno> alumnosArrayList,String consulta){
    
        Modelo_alumno m = new Modelo_alumno("root","admin","3306");
        
        try{
            Connection connec =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:"+m.getPuerto(),m.getModo(),m.getContrasena());
            BaseDatosVer(connec,"alumnos",alumnosArrayList,consulta);
            
        }catch (SQLException e){

           System.out.println(e.getMessage());
        }
        
    }
}

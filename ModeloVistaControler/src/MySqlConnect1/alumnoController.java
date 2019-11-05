/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySqlConnect1;

import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class alumnoController {

    protected ArrayList<Alumno> alumnosArrayList;
     
    public alumnoController() {
        
        alumnosArrayList = new ArrayList();
        
    }
 
    public void get_alumnos(){
   
        Modelo_alumno m = new Modelo_alumno("root","3306","admin");
        
         m.get_alumnos(alumnosArrayList);
         
    }
    public void printArrayList (){
         
        Alumno a;
        a = new Alumno ();
         //Empty es para saber si hay alumnos dentro del array y te devuelve un true o un false
         if(!alumnosArrayList.isEmpty()){
             System.out.println("\nAlumnos registrados : \n");
             for(int i = 0;i < alumnosArrayList.size();i++)
                   a.printAlumno(alumnosArrayList.get(i));
         }else{
         
             System.out.println("No se encuentran alumnos registrados...");
         }
      
     }
}

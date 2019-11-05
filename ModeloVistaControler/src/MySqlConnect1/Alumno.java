/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySqlConnect1;

/**
 *
 * @author pedro
 */
public class Alumno {
    
    private String DNI = null;
    private String nom_alum = null;
   
    

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNom_alum(String nom_alum) {
        this.nom_alum = nom_alum;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNom_alum() {
        return nom_alum;
    }
    
    public void printAlumno(Alumno a){
    
        System.out.println(a.getDNI() + "\t"+ a.getNom_alum());
    }
}
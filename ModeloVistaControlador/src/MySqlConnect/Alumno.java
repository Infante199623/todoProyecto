/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySqlConnect;

/**
 *
 * @author pedro
 */
public class Alumno {
    
    private String DNI = null;
    private String nom_alum = null;
    private connectBD c;
    
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

    void printAlum(String cadena){
        
            System.out.println(cadena);
    
    }
     public String llamadaBD(){
        
        String cadena_tabla = connectBD.llamadaBD();
         
        return cadena_tabla;
    }
}
    

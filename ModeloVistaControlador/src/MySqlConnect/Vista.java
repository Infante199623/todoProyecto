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
public class Vista {
    
    
    public static void main(String[] args) {
       
        String cadena_tabla;
        Alumno a = new Alumno();
       
        cadena_tabla = a.llamadaBD();
        
        a.printAlum(cadena_tabla);
    }
    
}

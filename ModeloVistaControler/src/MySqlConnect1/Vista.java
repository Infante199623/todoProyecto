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
public class Vista {
    

    public static void main(String[] args) {
            
        alumnoController alum_Controler = new alumnoController();
        alum_Controler.get_alumnos();
        alum_Controler.printArrayList();

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lslinux;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author pedro
 */
public class LsLinux {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException{
        
        // TODO code application logic here
        File f;
        f = new File("D:\\pedro\\Escritorio\\2 DAM\\PMDM");
        
        System.out.println("Existe el archivo " +f.exists());
        
        System.out.println("Se puede leer : " + f.canRead());
        System.out.println("Se puede leer : " + f.canWrite());
         
        System.out.println("Nombre : " + f.getName());
        System.out.println("Directorio padre : " + f.getParentFile());
        System.out.println("Ruta relativa : " + f.getPath());
        System.out.println("Ruta absoluta "+ f.getAbsolutePath());
    }
    
}

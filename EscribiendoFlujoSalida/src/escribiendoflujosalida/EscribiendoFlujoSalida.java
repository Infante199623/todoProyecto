/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribiendoflujosalida;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author pedro
 */
public class EscribiendoFlujoSalida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nomFichero = "FlujodatosES";
        File f = new File(nomFichero);       
        
        if(f.exists()){
            System.out.println("Fichero " + nomFichero + "ya existe.No se hace nada.");
            return;
        }
        if(!f.exists()){
            System.out.println("Fichero " + nomFichero + " no existe.");
            return ;
        }
         
        try (BufferedReader bfr = new BufferedReader(new FileReader(f))){
            File fTemp = File.createTempFile(nomFichero,"");
            System.out.println("Creando Fichero " + fTemp.getAbsolutePath());
            
            PrintWriter pw;
            try (BufferedWriter bfw = new BufferedWriter(new FileWriter(f))) {
                String linea = bfr.readLine();
                while(linea != null ){
                    boolean principioLinea =true,espacios = false,primerAlfa = false;
                    for(int i = 0; i < linea.length();i++){
                        char c = linea.charAt(i);
                        if(Character.isWhitespace(c)){
                            if(!espacios && !principioLinea){
                                bfw.write(c);
                            }
                            espacios = true;
                        }else if(Character.isAlphabetic(c)){
                            if(!primerAlfa){
                                bfw.write(Character.toUpperCase(c));
                                primerAlfa = true;
                            }
                            else bfw.write(c);
                            espacios = false;
                            principioLinea = false;
                            
                        }
                    }
                    bfw.newLine();
                    linea = bfr.readLine();
                }   pw = new PrintWriter(bfw);
            }
            pw.close();
            
        }catch(IOException e){
        
            System.out.println(e.getMessage());
        
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscarficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author pedro
 */
public class Buscarficheros {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        if(args.length < 1){
            System.out.println("Indicar nombre del fichero : ");
            return;
        }
        String nomFich = args[0];
        //File f;
        //f = new File("D:\\pedro\\Escritorio\\2 DAM\\Acceso a Datos");
        try(BufferedReader fbr = new BufferedReader(new FileReader(nomFich))){
            
            int i = 0;
            String linea = fbr.readLine();
            int cont_veces = 0;
            int cont_columna = 0;
            
            while(linea != null){
               cont_columna++;
               String[] palabra;
                palabra = linea.split("que");
                
                    if (linea.contains("que")) {
                        cont_veces++;
                        System.out.println("Linea : " + cont_columna );
                        System.out.println("Veces que aparece la palabra : " + cont_veces);
                        System.out.println("Columna en la que esta " + linea.indexOf("que"));
                    
                }
                System.out.format("[%5d] %s",i++,linea);
                System.out.println("");
                linea = fbr.readLine();
                
            }
        
        }catch(FileNotFoundException e){
            System.out.println("No existe el fichero " + nomFich);
        
        }catch(IOException e ){
            System.out.println("Error E/S : " + e.getMessage());
        }
    }
    
}

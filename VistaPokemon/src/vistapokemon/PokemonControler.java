/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistapokemon;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class PokemonControler {
    
       public static void Escribirfichero(ArrayList<Pokemon> p){

        try (ObjectOutputStream dataOS = new ObjectOutputStream(new FileOutputStream("C:\\Users\\pedro\\OneDrive\\Documentos\\NetBeansProjects\\VistaPokemon\\FichPokemon.dat",true))) {

            dataOS.writeObject(p);  
            
            dataOS.close();
            
        }catch(Exception e){}
          
    }
    public static void LeerFichObject (ArrayList<Pokemon> p) throws IOException, ClassNotFoundException{
	
        int i = 0;
        
        try ( ObjectInputStream dataIS = new ObjectInputStream(new FileInputStream("C:\\Users\\pedro\\OneDrive\\Documentos\\NetBeansProjects\\VistaPokemon\\FichPokemon.dat"))){
             
            p = (ArrayList<Pokemon>) dataIS.readObject();
           // System.out.println("ENTRA");
           int total = p.size();
            
            while(i < total){ 
               Pokemon pokemo = new Pokemon(0, p.get(i).nombre,p.get(i).tipo,p.get(i).hurt,p.get(i).ataque,p.get(i).peso);
               p.add(pokemo);
               i++;
            }
        dataIS.close();    // cerrar stream de entrada
        }catch (EOFException | StreamCorruptedException eo) {
          //  System.out.println("FIN DE LECTURA.");
        } 
 
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

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
public class Pokemon implements java.io.Serializable{
    
        protected int id_registro;
        protected String nombre;
        protected String tipo;
        protected int  hurt;
        protected String ataque;
        protected double peso;
        protected  ArrayList<Pokemon> arrayPokemon;

    public Pokemon(){
        
        this.id_registro = 0;
        this.nombre = null;
        this.tipo = null;
        this.hurt = 0;
        this.ataque = null;
        this.peso = 0.0;
    
    }

    public Pokemon(int id_registro, String nombre, String tipo, int hurt,String ataque,double peso) {
        this.id_registro = id_registro;
        this.nombre = nombre;
        this.tipo = tipo;
        this.hurt = hurt;
        this.ataque = ataque;
        this.peso = peso ;
        
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getId_registro() {
        return id_registro;
    }

    public void setId_registro(int id_registro) {
        this.id_registro = id_registro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public void printPokemon(){
    
        System.out.println("Id del pokemon : "+ this.id_registro);
        System.out.println("El nombre del pokemon : " + this.nombre);
        System.out.println("Tipo de pokemon : " + this.tipo);
        System.out.println("Daño : " + this.hurt);
        System.out.println("Ataque : " + this.ataque);
        System.out.println("Peso : " + this.peso);
        
    }
   public static void Escribirfichero(ArrayList<Pokemon> p){

        try (ObjectOutputStream dataOS = new ObjectOutputStream(new FileOutputStream("C:\\Users\\pedro\\OneDrive\\Documentos\\NetBeansProjects\\Pokemon\\FichPokemon.dat",true))) {
       
            dataOS.writeObject(p);  
            
            dataOS.close();
            
        }catch(Exception e){}
                
           
    }
    public static void LeerFichObject (ArrayList<Pokemon> p) throws IOException, ClassNotFoundException{
	
       // File fichero = new File("FichPokemon.dat");
        try ( ObjectInputStream dataIS = new ObjectInputStream(new FileInputStream("C:\\Users\\pedro\\OneDrive\\Documentos\\NetBeansProjects\\Pokemon\\FichPokemon.dat"))){
             
            p = (ArrayList<Pokemon>) dataIS.readObject();
            
            for(Pokemon pok : p) { 
               
                System.out.println("Id del pokemon : "+ pok.id_registro);
                System.out.println("El nombre del pokemon : " + pok.nombre);
                System.out.println("Tipo de pokemon : " + pok.tipo);
                System.out.println("Daño : " + pok.hurt);
                System.out.println("Ataque : " + pok.ataque);
                System.out.println("Peso : " + pok.peso);
            
                System.out.println("<--------------------->");

            }
        dataIS.close();    // cerrar stream de entrada
        }catch (EOFException eo) {
            System.out.println("FIN DE LECTURA.");
        }catch (StreamCorruptedException x) {

        }
       
       
    }
    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        // TODO code application logic here

        Pokemon p1 = new Pokemon(25,"Pikachu","ELÈctrico",90,"Voltio Cruel",3.35);
        Pokemon p2 = new Pokemon(9,"Blastoise","Agua",130,"Hidrobomba",43.2);
        Pokemon p3 = new Pokemon(447,"Riolu","Lucha",50,"Tajo Cruzado",11.26);

        ArrayList<Pokemon> arrayPokemon= null;
        arrayPokemon = new ArrayList();
        
        arrayPokemon.add(p1);
        arrayPokemon.add(p2);
        arrayPokemon.add(p3);

        
        Escribirfichero(arrayPokemon);
        LeerFichObject(arrayPokemon);
        }
}

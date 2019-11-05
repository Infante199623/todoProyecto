/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrenador;

/**
 *
 * @author pedro
 */
public class entrenador {
    
    protected int id_Entrandor;
    protected String nombre;
    protected int edad;
    protected int pokemon_Capturados;
    protected String equipo;

    public entrenador(int id_Entrandor, String nombre, int edad, int pokemon_Capturados, String equipo) {
        this.id_Entrandor = id_Entrandor;
        this.nombre = nombre;
        this.edad = edad;
        this.pokemon_Capturados = pokemon_Capturados;
        this.equipo = equipo;
    }
    public entrenador(){
    
        this.id_Entrandor = 0;
        this.nombre = null;
        this.edad = 0;
        this.pokemon_Capturados = 0;
        this.equipo = "";
    
    }

    public int getId_Entrandor() {
        return id_Entrandor;
    }

    public void setId_Entrandor(int id_Entrandor) {
        this.id_Entrandor = id_Entrandor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPokemon_Capturados() {
        return pokemon_Capturados;
    }

    public void setPokemon_Capturados(int pokemon_Capturados) {
        this.pokemon_Capturados = pokemon_Capturados;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
    
}

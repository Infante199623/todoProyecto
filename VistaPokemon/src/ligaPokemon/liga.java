/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligaPokemon;

/**
 *
 * @author pedro
 */
public class liga {
    
    protected int id_Liga;
    protected int id_Pokemon;
    protected String nombre;
    protected int pokemon_Registrados_Total;
    protected String gimnasio_Liga;

    public liga(int id_Liga, int id_Pokemon, String nombre, int pokemon_Registrados_Total, String gimnasio_Liga) {
        this.id_Liga = id_Liga;
        this.id_Pokemon = id_Pokemon;
        this.nombre = nombre;
        this.pokemon_Registrados_Total = pokemon_Registrados_Total;
        this.gimnasio_Liga = gimnasio_Liga;
    }
    public liga(){
    
        this.id_Liga = 0;
        this.id_Pokemon = 0;
        this.nombre = "";
        this.pokemon_Registrados_Total = 0;
        this.gimnasio_Liga = "";
    
    
    }
    public int getId_Liga() {
        return id_Liga;
    }

    public void setId_Liga(int id_Liga) {
        this.id_Liga = id_Liga;
    }

    public int getId_Pokemon() {
        return id_Pokemon;
    }

    public void setId_Pokemon(int id_Pokemon) {
        this.id_Pokemon = id_Pokemon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPokemon_Registrados_Total() {
        return pokemon_Registrados_Total;
    }

    public void setPokemon_Registrados_Total(int pokemon_Registrados_Total) {
        this.pokemon_Registrados_Total = pokemon_Registrados_Total;
    }

    public String getGimnasio_Liga() {
        return gimnasio_Liga;
    }

    public void setGimnasio_Liga(String gimnasio_Liga) {
        this.gimnasio_Liga = gimnasio_Liga;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * @author pedro
 */
public class Coche {

        private String marca;
        private String matricula;
       

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    //Contructor por parametros.
    public Coche(String marca, String matricula) {
        this.marca = marca;
        this.matricula = matricula;
    }
        
        
    
}

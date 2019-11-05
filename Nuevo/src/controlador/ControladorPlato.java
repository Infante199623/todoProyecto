/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ModeloPlato;
import modelo.Plato;

/**
 *
 * @author Paco
 */
public class ControladorPlato {
    ModeloPlato p = null;
    ArrayList<Plato> listaplatos = null;


    public ControladorPlato() {
        this.p = new ModeloPlato();
        this.listaplatos =  new ArrayList<Plato>();
    }     
    
    public  ArrayList <Plato> getPlatos() throws SQLException {   
        this.listaplatos = p.getPlatos();
        return this.listaplatos;
        
    }
    
}

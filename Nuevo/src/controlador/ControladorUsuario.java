/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ModeloRestaurante;
import modelo.ModeloUsuario;
import modelo.Restaurante;
import modelo.Usuario;

/**
 *
 * @author Paco
 */
public class ControladorUsuario {
    ModeloUsuario u = null;
    ArrayList<Usuario> listaUsuarios = null;


    public ControladorUsuario() {
        this.u = new ModeloUsuario();
        this.listaUsuarios =  new ArrayList<Usuario>();
    }     
    
    public  ArrayList <Usuario> getUsuarios() throws SQLException {   
        this.listaUsuarios = u.getUsuarios();
        return this.listaUsuarios;
        
    }
}

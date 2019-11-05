/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySqlConnect1;

/**
 *
 * @author pedro
 */
public class Modelo_global {
    
    protected String modo;
    protected String contrasena;
    protected String puerto;

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public Modelo_global(String modo, String contrasena,String puerto) {
        this.modo = modo;
        this.contrasena = contrasena;
        this.puerto = puerto;
    }
    
    
}

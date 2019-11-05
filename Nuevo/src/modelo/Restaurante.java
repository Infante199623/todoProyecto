/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Paco
 */

public class Restaurante {
    private int id;
    private String nombre;
    private String tipoComida;
    private String direccion;
    private String valoracion;
    private String pedidoMinimo;
    private String horaApertura;
    private String horaCierre;
    private boolean abierto;

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public String getPedidoMinimo() {
        return pedidoMinimo;
    }

    public void setPedidoMinimo(String pedidoMinimo) {
        this.pedidoMinimo = pedidoMinimo;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }
    

    public Restaurante(int id, String nombre, String tipoComida, String direccion, String valoracion, String pedidoMinimo, String horaApertura, String horaCierre, boolean abierto) {
        this.id = id;
        this.nombre = nombre;
        this.tipoComida = tipoComida;
        this.direccion = direccion;
        this.valoracion = valoracion;
        this.pedidoMinimo = pedidoMinimo;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.abierto = abierto;
    }
    
    
}

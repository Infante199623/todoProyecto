/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentapersonaad;

/**
 *
 * @author pedro
 */
public class Cuenta {
 
    private double cantidad = 0.0;
    private String titular = "null";

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    Cuenta(){
    
        cantidad = 0.0;
        titular = null;
        
    }
    void ingresar (double cantida){
    
        if(cantida > 0){
        
               this.cantidad += cantida;
        }
        
    }
    void retirar (double cantida){
    
        if(this.cantidad <= cantida){
               
             this.cantidad =  (float) 0.0;
        
        }else{
              this.cantidad = this.cantidad - cantida;
        }
        
    }

    void printEstadoCuenta() {
        System.out.println("El titular de la cuenta es " + this.getTitular()+ " .");
        System.out.println("La cantidad que tiene es de : " + this.getCantidad()+ " €.");
    }
    
}

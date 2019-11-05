/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SorteodadoMoneda;

/**
 *
 * @author pedro
 */
public class dado extends Sorteo{
    
    @Override
    public void lanzar() {
        System.out.println("Moneda Lanzada : ");
         int numero = (int) Math.floor((6 * Math.random()));
         
        System.out.println("El numero del dado es : " + numero + ".");
    }
}

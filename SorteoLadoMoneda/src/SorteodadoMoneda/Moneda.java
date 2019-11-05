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
public class Moneda extends Sorteo{

    @Override
    public void lanzar() {
        
        System.out.println("Moneda Lanzada : ");
         int numero = (int) Math.floor((Math.random() * 2));
         
        if(numero == 0)
            System.out.println("Result cara");
        else
            System.out.println("Result cruz");
    }
    
}

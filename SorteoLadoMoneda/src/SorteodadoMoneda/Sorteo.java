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
public abstract class Sorteo{
    //Crear la clase dado la cual desciende de la clase sorteo. La clase lado en la llamada lanzar mostrara un numero aleatorio del 1 al 6.
    //Crear la clase moneda la cual desciende de la clase sorteo.Esta clase en la llamada al metodo lanzar mostarara las palabras car o cruz.
    public abstract void lanzar();

}

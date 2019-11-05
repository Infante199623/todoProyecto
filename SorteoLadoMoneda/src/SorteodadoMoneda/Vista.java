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
public class Vista {
    
      public static void main(String[] args) {
      
            dado d = new dado();
            d.lanzar();
            Moneda m = new Moneda();
            m.lanzar();
      
      }
}

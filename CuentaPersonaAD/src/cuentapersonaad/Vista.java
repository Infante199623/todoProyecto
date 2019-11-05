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
public class Vista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Todo sobre cuentas .
        Cuenta c = new Cuenta();
        c.setTitular("Alex");
        c.setCantidad(28.8);
        c.printEstadoCuenta();
        c.ingresar(4.2);
        c.retirar( 33.9);
        c.printEstadoCuenta();
        
        // TODO sobre los apartados de una persona.
        Persona p = new Persona();
        p.alumnoPredefinido(p);
        
        String toString = p.toString(); 
        System.out.println("Imprimos persona " + toString);
        
        p.comprobarSexo(p.getSexo());
        p.ComprobarSiMayorONo(p);
        int imc = 0;
        imc = p.calcularIMC();
        p.ImprimirSuIMC(imc);
        String generaDNI = p.generaDNI();
        System.out.println("Imprimos un DNI aleatorio " + generaDNI);
    }
    
}

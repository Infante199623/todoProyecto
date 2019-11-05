/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import coche.Coche;
import coche.Vista;

/**
 *
 * @author pedro
 */
public class test_coche_TDD {
    
    public test_coche_TDD() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test 
    public  void Test_Constructor_Clase_Coche(){
    
        Coche c = new Coche("Seat","5454 KKK");
        
        Assert.assertEquals("Seat",c.getMarca());
        Assert.assertEquals("5454 KKK",c.getMatricula());
      
        Vista v = new Vista();
        int total_vehiculos = 0;
        Assert.assertEquals(total_vehiculos, v.cocheArrayList.size());
        
        v.cocheArrayList.add(c);
        total_vehiculos =  v.cocheArrayList.size();
        Assert.assertEquals(total_vehiculos, v.cocheArrayList.size());
    }
    @Test 
    public  void Test_Anadir_Coche_Array_List(){
    
        Coche c = new Coche("Seat","5454 KKK");
      
        Vista v = new Vista();
        int total_vehiculos = 0;
        Assert.assertEquals(total_vehiculos, v.cocheArrayList.size());
        
        v.cocheArrayList.add(c);
        total_vehiculos =  v.cocheArrayList.size();
        Assert.assertEquals(total_vehiculos, v.cocheArrayList.size());
        
    }
    @Test
    public void Test_Eliminar_Coche_Array(){
    
    Coche c = new Coche("Seat","5454 KKK");
      
    Vista v = new Vista();
    int eliminado = 0;

    v.cocheArrayList.add(c);
    //Primero lo  he añadido por que si no el array no va a tener ningun elemento para eliminar.
    v.cocheArrayList.remove(v.cocheArrayList.size()-1);
    Assert.assertEquals(eliminado, v.cocheArrayList.size());
    
    }
}

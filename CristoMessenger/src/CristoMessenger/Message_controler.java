/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CristoMessenger;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro
 */
public class Message_controler extends ConexionGlobal{
    
    protected ArrayList<Message> mensageSistema;
     
    public Message_controler() throws ClassNotFoundException {
        
        super();
        mensageSistema = new ArrayList();
        
    }
    
    public void printArrayListMesageSistema (){
         
        Message m = new Message();
         //Empty es para saber si hay alumnos dentro del array y te devuelve un true o un false
         if(!mensageSistema.isEmpty()){
             System.out.println("\nMessage registrados : \n");
             for(int i = 0;i < mensageSistema.size();i++)
                   m.printMessage(mensageSistema.get(i));
         }else{
         
             System.out.println("No se encuentran alumnos registrados...");
             
         }
    }
     public void get_messagueControler (){
            
           try {
            Message_Model.get_messageModel(mensageSistema,con);
            } catch (SQLException ex) {
           Logger.getLogger(Friend_controler.class.getName()).log(Level.SEVERE, null, ex);
            }
      
        }
}

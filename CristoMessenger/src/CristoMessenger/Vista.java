/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CristoMessenger;

import java.sql.SQLException;


/**
 *
 * @author pedro
 */
public class Vista {

     
    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        // TODO add your handling code here:

 
       // Friend_controler frie = new Friend_controler();
      //  frie.get_FriendControler();
     //  frie.printArrayListFriend();*/
        
        /*User_controler userControle = new User_controler();
        userControle.get_usuariosControler();
        userControle.printArrayListUsuariosSistema();*/
        
      /*  Message_controler mesControler = new Message_controler();
        mesControler.get_messagueControler();
        mesControler.printArrayListMesageSistema();
        */
        User_controler userControle = new User_controler();
        userControle.insertarDatosUsuarios( "@Infante",  "1234",  "Pedro",  "Garcia",  "Infante");
        userControle.printArrayListUsuariosSistema();
    }
    
}

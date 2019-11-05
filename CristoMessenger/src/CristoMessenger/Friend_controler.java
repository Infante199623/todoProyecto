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
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author pedro
 */
public class Friend_controler extends ConexionGlobal{
    
   protected ArrayList<Friend> friendSistema;
     
    public Friend_controler() throws ClassNotFoundException {

        friendSistema = new ArrayList();
        
    }
    
    public void printArrayListFriend (){
         
        Friend f = new Friend();
         //Empty es para saber si hay alumnos dentro del array y te devuelve un true o un false
         if(!this.friendSistema.isEmpty()){
             System.out.println("\n Friend registrados : \n");
             
             for(int i = 0;i < this.friendSistema.size();i++){
                 f.printFriend(this.friendSistema.get(i));
             }
         }else{
         
             System.out.println("No se encuentran amigos registrados...");
             
         }
    }
     public void get_FriendControler (){
   
        
       try {
           Friend_Model.get_friendModel(friendSistema,con);
       } catch (SQLException ex) {
           Logger.getLogger(Friend_controler.class.getName()).log(Level.SEVERE, null, ex);
       }
         
     }
    String buscarAmigos(Usuario u) {
        String cadena = null;
        String nombre_user_origen = null;
        String id_user =u.getId_user(); 
        System.out.println("lo que vale "+u.getId_user() );
        
        for(int i = 0;i < this.friendSistema.size();i++){
            nombre_user_origen = this.friendSistema.get(i).getId_user_orig();
            if(nombre_user_origen != id_user ){
                cadena = this.friendSistema.get(i).getId_user_dest();
                cadena = "\n";
            } 
        }
        
        return cadena;
    }

    DefaultListModel<String> MostrarAmigos(Usuario u,JList<String> jamigos) {
       DefaultListModel <String> v = new DefaultListModel();
       
        for(int i = 0;i < this.friendSistema.size();i++){
            String cadena_amigo = friendSistema.get(i).getId_user_orig();
    
            if(cadena_amigo.equals( u.getId_user())){
                //System.out.println("LLEGAAAAA");
                v.addElement(friendSistema.get(i).getId_user_dest());
            }
        }
       // jamigos.setModel(v);
        
        return v;
       // return v;
    }
}
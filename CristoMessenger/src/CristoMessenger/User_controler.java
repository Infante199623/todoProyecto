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
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class User_controler extends ConexionGlobal {
       
    protected ArrayList<Usuario> usuariosSistema;
            
    public User_controler() throws ClassNotFoundException {
        
        super();
        usuariosSistema = new ArrayList();
        
    }
    
    public void printArrayListUsuariosSistema (){
         
        Usuario u = new Usuario();
         //Empty es para saber si hay alumnos dentro del array y te devuelve un true o un false
         if(!usuariosSistema.isEmpty()){
             System.out.println("\nAlumnos registrados : \n");
             for(int i = 0;i < usuariosSistema.size();i++)
                   u.printUsuario(usuariosSistema.get(i));
         }else{
         
             System.out.println("No se encuentran alumnos registrados...");
             
         }
    }
     public void get_usuariosControler (){
   
           try {
           User_Modelo.get_UsuarioSistema(usuariosSistema,con);
            
           } catch (SQLException ex) {
                
           Logger.getLogger(Friend_controler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    Usuario ComprobarUsuario(Usuario u) {
             
        String iduser = null;
        String passwd = null;
        
            for(int i = 0;i < usuariosSistema.size();i++){   
                iduser = usuariosSistema.get(i).getId_user();
                passwd = usuariosSistema.get(i).getPassword();
                if(iduser.equals( u.getId_user())){
                if (passwd.equals(u.getPassword())) {
              
                    u = usuariosSistema.get(i);
                }
                }
            
            }     
       return u;
    }

    boolean ComprobarUsuarioID(Usuario user) {
        
        boolean existe;
        existe = false;
        String iduser = null;
       
        for(int i = 0;i < usuariosSistema.size();i++){   
            iduser = usuariosSistema.get(i).getId_user();
            if(iduser.equals( user.getId_user())){
                existe = true;
                
            }
        }     
       return existe;
    }
    boolean ComprobarUsuarioPasswd(Usuario user) {
        
        boolean existe;
        existe = false;
        String passwd = null;
       
        for(int i = 0;i < usuariosSistema.size();i++){   
            passwd = usuariosSistema.get(i).getPassword();
            if(passwd.equals( user.getPassword())){
                existe = true;
                user.setName(usuariosSistema.get(i).getName());
                user.setSurmame1(usuariosSistema.get(i).getSurmame1());
                user.setSurmame2(usuariosSistema.get(i).getSurmame2());
                user.setStateint(usuariosSistema.get(i).getState());
                user.setPhoto(usuariosSistema.get(i).getPhoto());
            }
        }     
       return existe;
    }
    void insertarDatosUsuarios(String id, String nombre, String passw, String usurna1, String usurna2) {
               
        boolean existe = false;
        String phot = "";
        int stat = 0;
        
        Usuario u = new Usuario ();
        u.setId_user (id);
        u.setPassword(passw);
        u.setName(nombre);
        u.setSurmame1(usurna1);
        u.setSurmame2(usurna2);
        u.setPhoto(phot);
        u.setStateint(stat);
    
        existe = ComprobarUsuarioID(u);
        
        if(existe == false){        
            User_Modelo um = new User_Modelo();
            usuariosSistema.add(u);
            try {
                um.almacenarUsuarioBD (id,nombre,passw, usurna1,usurna2,phot,stat,con);
            } catch (SQLException ex) {
                Logger.getLogger(User_controler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
        
            JOptionPane.showMessageDialog(null,"El usuario ya existe...");
        }
        
        usuariosSistema.add(u);
    }
}

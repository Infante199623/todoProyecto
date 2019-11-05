/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CristoMessenger;


/**
 *
 * @author pedro
 */
public class Usuario {
    
    protected String id_user;
    protected String name;
    protected String password;
    protected String user;
    protected String surmame1;
    protected String surmame2;
    protected String photo;
    protected int state; 

    Usuario() {
        this.id_user = null;
        this.name = null;
        this.password = null;
        this.user = null;
        this.surmame1 = null;
        this.surmame2 = null;
        this.state = 0;
        this.photo = null;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId_user(String id_user) {
        this.id_user = id_user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSurmame1() {
        return surmame1;
    }

    public void setSurmame1(String surmame1) {
        this.surmame1 = surmame1;
    }

    public String getSurmame2() {
        return surmame2;
    }

    public void setSurmame2(String surmame2) {
        this.surmame2 = surmame2;
    }

    public int getState() {
        return state;
    }
    public void setStateint(int stat) {
        this.state = stat;    
    }
    public void setState(String stat) {
         if("1" == stat){
        
            this.state = 1;
        }else
            this.state = 0;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Usuario(String id_use,String login, String password, String user, String surmame1, String surmame2, int state, String photo) {
        this.id_user = id_use;
        this.name = login;
        this.password = password;
        this.user = user;
        this.surmame1 = surmame1;
        this.surmame2 = surmame2;
        this.state = state;
        this.photo = photo;
    }
    
    public void printUsuario(Usuario u){
    
        System.out.println(u.getName() + "\t"+ u.getId_user());
    }
 
}

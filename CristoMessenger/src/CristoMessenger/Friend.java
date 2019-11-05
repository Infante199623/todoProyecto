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
public class Friend {
    
    protected String id_user_orig;
    protected String id_user_dest;
    protected int accept_request;

    Friend(){
    
        this.id_user_orig = null;
        this.id_user_dest = null;
        this.accept_request= 0;
    
    }

    public Friend(String id_user_orig, String id_user_dest, int accept_reques) {
        this.id_user_orig = id_user_orig;
        this.id_user_dest = id_user_dest;
        this.accept_request = accept_reques;
    }
    
    public String getId_user_orig() {
        return id_user_orig;
    }

    public void setId_user_orig(String id_user_orig) {
        this.id_user_orig = id_user_orig;
    }

    public String getId_user_dest() {
        return id_user_dest;
    }

    public void setId_user_dest(String id_user_dest) {
        this.id_user_dest = id_user_dest;
    }

    public int getAccept_request() {
        return accept_request;
    }

    public void setAccept_request(String accept_reques) {
        if("1" == accept_reques){
        
            this.accept_request = 1;
        }else
            this.accept_request = 0;
            
    }
    
    public void printFriend(Friend f){
        
        System.out.println(f.getId_user_dest() + "\t" + f.getId_user_orig());
        
    }

}

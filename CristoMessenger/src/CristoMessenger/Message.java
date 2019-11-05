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
public class Message {
    
    protected String id_user_orig;
    protected String id_user_dest;
    protected String date;
    protected String hour;
    protected int read;
    protected int sent; 
    protected String text;

    public Message(String id_user_orig, String id_user_dest, String date, String hour, int read, int sent, String text) {
        this.id_user_orig = id_user_orig;
        this.id_user_dest = id_user_dest;
        this.date = date;
        this.hour = hour;
        this.read = read;
        this.sent = sent;
        this.text = text;
    }
     
    Message() {
        this.id_user_orig = null;
        this.id_user_dest = null;
        this.date = null;
        this.hour = null;
        this.read = 0;
        this.sent = 0;
        this.text = null;
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int getRead() {
        return read;
    }

    public void setRead(String rea) {
       if("1" == rea){
        
             this.read= 1;
        }else
               this.read = 0;
    }

    public int getSent() {
        return sent;
    }

    public void setSent(String sen) {
        if("1" == sen){
        
             this.sent= 1;
        }else
               this.sent = 0;
       
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public void printMessage(Message m){
    
        System.out.println(m.getDate() + "\t"+ m.getText());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelapp;

/**
 *
 * @author NagbontianAliciaBene
 */ 

public class Guest{
    private String guestID;
    private String name;
    private String phone;
    private String email;
    private String idNumber;

    
    public Guest(String guestID, String name, String phone, String email, String idNumber){
        this.guestID = guestID;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.idNumber = idNumber;
    }
    
    public String getGuestID(){return guestID;}
    public String getName(){return name;}
    public String getPhone(){return phone;}
    public String getEmail(){return email;}
    public String getIdNumber(){return idNumber;}

    public void setGuestID(String guestID){
        this.guestID = guestID;
    }
        
    public void setName(String name){
        this.name = name;
    }
    
        public void setPhone(String phone){
        this.phone = phone;
    }
        
        public void setEmail(String email){
        this.email = email;
    } 
        
        public void setIdNumber(String idNumber){
        this.idNumber = idNumber;
    } 
        
        @Override
        public String toString(){
          return guestID+"-"+ name+"("+phone+")";
        }
}


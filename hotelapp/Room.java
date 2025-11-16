package hotelapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author EmoshiogweOmokhudu
 */
public class Room {
    private String roomID;
    private String type;
    private double price;
    private boolean available;
    
    public Room(String roomID, String type, double price, boolean available){
      this.roomID = roomID;
      this.type = type;
      this.price = price;
      this.available = available;
    
} 

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    
    }
        @Override 
        public String toString(){
        return roomID+  "-" +type+  "-€" +price;
    }
    
    
    }
    
    
    




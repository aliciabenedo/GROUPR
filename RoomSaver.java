package hotelapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import hotelapp.Room;
import java.util.ArrayList;
/**
 *
 * @author EmoshiogweOmokhudu
 */
public class RoomSaver {
    
    private ArrayList<Room> rooms;
    
    //Constructor takes the current list of rooms 
    public RoomSaver(ArrayList<Room>rooms){
        this.rooms = rooms;
    }
    // This method builds a summary string about the current rooms
    public String buildSaveSummary(){
        int totalRooms = rooms.size();
        int availableCount =0;
        
        for (Room r : rooms){
            if (r.isAvailable()){
                availableCount++;
                
            }
        }
        
        int notAvailable = totalRooms - availableCount;
        return "Total rooms:" +totalRooms+
               "\nAvailable rooms:" +availableCount+
                "\nNot available:" +(totalRooms - availableCount);
                
    }

    String buldsSaveSummary() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
    

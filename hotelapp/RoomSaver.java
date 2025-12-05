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
    
    // This stores the same room objects used in the GUI
    private ArrayList<Room> rooms;
    
    //Constructor takes the current list of rooms 
    public RoomSaver(ArrayList<Room>rooms){
        this.rooms = rooms;
    }
    // This method builds a summary string about the current rooms when you ress the save button
    public String buildSaveSummary(){ 
        int totalRooms = rooms.size();// total rooms in ArrayList
        int availableCount =0; // counter for Available rooms
        
        // Loop through rooms to count how many are available 
        for (Room r : rooms){
            if (r.isAvailable()){
                availableCount++;
                
            }
        }
        
        int notAvailable = totalRooms - availableCount;
        
        //Return the summary text 
        return "Total rooms:" +totalRooms+
               "\nAvailable rooms:" +availableCount+
                "\nNot available:" +(totalRooms - availableCount);
                
    }

   
}
    


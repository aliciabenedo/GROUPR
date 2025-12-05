/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelapp;

import java.util.ArrayList;

/**
 *
 * @author jamesglennon
 */

public class BookingManager {

    private ArrayList<Booking> bookings;
    private int nextBookingNumber;

    public BookingManager() {
        bookings = new ArrayList<>();
        nextBookingNumber = 1;
    }

    private String generateBookingId() {
        String id = "B" + nextBookingNumber;
        nextBookingNumber++;
        return id;
    }

    public Booking addBooking(Guest guest, Room room, String checkInDate, String checkOutDate) {

        if (!room.isAvailable()) {
            return null;
        }
        
        String id = generateBookingId();

        Booking newBooking = new Booking(id, guest, room, checkInDate, checkOutDate);

        bookings.add(newBooking);
        
        room.setAvailable(false);

        return newBooking;
    }

    public String viewAllBookings() {
        if (bookings.isEmpty()) {
            return "No bookings found.";
        }
        String details = "";

        for (Booking b : bookings) {
            details += "Booking ID: " + b.getBookId() + "\n"
                    + "Guest: " + b.getGuest().getName() + "\n"
                    + "Room: " + b.getRoom().getRoomID() + "\n"
                    + "Check in: " + b.getCheckInDate() + "\n"
                    + "Check Out: " + b.getCheckOutDate() + "\n\n";
        }
        return details;
    }

    public Booking searchBookingbyId(String id) {
        for (Booking b : bookings) {
            if (b.getBookId().equalsIgnoreCase(id)) {
                return b;
            }
        }
        return null;
    }

    public boolean deleteBooking(String id) {
        for (Booking b : bookings) {
            if (b.getBookId().equalsIgnoreCase(id)) {
                
                Room r = b.getRoom();
                
                r.setAvailable(true);

                bookings.remove(b);
                
                return true;
            }
        }
        return false;
    }
    
    
  

    public static void main(String[] args) {

    }
}



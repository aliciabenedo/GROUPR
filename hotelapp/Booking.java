/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelapp;

/**
 *
 * @author jamesglennon
 */
public class Booking {

    private String bookId;
    private Guest guest;

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
    private Room room;
    private String checkInDate;
    private String checkOutDate;

    public Booking(String bookId, Guest guest, Room room, String checkInDate, String checkOutDate) {
        this.bookId = bookId;
        this.guest = guest;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getBookId() {
        return bookId;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void cancelBooking() {

    }

    @Override
    public String toString() {
        return "Booking ID: " + bookId + "\n"
                + "Guest: " + guest.getName() + "\n"
                + "Room: " + room.getRoomID() + "\n"
                + "Check-In: " + checkInDate + "\n"
                + "Check-Out: " + checkOutDate;
    }
}

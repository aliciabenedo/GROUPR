/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotelapp;

/**
 *
 * @author james
 */
public class AddBookingJFrame extends javax.swing.JFrame {

    private BookingManager manager;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(AddBookingJFrame.class.getName());

    public AddBookingJFrame(BookingManager manager) {
        initComponents();
        this.manager = manager;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtGuestID = new javax.swing.JLabel();
        txtRoomID = new javax.swing.JLabel();
        txtCheckInDate = new javax.swing.JLabel();
        txtCheckOutDate = new javax.swing.JLabel();
        btnCreateBooking = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtGuestIDInput = new javax.swing.JTextField();
        txtRoomIDInput = new javax.swing.JTextField();
        txtCheckInDateInput = new javax.swing.JTextField();
        txtCheckOutDateInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtGuestID.setText("Guest ID:");

        txtRoomID.setText("Room ID:");

        txtCheckInDate.setText("Check-In Date:");

        txtCheckOutDate.setText("Check-Out Date:");

        btnCreateBooking.setText("Create Booking");
        btnCreateBooking.addActionListener(this::btnCreateBookingActionPerformed);

        btnBack.setText("Back");
        btnBack.addActionListener(this::btnBackActionPerformed);

        txtGuestIDInput.setColumns(15);

        txtRoomIDInput.setColumns(15);
        txtRoomIDInput.addActionListener(this::txtRoomIDInputActionPerformed);

        txtCheckInDateInput.setColumns(15);

        txtCheckOutDateInput.setColumns(15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBack)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGuestID)
                                    .addComponent(txtRoomID)
                                    .addComponent(txtCheckInDate)
                                    .addComponent(txtCheckOutDate))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCheckOutDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCheckInDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRoomIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGuestIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btnCreateBooking)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtGuestID)
                    .addComponent(txtGuestIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRoomID)
                    .addComponent(txtRoomIDInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCheckInDate)
                    .addComponent(txtCheckInDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCheckOutDate)
                    .addComponent(txtCheckOutDateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnCreateBooking)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateBookingActionPerformed
        String guestId = txtGuestIDInput.getText();
        String roomId = txtRoomIDInput.getText();
        String checkIn = txtCheckInDateInput.getText();
        String checkOut = txtCheckOutDateInput.getText();

        if (guestId.isEmpty() || roomId.isEmpty() || checkIn.isEmpty() || checkOut.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Please fill in all fields.",
                    "Input Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        Guest guest = new Guest(guestId, "Unknown", "", "", "");
        Room room = new Room(roomId, "Standard", 0.0, true);

        Booking booking = manager.addBooking(guest, room, checkIn, checkOut);

        if (booking == null) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Room is not available.",
                    "Booking Failed.",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Booking created with ID: " + booking.getBookId(),
                    "Booking Successful",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnCreateBookingActionPerformed

    private void txtRoomIDInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomIDInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomIDInputActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateBooking;
    private javax.swing.JLabel txtCheckInDate;
    private javax.swing.JTextField txtCheckInDateInput;
    private javax.swing.JLabel txtCheckOutDate;
    private javax.swing.JTextField txtCheckOutDateInput;
    private javax.swing.JLabel txtGuestID;
    private javax.swing.JTextField txtGuestIDInput;
    private javax.swing.JLabel txtRoomID;
    private javax.swing.JTextField txtRoomIDInput;
    // End of variables declaration//GEN-END:variables
}

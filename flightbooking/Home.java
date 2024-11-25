
package flightbooking;
import javax.swing.*;
import java.awt.*;

public class Home extends javax.swing.JFrame {

   
    public Home() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        side = new javax.swing.JPanel();
        Profile = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Flights = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Flights1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Passenger = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Tickets = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        planes = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        title = new javax.swing.JLabel();
        Logout = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jDesktopPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side.setBackground(new java.awt.Color(54, 33, 89));
        side.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Profile.setBackground(new java.awt.Color(85, 55, 118));
        Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ProfileMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Profile");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightbooking/icons8_Account_50px.png"))); // NOI18N

        javax.swing.GroupLayout ProfileLayout = new javax.swing.GroupLayout(Profile);
        Profile.setLayout(ProfileLayout);
        ProfileLayout.setHorizontalGroup(
            ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        ProfileLayout.setVerticalGroup(
            ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfileLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfileLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ProfileLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        side.add(Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 360, -1));

        Flights.setBackground(new java.awt.Color(64, 43, 100));
        Flights.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FlightsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FlightsMousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("National Flights");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightbooking/airplane (1).png"))); // NOI18N

        javax.swing.GroupLayout FlightsLayout = new javax.swing.GroupLayout(Flights);
        Flights.setLayout(FlightsLayout);
        FlightsLayout.setHorizontalGroup(
            FlightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FlightsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(137, Short.MAX_VALUE))
        );
        FlightsLayout.setVerticalGroup(
            FlightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FlightsLayout.createSequentialGroup()
                .addGroup(FlightsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FlightsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FlightsLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)))
                .addGap(11, 11, 11))
        );

        side.add(Flights, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 360, 60));

        Flights1.setBackground(new java.awt.Color(64, 43, 100));
        Flights1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Flights1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Flights1MousePressed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("International Flights");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightbooking/airplane (1).png"))); // NOI18N

        javax.swing.GroupLayout Flights1Layout = new javax.swing.GroupLayout(Flights1);
        Flights1.setLayout(Flights1Layout);
        Flights1Layout.setHorizontalGroup(
            Flights1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Flights1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        Flights1Layout.setVerticalGroup(
            Flights1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Flights1Layout.createSequentialGroup()
                .addGroup(Flights1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Flights1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16))
                    .addGroup(Flights1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel15)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        side.add(Flights1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 360, 60));

        Passenger.setBackground(new java.awt.Color(64, 43, 100));
        Passenger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassengerMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PassengerMousePressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Passenger");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightbooking/passenger.png"))); // NOI18N

        javax.swing.GroupLayout PassengerLayout = new javax.swing.GroupLayout(Passenger);
        Passenger.setLayout(PassengerLayout);
        PassengerLayout.setHorizontalGroup(
            PassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PassengerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        PassengerLayout.setVerticalGroup(
            PassengerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PassengerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PassengerLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        side.add(Passenger, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 360, 70));

        Tickets.setBackground(new java.awt.Color(64, 43, 100));
        Tickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TicketsMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TicketsMousePressed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tickets");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightbooking/ticket-flight.png"))); // NOI18N

        javax.swing.GroupLayout TicketsLayout = new javax.swing.GroupLayout(Tickets);
        Tickets.setLayout(TicketsLayout);
        TicketsLayout.setHorizontalGroup(
            TicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TicketsLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(212, Short.MAX_VALUE))
        );
        TicketsLayout.setVerticalGroup(
            TicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TicketsLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(TicketsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        side.add(Tickets, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 360, -1));

        planes.setBackground(new java.awt.Color(64, 43, 100));
        planes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                planesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                planesMousePressed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Planes");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightbooking/airplane.png"))); // NOI18N

        javax.swing.GroupLayout planesLayout = new javax.swing.GroupLayout(planes);
        planes.setLayout(planesLayout);
        planesLayout.setHorizontalGroup(
            planesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addContainerGap(213, Short.MAX_VALUE))
        );
        planesLayout.setVerticalGroup(
            planesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(planesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, planesLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, planesLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18))))
        );

        side.add(planes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 360, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        side.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 270, 10));

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("           Welcome");
        title.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        side.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 260, -1));

        Logout.setBackground(new java.awt.Color(64, 43, 100));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogoutMousePressed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Log out");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightbooking/logout.png"))); // NOI18N

        javax.swing.GroupLayout LogoutLayout = new javax.swing.GroupLayout(Logout);
        Logout.setLayout(LogoutLayout);
        LogoutLayout.setHorizontalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addContainerGap(213, Short.MAX_VALUE))
        );
        LogoutLayout.setVerticalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(18, 18, 18))
            .addGroup(LogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        side.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, -1, -1));

        bg.add(side, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 640));

        jPanel1.setBackground(new java.awt.Color(122, 72, 221));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flightbooking/logo plane (1).png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setText("X");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 405, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 640, -1));

        jDesktopPanel.setBackground(new java.awt.Color(255, 255, 255));
        jDesktopPanel.setToolTipText("");

        javax.swing.GroupLayout jDesktopPanelLayout = new javax.swing.GroupLayout(jDesktopPanel);
        jDesktopPanel.setLayout(jDesktopPanelLayout);
        jDesktopPanelLayout.setHorizontalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jDesktopPanelLayout.setVerticalGroup(
            jDesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        bg.add(jDesktopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 640, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 634, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(989, 634));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ProfileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMousePressed
        setColor(Profile);
        resetColor(Flights);
        resetColor(Passenger);
        resetColor(Tickets);
        resetColor(planes);
        resetColor(Flights1);
        title.setText("Profile");
        
        
    }//GEN-LAST:event_ProfileMousePressed

    private void FlightsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlightsMousePressed
         setColor(Flights);
        resetColor(Passenger);
        resetColor(Profile);
        resetColor(Tickets);
        resetColor(planes);
        resetColor(Flights1);
        title.setText("National Flights");
    }//GEN-LAST:event_FlightsMousePressed

    private void PassengerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassengerMouseClicked
 Passenger1 passenger = new Passenger1();
jDesktopPanel.removeAll();   
jDesktopPanel.add(passenger).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_PassengerMouseClicked

    private void PassengerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassengerMousePressed
         setColor(Passenger);
        resetColor(Profile);
        resetColor(Flights);
        resetColor(Tickets);
        resetColor(planes);
        resetColor(Flights1);
        title.setText("Passenger");
       
    }//GEN-LAST:event_PassengerMousePressed

    private void TicketsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TicketsMousePressed
        setColor(Tickets);
        resetColor(planes);
        resetColor(Passenger);
        resetColor(Profile);
        resetColor(Flights);
        resetColor(Flights1);
        title.setText("Booking");
        
    }//GEN-LAST:event_TicketsMousePressed

    private void planesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planesMousePressed
        setColor(planes);
        resetColor(Tickets);
        
        resetColor(Passenger);
        resetColor(Flights1);
        resetColor(Profile);
        resetColor(Flights);
        title.setText("Planes");
        
    }//GEN-LAST:event_planesMousePressed

    private void LogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMousePressed
        setColor(Logout);
        resetColor(Tickets);
        resetColor(Passenger);
        resetColor(Profile);
        resetColor(Flights);
        resetColor(planes);
        resetColor(Flights1);
        this.setVisible(false);
        new LoginPage().setVisible(true);
        
    }//GEN-LAST:event_LogoutMousePressed

    private void ProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseClicked
 Profilee profile = new Profilee();
jDesktopPanel.removeAll();   
jDesktopPanel.add(profile).setVisible(true);
    }//GEN-LAST:event_ProfileMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void FlightsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlightsMouseClicked
    NationalFlights flights = new NationalFlights();
jDesktopPanel.removeAll();   
jDesktopPanel.add(flights).setVisible(true);
    }//GEN-LAST:event_FlightsMouseClicked

    private void TicketsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TicketsMouseClicked
 Tickets t = new Tickets();
jDesktopPanel.removeAll();   
jDesktopPanel.add(t).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_TicketsMouseClicked

    private void planesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planesMouseClicked
 Planes p = new Planes();
jDesktopPanel.removeAll();   
jDesktopPanel.add(p).setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_planesMouseClicked

    private void Flights1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Flights1MouseClicked
        InternationalFlights flights = new InternationalFlights();
        jDesktopPanel.removeAll();   
        jDesktopPanel.add(flights).setVisible(true);
    }//GEN-LAST:event_Flights1MouseClicked

    private void Flights1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Flights1MousePressed
        setColor(Flights1);
        resetColor(Passenger);
        resetColor(Profile);
        resetColor(Tickets);
        resetColor(planes);
        resetColor(Flights);
        title.setText("International Flights");
    }//GEN-LAST:event_Flights1MousePressed
    void setColor(JPanel panel){
    panel.setBackground(new Color(85,65,118));
    }
    void resetColor(JPanel panel){
    panel.setBackground(new Color(64,34,100));
    }
    
   
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Flights;
    private javax.swing.JPanel Flights1;
    private javax.swing.JPanel Logout;
    private javax.swing.JPanel Passenger;
    private javax.swing.JPanel Profile;
    private javax.swing.JPanel Tickets;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel jDesktopPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel planes;
    private javax.swing.JPanel side;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}

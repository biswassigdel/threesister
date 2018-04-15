/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.threesister.views;

/**
 *
 * @author biswas
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        addTrekkingStaff = new javax.swing.JLabel();
        addBus = new javax.swing.JLabel();
        addTrekkingArea = new javax.swing.JLabel();
        searchDepartureTrek = new javax.swing.JLabel();
        addPackage = new javax.swing.JLabel();
        viewDepartureTrek = new javax.swing.JLabel();
        viewArrivalTrek = new javax.swing.JLabel();
        searchArrivalTrek = new javax.swing.JLabel();
        addFlight = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(688, 500));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setText("Dashboard");

        jPanel1.setBackground(new java.awt.Color(34, 49, 63));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        addTrekkingStaff.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        addTrekkingStaff.setForeground(java.awt.Color.white);
        addTrekkingStaff.setText("Add Trekking Staff");
        addTrekkingStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addTrekkingStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addTrekkingStaffMouseClicked(evt);
            }
        });

        addBus.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        addBus.setForeground(java.awt.Color.white);
        addBus.setText("Bus");
        addBus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        addTrekkingArea.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        addTrekkingArea.setForeground(java.awt.Color.white);
        addTrekkingArea.setText("Add Trekking Areas");
        addTrekkingArea.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        searchDepartureTrek.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        searchDepartureTrek.setForeground(java.awt.Color.white);
        searchDepartureTrek.setText("Search Departure Trek");
        searchDepartureTrek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        addPackage.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        addPackage.setForeground(java.awt.Color.white);
        addPackage.setText("Add  Package");
        addPackage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        viewDepartureTrek.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        viewDepartureTrek.setForeground(java.awt.Color.white);
        viewDepartureTrek.setText("Departure Trek");
        viewDepartureTrek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        viewArrivalTrek.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        viewArrivalTrek.setForeground(java.awt.Color.white);
        viewArrivalTrek.setText("Arrival Trek ");
        viewArrivalTrek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        searchArrivalTrek.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        searchArrivalTrek.setForeground(java.awt.Color.white);
        searchArrivalTrek.setText("Search Arrival Trerk");
        searchArrivalTrek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        addFlight.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        addFlight.setForeground(java.awt.Color.white);
        addFlight.setText("Flight Ticket");
        addFlight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        logout.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        logout.setForeground(java.awt.Color.white);
        logout.setText("Logout");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchArrivalTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewArrivalTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewDepartureTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addPackage, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTrekkingArea, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBus, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTrekkingStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchDepartureTrek))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addTrekkingStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addTrekkingArea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPackage, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewDepartureTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewArrivalTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchArrivalTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchDepartureTrek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addTrekkingStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTrekkingStaffMouseClicked
        AddTrekkingStaff addTrekkingStaff = new AddTrekkingStaff();
        addTrekkingStaff.setVisible(true);
        addTrekkingStaff.setLocationRelativeTo(null);
    }//GEN-LAST:event_addTrekkingStaffMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addBus;
    private javax.swing.JLabel addFlight;
    private javax.swing.JLabel addPackage;
    private javax.swing.JLabel addTrekkingArea;
    private javax.swing.JLabel addTrekkingStaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel searchArrivalTrek;
    private javax.swing.JLabel searchDepartureTrek;
    private javax.swing.JLabel viewArrivalTrek;
    private javax.swing.JLabel viewDepartureTrek;
    // End of variables declaration//GEN-END:variables
}
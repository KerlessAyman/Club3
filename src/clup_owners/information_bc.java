package clup_owners;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class information_bc extends javax.swing.JFrame {

    DefaultTableModel dtm;
    public Connection con;
    ArrayList<Integer> id_trainer = new ArrayList<>();
 
    
    public information_bc() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        dtm = new DefaultTableModel();
        dtm.addColumn("user_name");
        dtm.addColumn("password");
        dtm.addColumn("Name");
        dtm.addColumn("phone_number");
        dtm.addColumn("gmail");
        dtm.addColumn("sport");
        dtm.addColumn("day");
        dtm.addColumn("time");
        dtm.addColumn("experience");
        dtm.addColumn("cash number");
        
        tbl_show.setModel(dtm);
         

        try {

            seccurity c1 = new seccurity();
            con = c1.connect();
            System.out.println("connected <<information_bc>>");
           fillTableModel() ;
             
             
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Displays the data table in the GUI table
    private void fillTableModel() {
        try {
            dtm.setRowCount(0);
            PreparedStatement stmt = con.prepareStatement("select * from trainer");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                

                //add id rows
                   id_trainer.add(rs.getInt(10));
                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9),rs.getString(11)});
           
            }
            tbl_show.setModel(dtm);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_show = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        edt_cph = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        edt_pass = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        edt_name = new javax.swing.JTextField();
        edt_ph = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        edt_ex = new javax.swing.JTextField();
        edt_gmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        edt_sport = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        edt_time = new javax.swing.JTextField();
        edt_day = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        edt_trUser = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_showacc = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Club Owners");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_show.setBackground(new java.awt.Color(255, 255, 255));
        tbl_show.setForeground(new java.awt.Color(0, 0, 0));
        tbl_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "User name", "password", "Name", "phone number", "Gmail", "Sport", "Day", "Time", "experience", "cash number"
            }
        ));
        tbl_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_showMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_show);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 1580, 450));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Cach number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, 20));

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("accept");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 710, 80, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Back→");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1420, 710, 80, 40));

        edt_cph.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(edt_cph, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 200, 30));

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 710, 80, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("user name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        edt_pass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(edt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 200, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Name");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        edt_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(edt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 200, 30));

        edt_ph.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(edt_ph, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 200, 30));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Gmail");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 20));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Phone Number");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, 20));

        edt_ex.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(edt_ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 200, 30));

        edt_gmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(edt_gmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 200, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("sport");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, 20));

        edt_sport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(edt_sport, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 200, 30));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Day");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, 20));

        edt_time.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(edt_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 200, 30));

        edt_day.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(edt_day, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 200, 30));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Time");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, 20));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Experience");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, 20));

        edt_trUser.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(edt_trUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 200, 30));

        jButton4.setBackground(new java.awt.Color(51, 51, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Add");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 700, -1, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\3d\\WhatsApp Image 2024-04-16 at 03.03.43_f020c253.jpg")); // NOI18N
        jLabel2.setText(" ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1920, 1080));

        jTabbedPane1.addTab("Trainer before accepted", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_showacc.setBackground(new java.awt.Color(255, 255, 255));
        tbl_showacc.setForeground(new java.awt.Color(0, 0, 0));
        tbl_showacc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "User Name", "Password", "Name", "Phone Number", "Gmail", "Sport", "Day", "Time", "Experience"
            }
        ));
        jScrollPane3.setViewportView(tbl_showacc);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1810, 680));

        jLabel5.setIcon(new javax.swing.ImageIcon("D:\\3d\\WhatsApp Image 2024-04-16 at 03.03.43_f020c253.jpg")); // NOI18N
        jLabel5.setText(" ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1920, 1080));

        jTabbedPane1.addTab("Tainee before accepted", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1810, 1080));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\3d\\WhatsApp Image 2024-04-18 at 21.40.33_e1b04571.jpg")); // NOI18N
        jLabel6.setText(" ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 430, 340));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\3d\\WhatsApp Image 2024-04-16 at 03.03.43_f020c253.jpg")); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new choice_admin().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {

            PreparedStatement stmt = con.prepareStatement("delete from trainer where id_trainer=?");
              
            stmt.setInt(1, id_trainer.get(tbl_show.getSelectedRow()));

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Deleted Successfully");
            fillTableModel();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
 
            PreparedStatement p = con.prepareStatement("insert into trainer_accepted (`user_name`, `password`, `name`, `phone_number`, `gmail`, `sport`, `day`, `time`, `experience`,`cphone`) values (?,?,?,?,?,?,?,?,?,?)");
             p.setString(1,edt_trUser.getText());
            p.setString(2,edt_pass.getText());
            p.setString(3,edt_name.getText());
            p.setString(4,edt_ph.getText());
            p.setString(5,edt_gmail.getText());
            p.setString(6,edt_sport.getText());
            p.setString(7,edt_day.getText());
            p.setString(8,edt_time.getText());
            p.setString(9,edt_ex.getText());
            p.setString(10,edt_cph.getText());
     
            p.execute();
             
            
             JOptionPane.showMessageDialog(this, "accepted");
            PreparedStatement stm = con.prepareStatement("delete from trainer where id_trainer=?");

           
            stm.setInt(1, id_trainer.get(tbl_show.getSelectedRow()));

            stm.executeUpdate();
            
            fillTableModel();
             
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbl_showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_showMouseClicked
         
         
         
         
    }//GEN-LAST:event_tbl_showMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          try {
 
              PreparedStatement p = con.prepareStatement("insert into trainer_accepted (`user_name`, `password`, `name`, `phone_number`, `gmail`, `sport`, `day`, `time`, `experience`,`cphone`) values (?,?,?,?,?,?,?,?,?,?)");
              p.setString(1, edt_trUser.getText());
              p.setString(2, edt_pass.getText());
              p.setString(3, edt_name.getText());
              p.setString(4, edt_ph.getText());
              p.setString(5, edt_gmail.getText());
              p.setString(6, edt_sport.getText());
              p.setString(7, edt_day.getText());
              p.setString(8, edt_time.getText());
              p.setString(9, edt_ex.getText());
              p.setString(10, edt_cph.getText());
              p.execute();
             
            
             JOptionPane.showMessageDialog(this, "Added");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(information_bc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(information_bc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(information_bc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(information_bc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new information_bc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField edt_cph;
    private javax.swing.JTextField edt_day;
    private javax.swing.JTextField edt_ex;
    private javax.swing.JTextField edt_gmail;
    private javax.swing.JTextField edt_name;
    private javax.swing.JTextField edt_pass;
    private javax.swing.JTextField edt_ph;
    private javax.swing.JTextField edt_sport;
    private javax.swing.JTextField edt_time;
    private javax.swing.JTextField edt_trUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbl_show;
    private javax.swing.JTable tbl_showacc;
    // End of variables declaration//GEN-END:variables
}

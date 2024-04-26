 
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

 
public class basicadmin extends javax.swing.JFrame {

    DefaultTableModel dtm;
    public Connection con;
    ArrayList<Integer> id_admin = new ArrayList<>();

 
    public basicadmin() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        dtm = new DefaultTableModel();
        dtm.addColumn("user_name");
        dtm.addColumn("password");
        dtm.addColumn("gender");
         

        tbl_show.setModel(dtm);
        try {

            seccurity c1 = new seccurity();
            con = c1.connect();
            System.out.println("connected <<basicadmin>>");
            fillTableModel();

        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //show database(admin) in table

    private void fillTableModel() {
        try {
            dtm.setRowCount(0);
            PreparedStatement stmt = con.prepareStatement("select * from admin");
            ResultSet rs = stmt.executeQuery();
            //The meaning of these two lines display all the data excepted first person
            if(rs.next())
            while (rs.next()) {

                //add rows
                id_admin.add(rs.getInt(5));
                dtm.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(4)});

            }
            
            tbl_show.setModel(dtm);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_show = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Club Owners");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_show.setBackground(new java.awt.Color(255, 255, 255));
        tbl_show.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tbl_show.setForeground(new java.awt.Color(0, 0, 0));
        tbl_show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "User name", "password", "gender"
            }
        ));
        tbl_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_showMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_show);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1580, 710));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\3d\\WhatsApp Image 2024-04-18 at 21.40.33_e1b04571.jpg")); // NOI18N
        jLabel3.setText(" ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 430, 340));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Back→");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 730, 120, 40));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 740, 130, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\3d\\WhatsApp Image 2024-04-16 at 03.03.43_f020c253.jpg")); // NOI18N
        jLabel2.setText(" ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_showMouseClicked
 

    }//GEN-LAST:event_tbl_showMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new basicadmin2().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {

            PreparedStatement stmt = con.prepareStatement("delete from admin where id=?");
              
            stmt.setInt(1, id_admin.get(tbl_show.getSelectedRow()));

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Deleted Successfully"+"\nAdvice for you: Change your PIN");
            fillTableModel();
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

 
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
            java.util.logging.Logger.getLogger(basicadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(basicadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(basicadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(basicadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new basicadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_show;
    // End of variables declaration//GEN-END:variables
}

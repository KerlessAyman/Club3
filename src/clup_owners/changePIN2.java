 
package clup_owners;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

 
public class changePIN2 extends javax.swing.JFrame {

    public Connection con;

 
    public changePIN2() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        try {

            seccurity c1 = new seccurity();
            con = c1.connect();
            System.out.println("connected <<changePIN2>>");
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edt_rePIN = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        edt_PIN = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Club Owners");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        edt_rePIN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(edt_rePIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, 250, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Re_Type PIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("New PIN");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, -1, -1));

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 650, 110, 40));

        edt_PIN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(edt_PIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 240, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\3d\\WhatsApp Image 2024-04-18 at 21.40.33_e1b04571.jpg")); // NOI18N
        jLabel3.setText(" ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 430, 340));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("←");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\3d\\WhatsApp Image 2024-04-16 at 03.03.43_f020c253.jpg")); // NOI18N
        jLabel2.setText(" ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (edt_PIN.getText().equals(edt_rePIN.getText())&&!edt_PIN.getText().isEmpty()&&!edt_rePIN.getText().isEmpty()) {
            try {

                PreparedStatement p = con.prepareStatement("update admin set pin=?");
                p.setString(1, edt_PIN.getText());

                p.executeUpdate();
                JOptionPane.showMessageDialog(this, "Updeted");
                this.dispose();;
                new choice_admin().setVisible(true);

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        else
            JOptionPane.showMessageDialog(this, "PIN not same Re_Type PIN");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        new basicadmin2().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

 
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
            java.util.logging.Logger.getLogger(changePIN2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(changePIN2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(changePIN2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(changePIN2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changePIN2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField edt_PIN;
    private javax.swing.JPasswordField edt_rePIN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

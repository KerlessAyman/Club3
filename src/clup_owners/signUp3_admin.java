package clup_owners;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class signUp3_admin extends javax.swing.JFrame {

    public Connection con;

    public signUp3_admin() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        try {

            seccurity c1 = new seccurity();
            con = c1.connect();
            System.out.println("connect <<signUp3_admin>>");

        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        btn_userName = new javax.swing.JTextField();
        btn_pass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_rePass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbtn_male = new javax.swing.JRadioButton();
        rbtn_female = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Club Owners");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Create account admin");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 560, 90));
        getContentPane().add(btn_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 260, 40));
        getContentPane().add(btn_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 400, 250, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Create Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 160, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Re_type Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, 180, 50));
        getContentPane().add(btn_rePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 550, 260, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\3d\\WhatsApp Image 2024-04-18 at 21.40.33_e1b04571.jpg")); // NOI18N
        jLabel3.setText(" ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 430, 340));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("User Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 100, -1));

        rbtn_male.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtn_male);
        rbtn_male.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        rbtn_male.setForeground(new java.awt.Color(0, 0, 0));
        rbtn_male.setSelected(true);
        rbtn_male.setText("male");
        rbtn_male.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                rbtn_malePropertyChange(evt);
            }
        });
        getContentPane().add(rbtn_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 650, 70, -1));

        rbtn_female.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtn_female);
        rbtn_female.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtn_female.setForeground(new java.awt.Color(0, 0, 0));
        rbtn_female.setText("female");
        getContentPane().add(rbtn_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 650, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("( It must contan @club.com)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 700, 180, 60));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 700, 200, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\3d\\WhatsApp Image 2024-04-16 at 03.03.43_f020c253.jpg")); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1920, 1080));

        jButton2.setText("jButton2");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 720, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtn_malePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rbtn_malePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_malePropertyChange

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          String m="@club.com";
        if (btn_pass.getText().equals(btn_rePass.getText())&&btn_pass.getText().contains("@") || btn_pass.getText().contains("$") || btn_pass.getText().contains("*") || btn_pass.getText().contains("#") || btn_pass.getText().contains("&")&&btn_userName.getText().contains(m) && !btn_userName.getText().isEmpty() && !btn_pass.getText().isEmpty() && !btn_rePass.getText().isEmpty() && btn_pass.getText().equals(btn_rePass.getText())) {

            String gender;

            if (rbtn_male.isSelected()) {
                gender = "male";
            } else {
                gender = "female";
            }

            admin a1 = new admin(btn_userName.getText(), btn_pass.getText());
            a1.insert_user(btn_userName.getText(), btn_pass.getText(), gender);

            JOptionPane.showMessageDialog(this, "Successful" + a1.toString2());
            this.dispose();

            new home().setVisible(true);

        } else if (btn_userName.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Can’t Sign Up" + "\n User name not excite");
        else if (btn_pass.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Can’t Sign Up" + "\n password not excite");
        else if (btn_rePass.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Can’t Sign Up" + "\n re_type password not excite");
        else if (!btn_pass.getText().equals(btn_rePass.getText()))
            JOptionPane.showMessageDialog(this, "Can’t Sign Up" + "\n password not same re_type password");

        else if (btn_pass.getText().isEmpty()&& btn_rePass.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "Can’t Sign Up" + "\n password and re_type password not excite");
        else if(!btn_userName.getText().contains(m))
            JOptionPane.showMessageDialog(this, "Can’t Sign Up" + "\n user Name must contain @club.com");

        else if (!btn_pass.getText().contains("*") || !btn_pass.getText().contains("#") || !btn_pass.getText().contains("&") || !btn_pass.getText().contains("@") || !btn_pass.getText().contains("$"))
            JOptionPane.showMessageDialog(this, "Can’t Sign Up" + "\n password not strong" + "\n password must be '#' or '*' or '&' or '@' or '$' ");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        new home().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(signUp3_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUp3_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUp3_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUp3_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUp3_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField btn_pass;
    private javax.swing.JPasswordField btn_rePass;
    private javax.swing.JTextField btn_userName;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rbtn_female;
    private javax.swing.JRadioButton rbtn_male;
    // End of variables declaration//GEN-END:variables
}

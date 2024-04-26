/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clup_owners;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class signUp_admin extends javax.swing.JFrame {
    public Connection con;

    /**
     * Creates new form signUp_admin
     */
    public signUp_admin() {
        initComponents();
         this.setExtendedState(JFrame.MAXIMIZED_BOTH);
           try {
         
        seccurity c1 = new seccurity();
        con = c1.connect();
        System.out.println("connected <<signUp_admin>>");
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
        jLabel5 = new javax.swing.JLabel();
        btn_pass = new javax.swing.JPasswordField();
        btn_rePass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_PIN = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        rbtn_female = new javax.swing.JRadioButton();
        btn_rePIN = new javax.swing.JPasswordField();
        rbtn_male = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Club Owners");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Create a basic admin account");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 730, 90));
        getContentPane().add(btn_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 260, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Create Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 160, 30));
        getContentPane().add(btn_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 250, 40));
        getContentPane().add(btn_rePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 260, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Be careful!");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 310, 100, 20));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Create PIN");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 350, 110, 30));
        getContentPane().add(btn_PIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 390, 260, 40));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Re_type PIN");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 460, -1, -1));

        rbtn_female.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbtn_female);
        rbtn_female.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rbtn_female.setForeground(new java.awt.Color(0, 0, 0));
        rbtn_female.setText("female");
        getContentPane().add(rbtn_female, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 620, -1, -1));
        getContentPane().add(btn_rePIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 500, 260, 40));

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
        getContentPane().add(rbtn_male, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 620, 70, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\3d\\WhatsApp Image 2024-04-18 at 21.40.33_e1b04571.jpg")); // NOI18N
        jLabel3.setText(" ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 430, 340));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("User Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 100, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Re_type Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 450, 180, 50));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("The PIN is responsible for logging in or creating another");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 310, 370, 50));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 51));
        jLabel10.setText("administrator account .");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 340, 340, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 690, 570, 60));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("( It must contain @club.com)");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 210, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\3d\\WhatsApp Image 2024-04-16 at 03.03.43_f020c253.jpg")); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String m="@club.com";
        if(btn_pass.getText().contains("@") || btn_pass.getText().contains("$") || btn_pass.getText().contains("*") || btn_pass.getText().contains("#") || btn_pass.getText().contains("&")&&btn_userName.getText().contains(m) &&!btn_userName.getText().isEmpty()&&!btn_pass.getText().isEmpty()&&!btn_rePass.getText().isEmpty()&&btn_pass.getText().equals(btn_rePass.getText())&&!btn_PIN.getText().isEmpty()&&!btn_rePIN.getText().isEmpty()&&btn_PIN.getText().equals(btn_rePIN.getText())){
             
              
                 String gender;
                 int s=Integer.parseInt(btn_PIN.getText());
                 if (rbtn_male.isSelected()) {
                     gender = "male";
                 } else {
                     gender = "female";
                 }
                 
                
                 admin a1=new admin(btn_userName.getText(),btn_pass.getText());
                 a1.insert_user(btn_userName.getText(), btn_pass.getText(),s,gender);
 
                 JOptionPane.showMessageDialog(this, "Successful"+a1.toString()+"\n");
                 this.dispose();

                 new home().setVisible(true);
         }
         else if(btn_userName.getText().isEmpty())
              JOptionPane.showMessageDialog(this, "Can’t Sign Up" + "\n User name not excite");
         else if(btn_pass.getText().isEmpty())
              JOptionPane.showMessageDialog(this, "Can’t Sign Up" + "\n password not excite");
         else if(btn_rePass.getText().isEmpty())
             JOptionPane.showMessageDialog(this, "Can’t Sign Up" + "\n re_type password not excite");
         else if(!btn_pass.getText().equals(btn_rePass.getText()))
             JOptionPane.showMessageDialog(this, "Can’t Sign Up" + "\n password not same re_type password");
          else if(btn_PIN.getText().isEmpty())
              JOptionPane.showMessageDialog(this, "Can’t Sign Up" + "\n PIN not excite");
         else if(btn_rePIN.getText().isEmpty())
             JOptionPane.showMessageDialog(this, "Can’t Sign Up" + "\n re_type PIN not excite");
         else if(!btn_PIN.getText().equals(btn_rePIN.getText()))
             JOptionPane.showMessageDialog(this, "Can’t Sign Up" + "\n PIN not same re_type PIN");
         
         
          
            
           else if(btn_pass.getText().isEmpty()&&btn_rePass.getText().isEmpty())
               JOptionPane.showMessageDialog(this, "Can’t Sign Up" + "\n password and re_type password not excite");
            
            
           else if(btn_userName.getText().isEmpty()&&btn_pass.getText().isEmpty()&&btn_rePIN.getText().isEmpty()&&btn_rePass.getText().isEmpty())
               JOptionPane.showMessageDialog(this, "Can’t Sign Up");
        else if(!btn_userName.getText().contains(m))
            JOptionPane.showMessageDialog(this, "Can’t Sign Up" + "\n user Name must contain @club.com");

        else if (!btn_pass.getText().contains("*") || !btn_pass.getText().contains("#") || !btn_pass.getText().contains("&") || !btn_pass.getText().contains("@") || !btn_pass.getText().contains("$"))
            JOptionPane.showMessageDialog(this, "Can’t Sign Up" + "\n password not strong" + "\n password must be '#' or '*' or '&' or '@' or '$' ");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rbtn_malePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_rbtn_malePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_malePropertyChange

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
            java.util.logging.Logger.getLogger(signUp_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUp_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUp_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUp_admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUp_admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField btn_PIN;
    private javax.swing.JPasswordField btn_pass;
    private javax.swing.JPasswordField btn_rePIN;
    private javax.swing.JPasswordField btn_rePass;
    private javax.swing.JTextField btn_userName;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton rbtn_female;
    private javax.swing.JRadioButton rbtn_male;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.dao.UserDAO;


/**
 *
 * @author leona
 */
public class LoginView extends javax.swing.JFrame {

    /**
     * Creates new form LoginView
     */
    public LoginView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        loginTitle_Label = new javax.swing.JLabel();
        loginEmail_Label = new javax.swing.JLabel();
        loginPassword_Label = new javax.swing.JLabel();
        txtPasswordLogin = new javax.swing.JPasswordField();
        txtEmailLogin = new javax.swing.JTextField();
        signInButton = new javax.swing.JButton();
        createAccountButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ifood");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0xdc2626));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        loginTitle_Label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginTitle_Label.setForeground(new java.awt.Color(0xdc2626));
        loginTitle_Label.setText("LOGIN");

        loginEmail_Label.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        loginEmail_Label.setForeground(new java.awt.Color(0xdc2626));
        loginEmail_Label.setText("Email");

        loginPassword_Label.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        loginPassword_Label.setForeground(new java.awt.Color(0xdc2626));
        loginPassword_Label.setText("Password");

        txtPasswordLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordLoginKeyPressed(evt);
            }
        });

        signInButton.setBackground(new java.awt.Color(0xdc2626));
        signInButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        signInButton.setForeground(new java.awt.Color(255, 255, 255));
        signInButton.setText("Sign in");
        signInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });

        createAccountButton.setBackground(new java.awt.Color(0xdc2626));
        createAccountButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        createAccountButton.setForeground(new java.awt.Color(255, 255, 255));
        createAccountButton.setText("Create new account");
        createAccountButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccountButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(loginEmail_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmailLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(loginPassword_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(loginTitle_Label)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(loginTitle_Label)
                .addGap(38, 38, 38)
                .addComponent(loginEmail_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(loginPassword_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 351, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        // TODO add your handling code here:
        
        UserDAO userDAO = new UserDAO();
        
        String email = txtEmailLogin.getText().trim();
        String password = new String(txtPasswordLogin.getPassword()).trim();
        
        try {
            String role = userDAO.checkLogin(email, password);
            
            if(email.isEmpty() && password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Empty email or/and password fields.", "Access denied", JOptionPane.WARNING_MESSAGE);
            
            } else if(role == null){
                JOptionPane.showMessageDialog(this, "Invalid email or password.", "Login Failed", JOptionPane.WARNING_MESSAGE);
                
            } else if("regular".equals(role)){
                
                this.dispose();
                new MainRegularView().setVisible(true);
                
            } else if("restaurant".equals(role)){
                
                this.dispose();
                new MainRestaurantView().setVisible(true);
            } else {
                
                JOptionPane.showMessageDialog(this, "Unknown user.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(this, "An error occurred while connecting to the database.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_signInButtonActionPerformed

    private void createAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccountButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ChooseAccountView().setVisible(true);
    }//GEN-LAST:event_createAccountButtonActionPerformed

    private void txtPasswordLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordLoginKeyPressed
        // TODO add your handling code here:
        String email = txtEmailLogin.getText().trim();
        String password = new String(txtPasswordLogin.getPassword()).trim();
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            if(email.isEmpty() && password.isEmpty()){
                JOptionPane.showMessageDialog(this, "Empty email or/and password fields.", "Access denied", JOptionPane.WARNING_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_txtPasswordLoginKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAccountButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loginEmail_Label;
    private javax.swing.JLabel loginPassword_Label;
    private javax.swing.JLabel loginTitle_Label;
    private javax.swing.JButton signInButton;
    private javax.swing.JTextField txtEmailLogin;
    private javax.swing.JPasswordField txtPasswordLogin;
    // End of variables declaration//GEN-END:variables
}
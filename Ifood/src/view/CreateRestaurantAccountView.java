/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import model.beans.Restaurant;
import java.sql.*;
import javax.swing.JOptionPane;
import model.dao.UserDAO;

/**
 *
 * @author leona
 */
public class CreateRestaurantAccountView extends javax.swing.JFrame {

    /**
     * Creates new form CreateRestaurantAccountView
     */
    public CreateRestaurantAccountView() {
        initComponents();
        this.jScrollPane1.getVerticalScrollBar().setUnitIncrement(50);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jPasswordField4 = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        signUpButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        txtNameRest = new javax.swing.JTextField();
        txtPasswordRest = new javax.swing.JPasswordField();
        nameCreateAccountR_Label = new javax.swing.JLabel();
        cnpjCreateAccount_Label = new javax.swing.JLabel();
        passwordCreateAccountR_Label = new javax.swing.JLabel();
        emailCreateAccountR_Label = new javax.swing.JLabel();
        txtEmailRest = new javax.swing.JTextField();
        signUpRest_Button = new javax.swing.JButton();
        txtCPFRest = new javax.swing.JFormattedTextField();
        txtAddressRest = new javax.swing.JTextField();
        adressCreateAccount_Label = new javax.swing.JLabel();
        backRest_button = new javax.swing.JButton();

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setText("Email");

        jLabel11.setText("Password");

        signUpButton3.setText("Sign up");
        signUpButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButton3ActionPerformed(evt);
            }
        });

        jLabel13.setText("Confirm password");

        jLabel1.setText("Name");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(signUpButton3)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(115, 115, 115))
                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPasswordField4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signUpButton3)
                .addGap(33, 33, 33))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0xdc2626));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        nameCreateAccountR_Label.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        nameCreateAccountR_Label.setForeground(new java.awt.Color(0xdc2626));
        nameCreateAccountR_Label.setText("Name");

        cnpjCreateAccount_Label.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cnpjCreateAccount_Label.setForeground(new java.awt.Color(0xdc2626));
        cnpjCreateAccount_Label.setText("CPF");

        passwordCreateAccountR_Label.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        passwordCreateAccountR_Label.setForeground(new java.awt.Color(0xdc2626));
        passwordCreateAccountR_Label.setText("Password");

        emailCreateAccountR_Label.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        emailCreateAccountR_Label.setForeground(new java.awt.Color(0xdc2626));
        emailCreateAccountR_Label.setText("Email");

        signUpRest_Button.setBackground(new java.awt.Color(0xdc2626));
        signUpRest_Button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        signUpRest_Button.setForeground(new java.awt.Color(255, 255, 255));
        signUpRest_Button.setText("Sign up");
        signUpRest_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpRest_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpRest_ButtonActionPerformed(evt);
            }
        });

        try {
            txtCPFRest.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        adressCreateAccount_Label.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        adressCreateAccount_Label.setForeground(new java.awt.Color(0xdc2626));
        adressCreateAccount_Label.setText("Address");

        backRest_button.setBackground(new java.awt.Color(0xdc2626));
        backRest_button.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        backRest_button.setForeground(new java.awt.Color(255, 255, 255));
        backRest_button.setText("Back");
        backRest_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backRest_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backRest_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameCreateAccountR_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNameRest, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cnpjCreateAccount_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPFRest, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adressCreateAccount_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddressRest, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailCreateAccountR_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailRest, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordCreateAccountR_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(backRest_button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(signUpRest_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtPasswordRest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(367, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(nameCreateAccountR_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNameRest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cnpjCreateAccount_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCPFRest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adressCreateAccount_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddressRest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emailCreateAccountR_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailRest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordCreateAccountR_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPasswordRest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backRest_button)
                    .addComponent(signUpRest_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addContainerGap(224, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 351, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
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

    private void signUpButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpButton3ActionPerformed

    private void signUpRest_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpRest_ButtonActionPerformed
        // TODO add your handling code here:
        
        String password = new String(txtPasswordRest.getPassword()).trim();
        
        Restaurant restaurant = new Restaurant(null, null, null, null, null);
        UserDAO dao = new UserDAO();
        
        restaurant.setName(txtNameRest.getText());
        restaurant.setEmail(txtEmailRest.getText());
        restaurant.setCpf(txtCPFRest.getText());
        restaurant.setAddress(txtAddressRest.getText());
        restaurant.setPassword(password);
        
        this.dispose();
        new LoginView().setVisible(true);
        
        try{
            dao.create(restaurant);
            this.dispose();
            new LoginView().setVisible(true);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "An error occurred while creating the account.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_signUpRest_ButtonActionPerformed

    private void backRest_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backRest_buttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ChooseAccountView().setVisible(true);
    }//GEN-LAST:event_backRest_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(CreateRestaurantAccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateRestaurantAccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateRestaurantAccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateRestaurantAccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateRestaurantAccountView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adressCreateAccount_Label;
    private javax.swing.JButton backRest_button;
    private javax.swing.JLabel cnpjCreateAccount_Label;
    private javax.swing.JLabel emailCreateAccountR_Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel nameCreateAccountR_Label;
    private javax.swing.JLabel passwordCreateAccountR_Label;
    private javax.swing.JButton signUpButton3;
    private javax.swing.JButton signUpRest_Button;
    private javax.swing.JTextField txtAddressRest;
    private javax.swing.JFormattedTextField txtCPFRest;
    private javax.swing.JTextField txtEmailRest;
    private javax.swing.JTextField txtNameRest;
    private javax.swing.JPasswordField txtPasswordRest;
    // End of variables declaration//GEN-END:variables
}
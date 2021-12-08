/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.loginScreens;
import Business.EcoSystem;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Role.Role;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JPanel;
/**
 *
 * @author patil
 */
public class loginOptions extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem system;
    Type type;
    /**
     * Creates new form loginOptions
     */
            
    
    public loginOptions(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMother = new javax.swing.JButton();
        btnFamily = new javax.swing.JButton();
        btnCounselor = new javax.swing.JButton();
        btnFinance = new javax.swing.JButton();
        btnFinance1 = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        btnMother.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnMother.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/maternity.png"))); // NOI18N
        btnMother.setText("MOTHER");
        btnMother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMotherActionPerformed(evt);
            }
        });

        btnFamily.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnFamily.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/family.png"))); // NOI18N
        btnFamily.setText("FAMILY");
        btnFamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFamilyActionPerformed(evt);
            }
        });

        btnCounselor.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnCounselor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/advice.png"))); // NOI18N
        btnCounselor.setText("COUNSELOR");
        btnCounselor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCounselorActionPerformed(evt);
            }
        });

        btnFinance.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnFinance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/shield-2.png"))); // NOI18N
        btnFinance.setText("INSURANCE");
        btnFinance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceActionPerformed(evt);
            }
        });

        btnFinance1.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnFinance1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save-money.png"))); // NOI18N
        btnFinance1.setText("BANK");
        btnFinance1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinance1ActionPerformed(evt);
            }
        });

        btnAdmin.setFont(new java.awt.Font("Lucida Grande", 1, 11)); // NOI18N
        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin-with-cogwheels-5.png"))); // NOI18N
        btnAdmin.setText("ADMIN");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMother, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCounselor, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFinance, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(btnFinance1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdmin)
                    .addComponent(btnFamily)
                    .addComponent(btnFinance))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMother)
                    .addComponent(btnCounselor)
                    .addComponent(btnFinance1))
                .addContainerGap(227, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMotherActionPerformed

        loginScreen ls = new loginScreen(userProcessContainer, system, type.BirthMotherOrg);
        userProcessContainer.add("loginScreen", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnMotherActionPerformed

    private void btnFamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFamilyActionPerformed
        // TODO add your handling code here:
        loginScreen ls = new loginScreen(userProcessContainer, system, type.ParentsOrg);
        userProcessContainer.add("loginScreen", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFamilyActionPerformed

    private void btnCounselorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCounselorActionPerformed
        // TODO add your handling code here:
        loginScreen ls = new loginScreen(userProcessContainer, system, type.Counselor);
        userProcessContainer.add("loginScreen", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCounselorActionPerformed

    private void btnFinanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceActionPerformed
        // TODO add your handling code here:
        loginScreen ls = new loginScreen(userProcessContainer,system, type.InsuranceManager);
        userProcessContainer.add("loginScreen", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFinanceActionPerformed

    private void btnFinance1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinance1ActionPerformed
        // TODO add your handling code here:
        loginScreen ls = new loginScreen(userProcessContainer,system, type.BankManager);
        userProcessContainer.add("loginScreen", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFinance1ActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        loginScreen ls = new loginScreen(userProcessContainer, system, type.HospitalAdmin);
        userProcessContainer.add("loginScreen", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAdminActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCounselor;
    private javax.swing.JButton btnFamily;
    private javax.swing.JButton btnFinance;
    private javax.swing.JButton btnFinance1;
    private javax.swing.JButton btnMother;
    // End of variables declaration//GEN-END:variables
}

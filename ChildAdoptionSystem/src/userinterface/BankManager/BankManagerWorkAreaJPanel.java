/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BankManager;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nikhi
 */
public class BankManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private UserAccount userAccount;
    private EcoSystem system;
    private Enterprise enterprise;
    /**
     * Creates new form CounselorWorkArea
     */
    public BankManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem system, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;        
        this.organization = organization;
        this.userAccount = account;
        valueLabel.setText(organization.getName());
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewLoanApplicationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        viewBankAccountDetails = new javax.swing.JButton();
        newAccountReqBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        viewLoanApplicationJButton.setBackground(new java.awt.Color(204, 204, 0));
        viewLoanApplicationJButton.setText("New Loan Applications");
        viewLoanApplicationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLoanApplicationJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("ORGANIZATION:");

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        valueLabel.setText("<value>");

        viewBankAccountDetails.setBackground(new java.awt.Color(204, 204, 0));
        viewBankAccountDetails.setText("View Bank Account Details");
        viewBankAccountDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBankAccountDetailsActionPerformed(evt);
            }
        });

        newAccountReqBtn.setBackground(new java.awt.Color(204, 204, 0));
        newAccountReqBtn.setText("New Account Requests");
        newAccountReqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAccountReqBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(viewLoanApplicationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(newAccountReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewBankAccountDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel)
                        .addGap(4, 4, 4)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(newAccountReqBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewLoanApplicationJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewBankAccountDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewLoanApplicationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLoanApplicationJButtonActionPerformed
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewLoanApplicationWorkAreaJPanel", new ViewLoanApplicationWorkAreaJPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_viewLoanApplicationJButtonActionPerformed

    private void viewBankAccountDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBankAccountDetailsActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewBankAccountDetailsJPanel", new ViewBankAccountDetailsJPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewBankAccountDetailsActionPerformed

    private void newAccountReqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAccountReqBtnActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewBankAccountRequest", new ViewBankAccountRequest(userProcessContainer, userAccount, organization,enterprise));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_newAccountReqBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton newAccountReqBtn;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JButton viewBankAccountDetails;
    private javax.swing.JButton viewLoanApplicationJButton;
    // End of variables declaration//GEN-END:variables
}

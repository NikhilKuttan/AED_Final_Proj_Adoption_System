/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ParentsRole;

import static Business.ConfigureASystem.system;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.People.Parents;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.Dashboard.ParentDashboard;

/**
 *
 * @author patil
 */
public class ParentsWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Organization organization;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Parents parents;
    /**
     * Creates new form CounselorWorkArea
     */
    public ParentsWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account, Organization organization) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.parents = account.getParent();
        valueLabel.setText(enterprise.getName());
       addDashBoard();
      //  ParentDashboard lp = new ParentDashboard(parents);                                                                                                                                                                                                                                                                                                                                                dashboardPanel.add(lp);
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        checkRequestsPending = new javax.swing.JButton();
        btnViewFamily = new javax.swing.JButton();
        dashboardPanel = new javax.swing.JPanel();
        btnViewOrphanages = new javax.swing.JButton();
        btnOrphanage = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("ENTERPRISE:");

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        valueLabel.setText("<value>");

        checkRequestsPending.setBackground(new java.awt.Color(204, 204, 0));
        checkRequestsPending.setText("Check Birth Mother Request");
        checkRequestsPending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRequestsPendingActionPerformed(evt);
            }
        });

        btnViewFamily.setBackground(new java.awt.Color(204, 204, 0));
        btnViewFamily.setText("View/Update Family Profile");
        btnViewFamily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFamilyActionPerformed(evt);
            }
        });

        dashboardPanel.setBackground(new java.awt.Color(64, 151, 182));
        dashboardPanel.setPreferredSize(new java.awt.Dimension(900, 424));

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );
        btnViewOrphanages.setBackground(new java.awt.Color(204, 204, 0));
        btnViewOrphanages.setText("View Orphanages");
        btnViewOrphanages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrphanagesActionPerformed(evt);
            }
        });

        btnOrphanage.setText("Schedule visit to Orphanage");
        btnOrphanage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrphanageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnViewFamily, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(checkRequestsPending, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(btnViewOrphanages, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOrphanage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dashboardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkRequestsPending, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnViewFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(btnViewOrphanages, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(719, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void addDashBoard(){
        ParentDashboard lp = new ParentDashboard(parents);
        dashboardPanel.add(lp);
    
    }
    private void checkRequestsPendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRequestsPendingActionPerformed
        if(userAccount.getParent().getBloodGroup() == null){
            JOptionPane.showMessageDialog(this, "Please complete your profile to view requests!");
           return;
        }
        
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewBirthMotherRequestsJPanel", new ViewBirthMotherRequestsJPanel(userProcessContainer, userAccount, organization, enterprise,system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_checkRequestsPendingActionPerformed

    private void btnViewFamilyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFamilyActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("FamilyProfile", new FamilyProfile(userAccount,organization,userProcessContainer));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewFamilyActionPerformed

    private void btnViewOrphanagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrphanagesActionPerformed
        // TODO add your handling code here:
          CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewBirthMotherRequestsJPanel", new ViewBirthMotherRequestsJPanel(userProcessContainer, userAccount, organization, enterprise,system));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnViewOrphanagesActionPerformed

    private void btnOrphanageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrphanageActionPerformed
        // TODO add your handling code here:
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewOrphanageSchedule", new ViewOrphanageSchedule());
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOrphanageActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrphanage;
    private javax.swing.JButton btnViewFamily;
    private javax.swing.JButton btnViewOrphanages;
    private javax.swing.JButton checkRequestsPending;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}

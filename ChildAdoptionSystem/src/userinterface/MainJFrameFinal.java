/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.People.Orphanage;
import Business.People.OrphanageDirectory;
import java.awt.CardLayout;
import userinterface.Register.registerOptions;
import userinterface.loginScreens.loginOptions;

/**
 *
 * @author nikhi
 */
public class MainJFrameFinal extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrameFinal
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
  public static OrphanageDirectory orphanageDirectory;
    
    public MainJFrameFinal() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        LandingPanel lp = new LandingPanel();
        userProcessContainer.add("LandingPanel", lp);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPanel = new javax.swing.JSplitPane();
        userProcessContainer = new javax.swing.JPanel();
        topJPanel = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPanel.setBackground(new java.awt.Color(187, 238, 238));
        splitPanel.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitPanel.setRightComponent(userProcessContainer);

        topJPanel.setBackground(new java.awt.Color(204, 204, 255));

        btnLogin.setBackground(new java.awt.Color(204, 204, 0));
        btnLogin.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogin.setFocusPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(204, 204, 0));
        btnRegister.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        btnRegister.setText("REGISTER");
        btnRegister.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(204, 204, 0));
        btnLogout.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        btnLogout.setText("LOGOUT");
        btnLogout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLogout.setMaximumSize(new java.awt.Dimension(131, 42));
        btnLogout.setMinimumSize(new java.awt.Dimension(131, 42));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CHILD ADOPTION SYSTEM");

        javax.swing.GroupLayout topJPanelLayout = new javax.swing.GroupLayout(topJPanel);
        topJPanel.setLayout(topJPanelLayout);
        topJPanelLayout.setHorizontalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topJPanelLayout.createSequentialGroup()
                .addGroup(topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(topJPanelLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1372, Short.MAX_VALUE)))
                .addContainerGap())
        );
        topJPanelLayout.setVerticalGroup(
            topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(topJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister)
                    .addComponent(btnLogin))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        splitPanel.setTopComponent(topJPanel);

        getContentPane().add(splitPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   public static OrphanageDirectory getOrphanageDirectory() {
    if (orphanageDirectory == null) {
      orphanageDirectory = new OrphanageDirectory();
        Orphanage o1 = new Orphanage();
        o1.setUsername("First Orphanage - Default Pending");
        Orphanage o2 = new Orphanage();
        o2.setUsername("Second Orphanage - Already Approved");
        o2.setStatus(Orphanage.Status.APPROVED);
      //  orphanageDirectory.addOrphanage(o1);
       // orphanageDirectory.addOrphanage(o2);
    }
    return orphanageDirectory;
  } 
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        loginOptions ls = new loginOptions(userProcessContainer,system);
        userProcessContainer.add("loginOptions", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        btnLogout.setEnabled(true);
        btnLogin.setEnabled(false);
        btnRegister.setEnabled(false);
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        registerOptions ls = new registerOptions(userProcessContainer,system);
        userProcessContainer.add("registerOptions", ls);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        btnLogout.setEnabled(true);
        btnLogin.setEnabled(false);
        btnRegister.setEnabled(false);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        btnLogout.setEnabled(false);
        btnLogin.setEnabled(true);
        btnRegister.setEnabled(true);
        
        userProcessContainer.removeAll();
        
        LandingPanel lp = new LandingPanel();
        userProcessContainer.add("LandingPanel", lp);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrameFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrameFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrameFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrameFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrameFinal().setVisible(true);
               
                
                
            }
        });


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSplitPane splitPanel;
    private javax.swing.JPanel topJPanel;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}

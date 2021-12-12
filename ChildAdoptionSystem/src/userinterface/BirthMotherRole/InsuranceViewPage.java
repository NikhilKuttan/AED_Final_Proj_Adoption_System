/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BirthMotherRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Insurance.Insurance;
import Business.Insurance.InsuranceAccountDirectory;
import Business.Network.Network;
import Business.People.BirthMother;
import Business.UserAccount.UserAccount;
import Business.Validations.ValidateEmailTextField;
import Business.Validations.ValidatePasswords;
import Business.Validations.ValidatePhoneNumber;
import Business.Validations.ValidateStrings;
import Business.WorkQueue.BirthMotherToInsuranceManager;
import java.awt.CardLayout;
import java.io.File;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.InputVerifier;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import userinterface.Dialog.SuccessDialog;

/**
 *
 * @author nikhi
 */
public class InsuranceViewPage extends javax.swing.JPanel {

    /**
     * Creates new form BirthMotherProfile
     */
    
    private BirthMother BirthMother;
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private String documentUpload;
     private String firstName;
    private String lastName;
    private String emailId;
    private int policynumber;
    private String address;
    private InsuranceAccountDirectory insuranceDirectory;
    private boolean flagC;
    private String username;
    private EcoSystem system;
    private Network network;
    private Enterprise enterprise;
    
    
    public InsuranceViewPage(UserAccount userAccount, JPanel userProcessContainer, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userAccount = userAccount;
        this.BirthMother = userAccount.getBirthmother();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        
        txtUsername.setText(BirthMother.getUsername());
        txtEmail.setText(BirthMother.getEmailId());
        txtFirstName.setText(BirthMother.getFirstName());
        txtLastName.setText(BirthMother.getLastName());
        
//        
//        for(Network n : system.getNetworkList()){
//            if(n.getName().equals(userAccount.getNetwork())){
//                for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
//                    if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.FinancialEnterprise)){
//                       insuranceDirectory =  e.getInsuranceAccountDirectory();
//                    
//                    }
//                
//                }
//            
//            }
//        
//        }
        this.system = system;
        addInputVerifiers();
        btnConfirm.setEnabled(true);
        
        
        
    }
 private void addInputVerifiers() {
        InputVerifier stringValidation = new ValidateStrings();
        txtFirstName.setInputVerifier(stringValidation);
        txtUsername.setInputVerifier(stringValidation);
        txtAddress.setInputVerifier(stringValidation);
        InputVerifier passwordValidation = new ValidatePasswords();
        InputVerifier emailValidation = new ValidateEmailTextField();
        InputVerifier number = new ValidatePhoneNumber();
        txtPolicyNumber.setInputVerifier(number);
        txtLastName.setInputVerifier(stringValidation);
        txtEmail.setInputVerifier(emailValidation);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPolicyNumber = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtDoc = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        agreeCheckBox = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("INSURANCE DETAILS");

        jLabel2.setText("USERNAME:");

        jLabel3.setText("FIRST NAME:");

        jLabel4.setText("LAST NAME:");

        jLabel5.setText("EMAIL ID:");

        jLabel10.setText("POLICY NUMBER:");

        jLabel12.setText("ADDRESS:");

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        txtDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocActionPerformed(evt);
            }
        });

        btnBrowse.setBackground(new java.awt.Color(204, 204, 0));
        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        jLabel17.setText("UPLOAD DOCUMENT:");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnConfirm.setBackground(new java.awt.Color(204, 204, 0));
        btnConfirm.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnConfirm.setText("CONFIRM");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        agreeCheckBox.setText("*I agree the above information is correct to the best of knowledge.");
        agreeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreeCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12)
                            .addComponent(jLabel17)
                            .addComponent(jLabel10))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPolicyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnBrowse)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agreeCheckBox)
                .addGap(620, 620, 620))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(119, 119, 119)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(859, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBack)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtPolicyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBrowse)))
                .addGap(18, 18, 18)
                .addComponent(agreeCheckBox)
                .addContainerGap(228, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(407, 407, 407)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(180, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed

         JFileChooser file = new JFileChooser();
         file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter extensionfilter =  new FileNameExtensionFilter("*.Images", "jpg","png");
        file.addChoosableFileFilter(extensionfilter);
        int result = file.showSaveDialog(null);

        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            this.documentUpload = path;
            txtDoc.setText(path);
        }
        else if(result == JFileChooser.CANCEL_OPTION){
            System.out.println("No File Select");
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        this.firstName = txtFirstName.getText();
        this.lastName = txtLastName.getText();
        this.emailId = txtEmail.getText();
        this.policynumber = Integer.parseInt(txtPolicyNumber.getText());
        this.address = txtAddress.getText();
       
        
        
       if (flagC == true){
        Insurance nw = new Insurance();
        for(Network network: system.getNetworkList()){
            if(network.getName().equals(userAccount.getNetwork()))
            {
                for(Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()){
                    if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.FinancialEnterprise))
                    {
                            this.enterprise = e;
                               nw.setHospital(userAccount.getBirthmother().getHospital());
                               nw.setAddress(this.address);
                               nw.setEmailId(this.emailId);
                               nw.setLastName(lastName);
                               nw.setFirstName(firstName);
                               nw.setPolicyNumber(policynumber);
                               nw.setUsername(userAccount.getUsername());
                               nw.setDocPath(txtDoc.getText());
                               

                                BirthMotherToInsuranceManager bminsure = new BirthMotherToInsuranceManager( this.BirthMother, userAccount, nw, insuranceDirectory);
                                bminsure.setStatus("Pending");
                                bminsure.setSender(userAccount);
                                bminsure.setRequestDate(new Date());
                               e.getWorkQueue().getBirthMotherToInsurance().add(bminsure);
                               e.getInsuranceAccountDirectory().addInsurance(nw);
                        
                    }
                }
            }
        }
       this.BirthMother.setTypeL(2);
        this.BirthMother.setInsurance(nw);
        SuccessDialog d = new SuccessDialog("Successfully updated Insurance Profile");
                d.setVisible(true);
        
       }
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void agreeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreeCheckBoxActionPerformed
        // TODO add your handling code here:
        boolean checked = agreeCheckBox.isSelected();
         if(checked == true)
         {
            flagC= true;
         }
         else 
             
        JOptionPane.showMessageDialog(null, "Please check for Declaration");
    }//GEN-LAST:event_agreeCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox agreeCheckBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPolicyNumber;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

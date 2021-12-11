/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Register;

import Business.EcoSystem;
import Business.EmailGeneration.EmailFormat;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.People.Parents;
import Business.People.ParentsDirectory;
import Business.UserAccount.UserAccount;
import Business.Validations.ValidateEmailTextField;
import Business.Validations.ValidatePasswords;
import Business.Validations.ValidateStrings;
import Business.WorkQueue.ParentToCounselor;
import java.awt.CardLayout;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.Dialog.SuccessDialog;

/**
 *
 * @author patil
 */
public class registerFamily extends javax.swing.JPanel {

    /**
     * Creates new form registerFamily
     */
    
    EcoSystem system;
    JPanel userProcessContainer;
    private String username;
    private static int count = 0;
    private String email;
    private String password;
    private boolean worstCaseScenerio;
    private boolean finChild;
    private boolean bigChanges;
    private boolean comSituation;
    private boolean currChildrenOnBoard;
    private boolean eduRealities;
    private boolean promises;
    private boolean guilt;
    private ParentsDirectory parentDirectory;
    private ParentToCounselor parentToCounselor;
    private Enterprise enterprise;
    private Organization organization;
    
    
    public registerFamily(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        addInputVerifiers();
        populateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtConfPassword = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        isPrepared = new javax.swing.JRadioButton();
        notPrepared = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        isFinance = new javax.swing.JRadioButton();
        notSelectFinance = new javax.swing.JRadioButton();
        isBigChange = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        notBigChange = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        notComfortable = new javax.swing.JRadioButton();
        isComfortable = new javax.swing.JRadioButton();
        isChildrenOnBoard = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        notOnBoardChildren = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        isEducated = new javax.swing.JRadioButton();
        notEducated = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        isPromise = new javax.swing.JRadioButton();
        notPromise = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        notGuilty = new javax.swing.JRadioButton();
        isGuilty = new javax.swing.JRadioButton();
        hospitalJComboBox = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(64, 151, 182));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Username*:");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabel4.setText("Email*:");

        jLabel2.setText("Password*:");

        jLabel3.setText("Confirm Password*:");

        btnConfirm.setBackground(new java.awt.Color(255, 153, 51));
        btnConfirm.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnConfirm.setText("CONFIRM");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jLabel5.setText("You are prepared for the “worst case scenario.”");

        isPrepared.setText("Yes");

        notPrepared.setText("No");

        jLabel6.setText("You are financially prepared for the child.");

        isFinance.setText("Yes");

        notSelectFinance.setText("No");

        isBigChange.setText("Yes");

        jLabel7.setText("You are able or willing to make BIG changes.");

        notBigChange.setText("No");

        jLabel8.setText("Your partner is comfortable with the situation.");

        notComfortable.setText("No");

        isComfortable.setText("Yes");

        isChildrenOnBoard.setText("Yes");

        jLabel9.setText("Your current children are on board with the situation.");

        notOnBoardChildren.setText("No");

        jLabel10.setText("You are educated about the realities of the type of adoption you are pursuing.");

        isEducated.setText("Yes");

        notEducated.setText("No");

        jLabel11.setText("You plan to make promises or commitments you actually can or will keep");

        isPromise.setText("Yes");

        notPromise.setText("No");

        jLabel12.setText("You want to say “yes” not out of guilt.");

        notGuilty.setText("No");

        isGuilty.setText("Yes");

        hospitalJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setText("Select Hospital:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isComfortable)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notComfortable))
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isBigChange)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notBigChange))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isFinance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notSelectFinance))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isPrepared)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notPrepared))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtConfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hospitalJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isEducated)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notEducated))
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isGuilty)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notGuilty))
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isPromise)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notPromise))
                            .addComponent(jLabel11)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(isChildrenOnBoard)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(notOnBoardChildren))
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(hospitalJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtConfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isPrepared)
                            .addComponent(notPrepared))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isFinance)
                            .addComponent(notSelectFinance))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isBigChange)
                            .addComponent(notBigChange))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isComfortable)
                            .addComponent(notComfortable)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isChildrenOnBoard)
                            .addComponent(notOnBoardChildren))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isEducated)
                            .addComponent(notEducated))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isPromise)
                            .addComponent(notPromise))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isGuilty)
                            .addComponent(notGuilty))))
                .addGap(29, 29, 29)
                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 154, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
        private void addInputVerifiers() {
        InputVerifier stringValidation = new ValidateStrings();
        
        InputVerifier passwordValidation = new ValidatePasswords();
        InputVerifier emailValidation = new ValidateEmailTextField();
             txtUsername.setInputVerifier(stringValidation);
   
        txtPassword.setInputVerifier(passwordValidation);
        txtConfPassword.setInputVerifier(passwordValidation);
        txtEmail.setInputVerifier(emailValidation);
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        this.username = txtUsername.getText();
        this.email = txtEmail.getText();
        this.password = txtPassword.getText();
        if(isPrepared.isSelected()){
            this.worstCaseScenerio = true;
        }
        else
           this.worstCaseScenerio = false; 
        
        if(isFinance.isSelected()){
            this.finChild = true;
        }
        else
           this.finChild = false;
        
        if(isBigChange.isSelected()){
            this.bigChanges = true;
        }
        else
           this.bigChanges = false;
        
        if(isComfortable.isSelected()){
            this.comSituation = true;
        }
        else
           this.comSituation = false;
        
        if(isChildrenOnBoard.isSelected()){
            this.currChildrenOnBoard = true;
        }
        else
           this.currChildrenOnBoard = false;
        
        if(isEducated.isSelected()){
            this.eduRealities = true;
        }
        else
           this.eduRealities = false;
        
        if(isPromise.isSelected()){
            this.promises = true;
        }
        else
           this.promises = false;
        
        if(isGuilty.isSelected()){
            this.guilt = true;
        }
        else
           this.guilt = false;
        
        HospitalEnterprise hospital = (HospitalEnterprise) hospitalJComboBox.getSelectedItem();
        
        if (hospital == null){
            JOptionPane.showMessageDialog(null, "Please select the Hospital");
            throw new RuntimeException("Please enter the Hospital");
        }
        if ( txtUsername == null){
            JOptionPane.showMessageDialog(null, "Please enter Username");
            throw new RuntimeException("Please enter username");
        }
        
        for (Network n : system.getNetworkList()){
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                if (e.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital)){
                    for(UserAccount ua : e.getUserAccountDirectory().getUserAccountList()){
                        if(ua.getUsername().equals(username)){
                             JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                             return;  
                        }
                            for(Organization o : e.getOrganizationDirectory().getOrganizationList()){  
                                for(UserAccount ua1 : o.getUserAccountDirectory().getUserAccountList()){ 
                                    if(ua1.getUsername().equals(username)){
                                        JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                                        return;  
                                    }   
                                } 
                            }
                        
                    }
                }
            }
        }
 
  /*      if(!(organization.getUserAccountDirectory().checkIfUsernameIsUnique(username))){
            JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
       */ 
        Parents parent = new Parents(username, email, password,worstCaseScenerio,
                         finChild, bigChanges, comSituation, currChildrenOnBoard, eduRealities, promises, guilt );
        hospital.getParentDirectory().addParents(parent);
        parentToCounselor = new ParentToCounselor("Please review the parent profile", parent);
        hospital.getWorkQueue().getParentToCounselor().add(parentToCounselor);
       
        String message =  " <h1>Welcome To Adoption Assist</h1> <body>  <br>Your Registration is successful! </br> <br>Your Profile ID is " + parent.getParentId()
                + "and your Userid: "+parent.getUsername()+"</br> <br> Kindly wait for your Counselor to review your details!</br> </body> <h2> Thank you! </h2>";
               
        EmailFormat em = new EmailFormat(this.email,message, "Registration Successful at AdoptAssist" );
        em.sendEmail();
        
        SuccessDialog d = new SuccessDialog("Your Registration was successful! Please Logout!");
        d.setVisible(true);
        
        
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed
private void populateComboBox() {
        //hospitalJComboBox.removeAllItems();
        hospitalJComboBox.removeAllItems();
        for(Network n: system.getNetworkList()){
            for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                if(e.getEnterpriseType().equals(Enterprise.EnterpriseType.Hospital)){
                    hospitalJComboBox.addItem(e);
                }    
            }
        }
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox hospitalJComboBox;
    private javax.swing.JRadioButton isBigChange;
    private javax.swing.JRadioButton isChildrenOnBoard;
    private javax.swing.JRadioButton isComfortable;
    private javax.swing.JRadioButton isEducated;
    private javax.swing.JRadioButton isFinance;
    private javax.swing.JRadioButton isGuilty;
    private javax.swing.JRadioButton isPrepared;
    private javax.swing.JRadioButton isPromise;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton notBigChange;
    private javax.swing.JRadioButton notComfortable;
    private javax.swing.JRadioButton notEducated;
    private javax.swing.JRadioButton notGuilty;
    private javax.swing.JRadioButton notOnBoardChildren;
    private javax.swing.JRadioButton notPrepared;
    private javax.swing.JRadioButton notPromise;
    private javax.swing.JRadioButton notSelectFinance;
    private javax.swing.JTextField txtConfPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

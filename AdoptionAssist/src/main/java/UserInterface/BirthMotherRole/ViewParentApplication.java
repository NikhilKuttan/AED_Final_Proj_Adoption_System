/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BirthMotherRole;

import Business.Enterprise.Enterprise;
import Business.People.BirthMother;
import Business.People.Parents;
import Business.WorkQueue.BirthMotherToParent;
import java.awt.CardLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.Dialog.SuccessDialog;

/**
 *
 * @author nikhi
 */
public class ViewParentApplication extends javax.swing.JPanel {

    /**
     * Creates new form ViewParentApplication
     */
    private JPanel userProcessContainer;
    private BirthMotherToParent request;
    private Parents parent;
    private Enterprise enterprise;
    private BirthMother birthMother;
    
    public ViewParentApplication(JPanel userProcessContainer, Parents p, BirthMother birthMother,Enterprise enterprise) {
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.birthMother = birthMother;
        this.parent = p;
        
        initComponents();
        fillComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAccept = new javax.swing.JButton();
        notGuilty = new javax.swing.JRadioButton();
        isGuilty = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        notComfortable = new javax.swing.JRadioButton();
        isComfortable = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        isBigChange = new javax.swing.JRadioButton();
        notBigChange = new javax.swing.JRadioButton();
        isPromise = new javax.swing.JRadioButton();
        notPromise = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        isFinance = new javax.swing.JRadioButton();
        notSelectFinance = new javax.swing.JRadioButton();
        isEducated = new javax.swing.JRadioButton();
        notEducated = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        notPrepared = new javax.swing.JRadioButton();
        isPrepared = new javax.swing.JRadioButton();
        isChildrenOnBoard = new javax.swing.JRadioButton();
        notOnBoardChildren = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtMessage = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        profilePhotoComponent = new javax.swing.JLabel();

        btnAccept.setBackground(new java.awt.Color(255, 153, 51));
        btnAccept.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        btnAccept.setText("ACCEPT");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        notGuilty.setText("No");
        notGuilty.setEnabled(false);
        notGuilty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notGuiltyActionPerformed(evt);
            }
        });

        isGuilty.setText("Yes");
        isGuilty.setEnabled(false);

        jLabel12.setText("You want to say “yes” not out of guilt.");
        jLabel12.setEnabled(false);

        notComfortable.setText("No");
        notComfortable.setEnabled(false);

        isComfortable.setText("Yes");
        isComfortable.setEnabled(false);

        jLabel8.setText("Your partner is comfortable with the situation.");
        jLabel8.setEnabled(false);

        isBigChange.setText("Yes");
        isBigChange.setEnabled(false);

        notBigChange.setText("No");
        notBigChange.setEnabled(false);

        isPromise.setText("Yes");
        isPromise.setEnabled(false);

        notPromise.setText("No");
        notPromise.setEnabled(false);

        jLabel11.setText("You plan to make promises or commitments you actually can or will keep");
        jLabel11.setEnabled(false);

        jLabel7.setText("You are able or willing to make BIG changes.");
        jLabel7.setEnabled(false);

        isFinance.setText("Yes");
        isFinance.setEnabled(false);

        notSelectFinance.setText("No");
        notSelectFinance.setEnabled(false);

        isEducated.setText("Yes");
        isEducated.setEnabled(false);

        notEducated.setText("No");
        notEducated.setEnabled(false);

        jLabel10.setText("You are educated about the realities of the type of adoption you are pursuing.");
        jLabel10.setEnabled(false);

        jLabel6.setText("You are financially prepared for the child.");
        jLabel6.setEnabled(false);

        notPrepared.setText("No");
        notPrepared.setEnabled(false);

        isPrepared.setText("Yes");
        isPrepared.setEnabled(false);

        isChildrenOnBoard.setText("Yes");
        isChildrenOnBoard.setEnabled(false);

        notOnBoardChildren.setText("No");
        notOnBoardChildren.setEnabled(false);

        jLabel9.setText("Your current children are on board with the situation.");
        jLabel9.setEnabled(false);

        jLabel5.setText("You are prepared for the “worst case scenario.”");
        jLabel5.setEnabled(false);

        jLabel4.setText("Email*:");
        jLabel4.setEnabled(false);

        txtEmail.setEnabled(false);

        txtUsername.setEnabled(false);

        jLabel1.setText("Username*:");
        jLabel1.setEnabled(false);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/left-arrow-in-circular-button-black-symbol-2.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setText("Message for Parent:");
        jLabel2.setEnabled(false);

        profilePhotoComponent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profilePhotoComponent.setText("UPLOADED IMAGE DISPLAY");
        profilePhotoComponent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(isFinance)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(notSelectFinance))
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(isPrepared)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(notPrepared))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(isGuilty)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(notGuilty))
                                    .addComponent(jLabel12))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(isEducated)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(notEducated))
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(isPromise)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(notPromise))
                                    .addComponent(jLabel10)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(isChildrenOnBoard)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(notOnBoardChildren))
                                    .addComponent(jLabel9))
                                .addGap(30, 30, 30)
                                .addComponent(profilePhotoComponent, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isChildrenOnBoard)
                            .addComponent(notOnBoardChildren))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isEducated)
                            .addComponent(notEducated))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isPromise)
                            .addComponent(notPromise))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(profilePhotoComponent, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(notSelectFinance)))
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(notComfortable))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(isGuilty)
                            .addComponent(notGuilty)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(30, 30, 30))
                        .addComponent(txtMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void fillComponents(){
        profilePhotoComponent.setIcon(new ImageIcon(parent.getImgPath())); 
        if (parent.getUsername() != null){
        txtUsername.setText(parent.getUsername());
        }
        else
            txtUsername.setText("unavailable");
        if (parent.getUsername() != null){
        txtEmail.setText(parent.getEmail());
        }
        else
            txtUsername.setText("unavailable");
        boolean worstCaseScenerio = parent.isWorstCaseScenerio();
        if(worstCaseScenerio == true){
            isPrepared.setSelected(true);
        }
        else notPrepared.setSelected(true);
        boolean finChild = parent.isFinChild();
        if(finChild == true){
            isFinance.setSelected(true);
        }
        else notSelectFinance.setSelected(true);
        
        boolean bigChanges = parent.isBigChanges();
        if(bigChanges == true){
            isBigChange.setSelected(true);
        }
        else notBigChange.setSelected(true);
        boolean comSituation = parent.isComSituation();
        if(comSituation == true){
            isComfortable.setSelected(true);
        }
        else notComfortable.setSelected(true);
        boolean currChildrenOnBoard = parent.isCurrChildrenOnBoard();
        if(currChildrenOnBoard == true){
            isChildrenOnBoard.setSelected(true);
        }
        else notOnBoardChildren.setSelected(true);
        boolean eduRealities = parent.isEduRealities();
        if(eduRealities == true){
            isEducated.setSelected(true);
        }
        else notEducated.setSelected(true);
        boolean promises = parent.isPromises();
        if(promises == true){
            isPromise.setSelected(true);
        }
        else notPromise.setSelected(true);
     
        boolean guilt = parent.isGuilt();
        if(guilt == true){
            isGuilty.setSelected(true);
        }
        else notGuilty.setSelected(true);
        
             
    }
    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        
        if(birthMother.getAcceptedParents().contains(parent)){
            JOptionPane.showMessageDialog(this, "You have already accepted this parent");
            throw new RuntimeException("Please enter message");
        }
        else{
        String message = txtMessage.getText();
//        if(birthMother.getAcceptedParents().size()>0){
//            JOptionPane.showMessageDialog(this, "You have already selected and contacted a Parent");
//            throw new RuntimeException("Alrdy selected a parent");
//        }

       
        if(message == ""){
            JOptionPane.showMessageDialog(this, "Please enter message for parents");
            throw new RuntimeException("Please enter message");
            
        }
        
        request = new BirthMotherToParent(birthMother, parent);
        request.setRequestResult("Accepted by Mother");
        request.setMessage(message);
   /*     for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(o.getName().equals(Organization.Type.ParentsOrg.getValue())){
                for(Parents p : o.getParentDirectory().getParentsList()){
                    if(p.getUsername().equals(parent.getUsername())){
                        p.setIsAvailable(false);
                    }
                        
                }
            }
        }*/
      //  parent.setIsAvailable(false);
        birthMother.getAcceptedParents().add(parent);
        
        request.setStatus("Processing");
        SuccessDialog d = new SuccessDialog("Successfully Accepted Parent.");
        d.setVisible(true);
        
        enterprise.getWorkQueue().getBirthMotherToParent().add(request);
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);

        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout cardlayout = (CardLayout) userProcessContainer.getLayout();
        cardlayout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void notGuiltyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notGuiltyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notGuiltyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnBack;
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
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel profilePhotoComponent;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMessage;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

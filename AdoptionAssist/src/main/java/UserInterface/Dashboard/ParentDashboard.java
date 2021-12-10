/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Dashboard;

import Business.People.BirthMother;
import Business.People.Parents;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import userinterface.Dialog.ParentHelp;

/**
 *
 * @author patil
 */
public class ParentDashboard extends javax.swing.JPanel {

    /**
     * Creates new form BirthMotherDashboard
     */
    //private JPanel userProcessContainer;
    private Parents parent;
    private BirthMother mother;
    private float percentage;
    private int value;
    private int parentValue;
    private int remaining;
    
    public ParentDashboard(Parents parentPassed) {
        initComponents();
        
        thirdPanelDashboard third = new thirdPanelDashboard();
        this.parent = parentPassed;
        this.mother = parent.getBirthMother();
        thirdPanel.add(third);
        if(mother != null){
             populateParentDetails();
        }
        draw();
    }
    
    private void populateParentDetails(){
        lblName.setText(mother.getFirstName() +" "+ mother.getLastName());
        lblAddress.setText(mother.getAddress());
        lblEmail.setText(mother.getEmailId());
        lblContact.setText(mother.getContactMother());
        lblSupportAmount.setText(String.valueOf(parent.getFunds()));
        if (lblSupportAmount == null){
            lblSupportAmount.setText("0");
        }
        lblRemainingAmount.setText(String.valueOf(parent.getRemainingFunds()));
        parentImg.setIcon(new ImageIcon(mother.getImgPath()));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userProcessContainer = new javax.swing.JPanel();
        pieChart = new javax.swing.JPanel();
        progressBar = new javax.swing.JProgressBar();
        txtEnterFunds = new javax.swing.JTextField();
        btnTransfer = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblSupportAmount = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblRemainingAmount = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        parentImg = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        thirdPanel = new javax.swing.JPanel();
        btnPrint = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        setBackground(new java.awt.Color(64, 151, 182));
        setPreferredSize(new java.awt.Dimension(960, 400));
        setSize(new java.awt.Dimension(900, 675));

        userProcessContainer.setBackground(new java.awt.Color(64, 151, 182));

        pieChart.setBackground(new java.awt.Color(255, 255, 255));
        pieChart.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        progressBar.setStringPainted(true);

        txtEnterFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnterFundsActionPerformed(evt);
            }
        });

        btnTransfer.setBackground(new java.awt.Color(255, 153, 51));
        btnTransfer.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnTransfer.setText("TRANSFER");
        btnTransfer.setFocusPainted(false);
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setText("Contribution:");

        lblSupportAmount.setText("jLabel7");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setText("Amount to Transfer:");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setText("Remaining:");

        lblRemainingAmount.setText("jLabel7");

        javax.swing.GroupLayout pieChartLayout = new javax.swing.GroupLayout(pieChart);
        pieChart.setLayout(pieChartLayout);
        pieChartLayout.setHorizontalGroup(
            pieChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pieChartLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pieChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pieChartLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSupportAmount))
                    .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pieChartLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEnterFunds, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pieChartLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pieChartLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblRemainingAmount)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        pieChartLayout.setVerticalGroup(
            pieChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pieChartLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pieChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblSupportAmount))
                .addGap(18, 18, 18)
                .addGroup(pieChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblRemainingAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(pieChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEnterFunds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(406, 269));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MOTHER PROFILE :");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 151, 182));
        jLabel2.setText("NAME:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(64, 151, 182));
        jLabel3.setText("ADDRESS:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(64, 151, 182));
        jLabel4.setText("CONTACT:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(64, 151, 182));
        jLabel5.setText("EMAIL:");

        parentImg.setBackground(new java.awt.Color(102, 255, 102));
        parentImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        parentImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/maternity2.png"))); // NOI18N

        lblName.setText("jLabel8");

        lblAddress.setText("jLabel9");

        lblContact.setText("jLabel10");

        lblEmail.setText("jLabel11");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(lblName)
                            .addComponent(jLabel4)
                            .addComponent(lblAddress)
                            .addComponent(lblContact)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(jLabel5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(parentImg, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(parentImg, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4)
                        .addComponent(lblContact)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmail)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        thirdPanel.setBackground(new java.awt.Color(64, 151, 182));
        thirdPanel.setPreferredSize(new java.awt.Dimension(810, 318));
        thirdPanel.setLayout(new java.awt.BorderLayout());

        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/printing-tool-2.png"))); // NOI18N
        btnPrint.setContentAreaFilled(false);
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/help-web-button.png"))); // NOI18N
        btnHelp.setContentAreaFilled(false);
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userProcessContainerLayout = new javax.swing.GroupLayout(userProcessContainer);
        userProcessContainer.setLayout(userProcessContainerLayout);
        userProcessContainerLayout.setHorizontalGroup(
            userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userProcessContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userProcessContainerLayout.createSequentialGroup()
                        .addComponent(pieChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(thirdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnHelp)
                    .addComponent(btnPrint))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userProcessContainerLayout.setVerticalGroup(
            userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userProcessContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userProcessContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pieChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(userProcessContainerLayout.createSequentialGroup()
                        .addComponent(btnPrint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHelp))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thirdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userProcessContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userProcessContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
        PrinterJob job = PrinterJob.getPrinterJob();
                job.setJobName("Print Data");

                job.setPrintable(new Printable(){
                public int print(Graphics pg,PageFormat pf, int pageNum){
                        pf.setOrientation(PageFormat.LANDSCAPE);
                     if(pageNum>0){
                        return Printable.NO_SUCH_PAGE;
                    }

                    Graphics2D g2 = (Graphics2D)pg;
                    g2.translate(pf.getImageableX(), pf.getImageableY());
                    g2.scale(0.24,0.24);

                    userProcessContainer.paint(g2);         
                    return Printable.PAGE_EXISTS;


                }
        });    
            boolean ok = job.printDialog();
            if(ok){
            try{

            job.print();
            }
            catch (PrinterException ex){}
            }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpActionPerformed
        // TODO add your handling code here:
        ParentHelp help = new ParentHelp();
        help.setVisible(true);
    }//GEN-LAST:event_btnHelpActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
        // TODO add your handling code here:
        int remainingValue = parent.getRemainingFunds();
        if(remainingValue > 0){
        value = Integer.parseInt(txtEnterFunds.getText());
        
        int total = mother.getBankBalance() + value;
        mother.setBankBalance(total);
        parentValue = parent.getFunds();
        
        
        remaining = remainingValue - value;
        parent.setRemainingFunds(remaining);
        lblRemainingAmount.setText(String.valueOf(remaining));
        this.percentage = ((float)(parentValue - remaining)/parentValue)*100;
        progressBar.setValue((int) percentage);
        }
        else {
            JOptionPane.showMessageDialog(this,"Remaining Amount is 0!");
            return;
        }
    }//GEN-LAST:event_btnTransferActionPerformed
        
    private void draw(){
        
        parentValue = parent.getFunds();
        lblSupportAmount.setText(String.valueOf(parentValue));
        int remainingValue = parent.getRemainingFunds();
        
        remaining = remainingValue - value;
        parent.setRemainingFunds(remaining);
        lblRemainingAmount.setText(String.valueOf(remaining));
        this.percentage = ((float)(parentValue - remaining)/parentValue)*100;
        progressBar.setValue((int) percentage);
        
        this.percentage = ((float)(parentValue - remaining)/parentValue)*100;
        progressBar.setValue((int) percentage);
    }
    private void txtEnterFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnterFundsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnterFundsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRemainingAmount;
    private javax.swing.JLabel lblSupportAmount;
    private javax.swing.JLabel parentImg;
    private javax.swing.JPanel pieChart;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JPanel thirdPanel;
    private javax.swing.JTextField txtEnterFunds;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}

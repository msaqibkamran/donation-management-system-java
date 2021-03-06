/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIs;

import Donation.Donation;
import Funding.Donor;
import Main.DonationManagementSystem;
import java.util.Date;
import javax.swing.DefaultListModel;

/**
 *
 * @author saqib
 */
public class AddDonor extends javax.swing.JFrame {

    /**
     * Creates new form AddDonor
     */
    public AddDonor() {
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

        jLabel5 = new javax.swing.JLabel();
        prjName3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        projects = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        donorId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        donorName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        donorCnic = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        donorAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        donotionId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        donationAmount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        projectNmae = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        back = new javax.swing.JButton();

        jLabel5.setText("CNIC:");

        prjName3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prjName3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Projects:");

        projects.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        projects.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                projectsMouseMoved(evt);
            }
        });
        jScrollPane1.setViewportView(projects);

        jLabel1.setText("Donor ID:");

        donorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donorIdActionPerformed(evt);
            }
        });

        jLabel3.setText("Name:");

        donorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donorNameActionPerformed(evt);
            }
        });

        jLabel4.setText("CNIC:");

        donorCnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donorCnicActionPerformed(evt);
            }
        });

        jLabel6.setText("Address:");

        donorAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donorAddressActionPerformed(evt);
            }
        });

        jLabel7.setText("Donation ID:");

        donotionId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donotionIdActionPerformed(evt);
            }
        });

        jLabel8.setText("Amount:");

        donationAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donationAmountActionPerformed(evt);
            }
        });

        jLabel9.setText("Project Name:");

        projectNmae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectNmaeActionPerformed(evt);
            }
        });

        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(projectNmae, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(donationAmount, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(donotionId, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(donorAddress, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(donorCnic, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(donorName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(donorId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(190, 190, 190))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(projectNmae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(donorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(donorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(donorCnic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(donorAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(donotionId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(donationAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(add))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void projectsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectsMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_projectsMouseMoved

    private void donorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donorIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_donorIdActionPerformed

    private void donorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_donorNameActionPerformed

    private void donorCnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donorCnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_donorCnicActionPerformed

    private void prjName3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prjName3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prjName3ActionPerformed

    private void donorAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donorAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_donorAddressActionPerformed

    private void donotionIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donotionIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_donotionIdActionPerformed

    private void donationAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donationAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_donationAmountActionPerformed

    private void projectNmaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectNmaeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_projectNmaeActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String projectName = this.projectNmae.getText();
        int donorId = Integer.parseInt(this.donorId.getText());
        String name = this.donorName.getText();
        String cnic = this.donorCnic.getText();
        String address = this.donorAddress.getText();
        
        Donor donor = dms.searchDonor(name);
        if(donor == null){
            donor = new Donor(donorId, name, cnic, address);
        }
        
        int donationId = Integer.parseInt(this.donotionId.getText());
        int amount = Integer.parseInt(this.donationAmount.getText());
        Donation donation = new Donation(donationId, amount, new Date());
        
        dms.addDonor(projectName, donor, donation);
        
    }//GEN-LAST:event_addActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        WelcomeScreen welcomeScreen = new WelcomeScreen();
        welcomeScreen.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
    
    DefaultListModel dlm = new DefaultListModel();
    DefaultListModel dlm1 = new DefaultListModel();
    DonationManagementSystem dms = new DonationManagementSystem();
    
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
            java.util.logging.Logger.getLogger(AddDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDonor().setVisible(true);
            }
        });
    }
    
    public void setProjects() {
        projects.setModel(dlm);
        dlm.clear();
        for(int i=0; i< dms.getProjects().size(); ++i) {
            dlm.addElement(dms.getProjects().get(i).getName());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JTextField donationAmount;
    private javax.swing.JTextField donorAddress;
    private javax.swing.JTextField donorCnic;
    private javax.swing.JTextField donorId;
    private javax.swing.JTextField donorName;
    private javax.swing.JTextField donotionId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField prjName3;
    private javax.swing.JTextField projectNmae;
    private javax.swing.JList projects;
    // End of variables declaration//GEN-END:variables
}

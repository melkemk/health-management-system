/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.util;
import com.mycompany.project.Doctor;
import java.sql.ResultSet;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class doctor extends javax.swing.JFrame {
public static int patientid;
 
    public doctor() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sendPatientResult = new javax.swing.JButton();
        chooseVisitNecessity = new javax.swing.JButton();
        viewLabResult = new javax.swing.JButton();
        sendPrescription = new javax.swing.JButton();
        viewPatientCase = new javax.swing.JButton();
        changepassword = new javax.swing.JButton();
        DoctorResponse = new javax.swing.JButton();
        chat = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sendPatientResult.setText("sendPatientResult");
        sendPatientResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendPatientResultActionPerformed(evt);
            }
        });

        chooseVisitNecessity.setText("chooseVisitNecessity");
        chooseVisitNecessity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseVisitNecessityActionPerformed(evt);
            }
        });

        viewLabResult.setText("viewLabResult");
        viewLabResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLabResultActionPerformed(evt);
            }
        });

        sendPrescription.setText("sendPrescription");
        sendPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendPrescriptionActionPerformed(evt);
            }
        });

        viewPatientCase.setText("viewPatientCase");
        viewPatientCase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientCaseActionPerformed(evt);
            }
        });

        changepassword.setText("change password");
        changepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepasswordActionPerformed(evt);
            }
        });

        DoctorResponse.setText("to laboratory");
        DoctorResponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorResponseActionPerformed(evt);
            }
        });

        chat.setText("chat with patient");
        chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Java Projects\\project\\src\\images\\icons8-doctor-48.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 153, 255));
        jLabel4.setText("Doctor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(DoctorResponse, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(chooseVisitNecessity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sendPatientResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(viewPatientCase, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(changepassword, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sendPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(viewLabResult, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(chat, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addComponent(DoctorResponse)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewPatientCase)
                    .addComponent(viewLabResult))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseVisitNecessity)
                    .addComponent(sendPrescription))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendPatientResult)
                    .addComponent(changepassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendPatientResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendPatientResultActionPerformed

        
        
   

    // Retrieve the patient ID and result from the GUI form
    int patientId = Integer.parseInt(JOptionPane.showInputDialog(this, "enter the patient id "));

    String result=JOptionPane.showInputDialog(this,"enter the result");
   
    boolean resultSent = Doctor.sendPatientResult(patientId, result);
    if (resultSent) {
        JOptionPane.showMessageDialog(this, "Patient result sent successfully.");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to send patient result. Please try again.");
    }
 
    }

    private void chooseVisitNecessityActionPerformed(java.awt.event.ActionEvent evt) {

     
        
    int patientId = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter the patient ID:"));
    boolean necessary = JOptionPane.showConfirmDialog(this, "Is the visit necessary?", "Visit Necessity", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
    Doctor.chooseVisitNecessity(patientId, necessary);

    JOptionPane.showMessageDialog(this, "Visit necessity updated successfully.");

    }

    private void viewLabResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLabResultActionPerformed
    int patientId = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter the patient ID:"));

    ResultSet labResult = Doctor.viewLabResult(patientId);

    if (labResult != null) {
        try {
            if (labResult.next()) {
                String result = labResult.getString("labResult");
                JOptionPane.showMessageDialog(this, "Lab Result:\n" + result);
            } else {
                JOptionPane.showMessageDialog(this, "No lab result found for the patient.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                labResult.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Failed to retrieve lab result. Please try again.");
    }

        
// TODO add your handling code here:
    }//GEN-LAST:event_viewLabResultActionPerformed

    private void sendPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendPrescriptionActionPerformed

    int patientId = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter the patient ID:"));
    String prescription = JOptionPane.showInputDialog(this, "Enter the prescription:");
    // Call the Doctor's sendPrescription method
    Doctor.sendPrescription(patientId, prescription);

    JOptionPane.showMessageDialog(this, "Prescription sent successfully.");

        // TODO add your handling code here:
    }//GEN-LAST:event_sendPrescriptionActionPerformed

    private void viewPatientCaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientCaseActionPerformed

        
        
        
        
         ResultSet resultSet = Doctor.viewPatientCase();
StringBuilder string=new StringBuilder();
    if (resultSet != null) {
        try {
            // Iterate through the ResultSet to access patient case details
            while (resultSet.next()) {
                // Retrieve the patient case details from the current row
                int id = resultSet.getInt("id");
                int age = resultSet.getInt("age");
                String illness = resultSet.getString("illness");
                String habit = resultSet.getString("habit");
string.append(" id: ").append(id)
                        .append(", age: ").append(age)
                        .append(", illness: ").append(illness)
                        .append(", habit: ").append(habit)
                        .append("\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle any SQLExceptions that may occur during ResultSet processing
        } finally {
            // Close the ResultSet and free any resources
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
                // Handle any SQLExceptions that may occur during ResultSet closing
            }
        }
        JOptionPane.showMessageDialog(this,string);
    } else {
        // Handle the case when the ResultSet is null (e.g., an error occurred)
        JOptionPane.showMessageDialog(this, "Failed .");

    }


       
        
        // TODO add your handling code here:
    }//GEN-LAST:event_viewPatientCaseActionPerformed

    private void changepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepasswordActionPerformed

            String password= JOptionPane.showInputDialog(this,"please enter another password");
            if(password!=null){
        try {
            if(Doctor.changePassword(password))JOptionPane.showMessageDialog(this, "success");
            else JOptionPane.showMessageDialog(this, "failed to save");
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        } 
            }
    }//GEN-LAST:event_changepasswordActionPerformed

    private void DoctorResponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorResponseActionPerformed
             int patientId = Integer.parseInt(JOptionPane.showInputDialog(this, "enter the patient id "));
    String insight=JOptionPane.showInputDialog(this,"enter the result");
   
    boolean resultSent = Doctor.sendDoctorResponseToLab(patientId, insight);
    if (resultSent) {
        JOptionPane.showMessageDialog(this, "lab will see the case shortly .");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to send order to laboratory .");
    }

        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorResponseActionPerformed

    private void chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatActionPerformed
            patientid= Integer.parseInt(JOptionPane.showInputDialog(this,"please enter the patient id"));        
message m=new message("doctor");
m.setVisible(true);
    }//GEN-LAST:event_chatActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
                dispose();
        Main newFrame = new Main();
        newFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doctor();
            }
        });
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DoctorResponse;
    private javax.swing.JButton back;
    private javax.swing.JButton changepassword;
    private javax.swing.JButton chat;
    private javax.swing.JButton chooseVisitNecessity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton sendPatientResult;
    private javax.swing.JButton sendPrescription;
    private javax.swing.JButton viewLabResult;
    private javax.swing.JButton viewPatientCase;
    // End of variables declaration//GEN-END:variables
}
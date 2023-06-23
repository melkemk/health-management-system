/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.util;

import com.mycompany.project.Patient;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.*;

/**
 *
 * @author melke
 */
public class patient extends javax.swing.JFrame {
 int totalTrial;
 static  Date lockedTime=null; 

    public patient() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insertPatientData = new javax.swing.JButton();
        viewPrescription = new javax.swing.JButton();
        viewPatientInformation = new javax.swing.JButton();
        login = new javax.swing.JButton();
        chat = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        insertPatientData.setText("to enter your case");
        insertPatientData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertPatientDataActionPerformed(evt);
            }
        });

        viewPrescription.setText("view prescription");
        viewPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPrescriptionActionPerformed(evt);
            }
        });

        viewPatientInformation.setText("Patient Information");
        viewPatientInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientInformationActionPerformed(evt);
            }
        });

        login.setText("login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        chat.setText("chat with doctor");
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

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Java Projects\\project\\src\\images\\icons8-patient-48.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 153, 255));
        jLabel4.setText("Patient");

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
                        .addGap(168, 168, 168)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(viewPatientInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addComponent(viewPrescription, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                .addComponent(insertPatientData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(chat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(insertPatientData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewPrescription)
                .addGap(18, 18, 18)
                .addComponent(viewPatientInformation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(login)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPrescriptionActionPerformed

        
          if(Patient.loggedIn){
        ResultSet resultSet= Patient.viewPrescription();
        
    if (resultSet != null) {
        try {
            // Retrieve and display the lab result from the ResultSet
            if (resultSet.next()) {
                String prescription = resultSet.getString("prescription");
                JOptionPane.showMessageDialog(this, "prescription :\n" + prescription);
            } else {
                JOptionPane.showMessageDialog(this, "No prescription found for the patient.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "error");

}}else{        
              loginActionPerformed(evt); }
    }//GEN-LAST:event_viewPrescriptionActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

   if(this.totalTrial<5){
        this.totalTrial++;
            String name=JOptionPane.showInputDialog(this, "enter your name." );
            String password=JOptionPane.showInputDialog(this, "enter your password." );
             if(Patient.login( name.trim() ,password.trim())) {
            Patient.loggedIn=true;
             }
             else{
                 JOptionPane.showMessageDialog(this, "please enter the correct password or name.");
             }
       }else if(this.totalTrial==5){ 
             this.lockedTime=new Date();
             JOptionPane.showMessageDialog(this, "please enter the correct password.");
             this.totalTrial++;
             }
             else{
                 Date time=new Date();//it is in milisecond 
                 long diff=(time.getTime()-this.lockedTime.getTime())/1000;
                    if(diff>120) this.totalTrial=0;
                    diff=180-diff;
                    JOptionPane.showMessageDialog(this, "wait for "+ diff +" seconds.");
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void insertPatientDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertPatientDataActionPerformed

addPatient newFrame=new addPatient();
newFrame.setVisible(true);
newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // TODO add your handling code here:
    }//GEN-LAST:event_insertPatientDataActionPerformed

    private void viewPatientInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientInformationActionPerformed

        
    // Retrieve patient information from the database
    ResultSet resultSet = Patient.viewPatientInformation();

    // Check if the resultSet is not null
    if (resultSet != null) {
        try {
            // Create a StringBuilder to store the patient information
            StringBuilder patientInfo = new StringBuilder();

            // Loop through the resultSet to extract patient information
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String phoneNumber = resultSet.getString("phoneNumber");
                String password = resultSet.getString("password");
                int age = resultSet.getInt("age");
                char gender = resultSet.getString("gender").charAt(0);
                String habit = resultSet.getString("habit");
                String illness = resultSet.getString("illness");
                double appointmentFee = resultSet.getDouble("appointmentFee");
                double labFee = resultSet.getDouble("labFee");
                String result = resultSet.getString("result");
                String prescription = resultSet.getString("prescription");

                // Append the patient information to the StringBuilder
                patientInfo.append("Patient ID: ").append(id).append("\n")
                        .append("Name: ").append(name).append("\n")
                        .append("Phone Number: ").append(phoneNumber).append("\n")
                        .append("Password: ").append(password).append("\n")
                        .append("Age: ").append(age).append("\n")
                        .append("Gender: ").append(gender).append("\n")
                        .append("Habit: ").append(habit).append("\n")
                        .append("Illness: ").append(illness).append("\n")
                        .append("Appointment Fee: ").append(appointmentFee).append("\n")
                        .append("Lab Fee: ").append(labFee).append("\n")
                        .append("Result: ").append(result).append("\n")
                        .append("Prescription: ").append(prescription).append("\n\n");
            }

            if (patientInfo.length() > 0) {
                JOptionPane.showMessageDialog(this, patientInfo.toString(), "Patient Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No patient information found.", "Patient Information", JOptionPane.WARNING_MESSAGE);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(this, "Please log in as a patient.", "Patient Information", JOptionPane.WARNING_MESSAGE);
  
}


    }

    private void chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatActionPerformed
if(Patient.loggedIn){
        message m=new message("patient");
        m.setVisible(true);}

        else loginActionPerformed(evt);

    }

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
                dispose();
        Main newFrame = new Main();
        newFrame.setVisible(true);
        this.setVisible(false);
    }

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
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patient();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton chat;
    private javax.swing.JButton insertPatientData;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton login;
    private javax.swing.JButton viewPatientInformation;
    private javax.swing.JButton viewPrescription;
    // End of variables declaration//GEN-END:variables
}

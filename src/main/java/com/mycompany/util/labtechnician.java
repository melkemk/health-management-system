/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.util;

import javax.swing.*;

import com.mycompany.project.LabTechnician;
import java.sql.ResultSet;
import java.sql.SQLException;

public class labtechnician extends javax.swing.JFrame {

    public labtechnician() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewPatientResult1 = new javax.swing.JButton();
        sendLabResult = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewPatientResult1.setText("viewPatientResult");
        viewPatientResult1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientResult1ActionPerformed(evt);
            }
        });

        sendLabResult.setText("sendLabResult");
        sendLabResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendLabResultActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Java Projects\\project\\src\\images\\icons8-lab-technician-64.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 153, 255));
        jLabel4.setText("Lab Technician");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(167, 167, 167))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(viewPatientResult1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sendLabResult, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addComponent(viewPatientResult1)
                .addGap(18, 18, 18)
                .addComponent(sendLabResult)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendLabResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendLabResultActionPerformed

        
        
try {int patientId = Integer.parseInt(JOptionPane.showInputDialog(this, "enter the patient id "));

    String result=JOptionPane.showInputDialog(this,"enter the result");
   
    boolean resultSent = LabTechnician.sendLabResult(patientId, result);
    if (resultSent) {
        JOptionPane.showMessageDialog(this, "Patient result sent successfully.");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to send lab result. Please try again.");
    }}catch(NumberFormatException e){
        e.getMessage();
    }//GEN-LAST:event_sendLabResultActionPerformed
    }
    private void viewPatientResult1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientResult1ActionPerformed

        

    ResultSet resultSet = LabTechnician.viewDoctorsResponse();
    StringBuilder string=new StringBuilder();
    if (resultSet != null) {
        try {
            // Iterate through the ResultSet to access patient case details
            while (resultSet.next()) {
                // Retrieve the patient case details from the current row
                int id = resultSet.getInt("patientid");
                String DoctorResponse = resultSet.getString("DoctorResponse");
string.append(" id: ").append(id)
                        .append(", doctor insight : ").append(DoctorResponse)
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
    }//GEN-LAST:event_viewPatientResult1ActionPerformed

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
            java.util.logging.Logger.getLogger(labtechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(labtechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(labtechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(labtechnician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new labtechnician();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton sendLabResult;
    private javax.swing.JButton viewPatientResult1;
    // End of variables declaration//GEN-END:variables
}
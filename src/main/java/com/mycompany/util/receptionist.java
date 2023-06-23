/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.util;
import com.mycompany.project.Receptionist;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

//see patients
/**
 *
 * @author melke
 */
public class receptionist extends javax.swing.JFrame {

    /**
     * Creates new form receptionist
     */
    public receptionist() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        AssignDoctorAndView = new javax.swing.JButton();
        seeDoctorInformation = new javax.swing.JButton();
        viewPatientResult = new javax.swing.JButton();
        requestLabFee = new javax.swing.JButton();
        requestAppointmentFee = new javax.swing.JButton();
        viewPatientInformation = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AssignDoctorAndView.setText("AssignDoctorAndView");
        AssignDoctorAndView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AssignDoctorAndViewActionPerformed(evt);
            }
        });

        seeDoctorInformation.setText("seeDoctorInformation");
        seeDoctorInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeDoctorInformationActionPerformed(evt);
            }
        });

        viewPatientResult.setText("viewPatientResult");
        viewPatientResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientResultActionPerformed(evt);
            }
        });

        requestLabFee.setText("requestLabFee");
        requestLabFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestLabFeeActionPerformed(evt);
            }
        });

        requestAppointmentFee.setText("requestAppointmentFee");
        requestAppointmentFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestAppointmentFeeActionPerformed(evt);
            }
        });

        viewPatientInformation.setText("viewPatientInformation");
        viewPatientInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatientInformationActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Java Projects\\project\\src\\images\\icons8-receptionist-60.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 153, 255));
        jLabel4.setText("Receptionist");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 107, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(requestAppointmentFee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(requestLabFee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewPatientResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seeDoctorInformation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AssignDoctorAndView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewPatientInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(103, 103, 103))))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(AssignDoctorAndView)
                .addGap(18, 18, 18)
                .addComponent(seeDoctorInformation)
                .addGap(18, 18, 18)
                .addComponent(viewPatientResult)
                .addGap(18, 18, 18)
                .addComponent(requestLabFee)
                .addGap(18, 18, 18)
                .addComponent(requestAppointmentFee)
                .addGap(18, 18, 18)
                .addComponent(viewPatientInformation)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AssignDoctorAndViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AssignDoctorAndViewActionPerformed


    int patientId = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter patient ID:"));
        int docId = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter doctor ID:"));

        // Call the AssignDoctorAndView method from the Receptionist class
        boolean success = Receptionist.AssignDoctorAndView(patientId, docId);

        if (success) {
            JOptionPane.showMessageDialog(this, "Doctor assigned successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to assign doctor.");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_AssignDoctorAndViewActionPerformed

    private void seeDoctorInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeDoctorInformationActionPerformed

        
  
 ResultSet resultSet =  Receptionist.seeDoctorInformation();

 if(resultSet!=null){
        try {
            StringBuilder doctors = new StringBuilder();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String doctorSpecialty = resultSet.getString("specialization");
                doctors.append("id : ").append(id)
                        .append(", doctor speciality  ").append(doctorSpecialty)
                        .append("\n");
            }
            JOptionPane.showMessageDialog(this, "all doctors:\n\n" + doctors.toString());
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "error can't get the doctors");

        }}
 else{
                     JOptionPane.showMessageDialog(this, " can't get the doctors");
 }
    }//GEN-LAST:event_seeDoctorInformationActionPerformed

    private void viewPatientResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientResultActionPerformed
 

         int patientId = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter patient ID:"));

        // Call the viewPatientResult method from the Receptionist class
        ResultSet resultSet = Receptionist.viewPatientResult(patientId);

        // Display the patient result in a dialog box or any other desired way
        // Example: iterate over the ResultSet and display each patient's result
        try {
            while (resultSet.next()) {
                String patientResult = resultSet.getString("result");
                JOptionPane.showMessageDialog(this, patientResult);
            }
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "error can't get the user");
        }
        

        // TODO add your handling code here:
    }//GEN-LAST:event_viewPatientResultActionPerformed

    private void requestLabFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestLabFeeActionPerformed

        
        


 int patientId = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter patient ID:"));
        double labFee = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter lab fee:"));

        // Call the requestLabFee method from the Receptionist class
        boolean success = Receptionist.requestLabFee(patientId, labFee);

        if (success) {
            JOptionPane.showMessageDialog(this, "Lab fee requested successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to request lab fee.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_requestLabFeeActionPerformed

    private void requestAppointmentFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestAppointmentFeeActionPerformed

  int patientId = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter patient ID:"));
        double appointmentFee = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter appointment fee:"));
        boolean success = Receptionist.requestAppointmentFee(patientId, appointmentFee);
        if (success) {
            JOptionPane.showMessageDialog(this, "Appointment fee requested successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "Failed to request appointment fee.");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_requestAppointmentFeeActionPerformed

    private void viewPatientInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatientInformationActionPerformed

        viewPatientInformation newFrame = new viewPatientInformation();
        newFrame.loadPatientInformation();
        newFrame.setVisible(true);

        
    }//GEN-LAST:event_viewPatientInformationActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
                dispose();
        Main newFrame = new Main();
        newFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    
    
    
    
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
            java.util.logging.Logger.getLogger(receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receptionist();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AssignDoctorAndView;
    private javax.swing.JButton back;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton requestAppointmentFee;
    private javax.swing.JButton requestLabFee;
    private javax.swing.JButton seeDoctorInformation;
    private javax.swing.JButton viewPatientInformation;
    private javax.swing.JButton viewPatientResult;
    // End of variables declaration//GEN-END:variables
}

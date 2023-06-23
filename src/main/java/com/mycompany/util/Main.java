
package com.mycompany.util;

import com.mycompany.project.Admin;
import com.mycompany.project.Doctor;
import com.mycompany.project.*;

import javax.swing.*;
import java.util.Date;

public class Main extends javax.swing.JFrame {
    int totalTrial;
    Date lockedTime = null;

    public Main() {

        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        admin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        doctor = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        labtechnician = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        patient = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        receptionist = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 51));
        setForeground(new java.awt.Color(255, 102, 102));

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to E_HealthCare Management System");

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Java Projects\\project\\src\\images\\maindoc.png")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Java Projects\\project\\src\\images\\icons8-admin-48.png")); // NOI18N

        admin.setText("Administrator");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Java Projects\\project\\src\\images\\icons8-doctor-48.png")); // NOI18N

        doctor.setText("Doctor");
        doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Java Projects\\project\\src\\images\\icons8-lab-48.png")); // NOI18N

        labtechnician.setText("Lab Technician");
        labtechnician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labtechnicianActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Java Projects\\project\\src\\images\\icons8-patient-48.png")); // NOI18N

        patient.setText("Patient");
        patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Java Projects\\project\\src\\images\\icons8-phone-48.png")); // NOI18N

        receptionist.setText("Receptionist");
        receptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receptionistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(90, 90, 90)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(patient, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labtechnician, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(receptionist, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(labtechnician, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addComponent(patient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(receptionist, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel8)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(305, 305, 305))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents




    private void adminActionPerformed(java.awt.event.ActionEvent evt) {
       if(totalTrial<5){
        totalTrial++;
            String password=JOptionPane.showInputDialog(this, "enter adminstrative password." );
             if(Admin.login( password.trim())) {
                 dispose();
                AdminPage newFrame = new AdminPage();
                newFrame.setVisible(true);
                this.setVisible(false);
             }
             else{
                 JOptionPane.showMessageDialog(this, "please enter the correct password.");
             }
       }else if(totalTrial==5){ 
             lockedTime=new Date();
             JOptionPane.showMessageDialog(this, "please enter the correct password.");
             totalTrial++;
             }
             else{
                 Date time=new Date();//it is in milisecond 
                 long diff=(time.getTime()-lockedTime.getTime())/1000;
                    if(diff>120) totalTrial=0;
                    diff=120-diff;
                    JOptionPane.showMessageDialog(this, "wait for "+ diff +" seconds.");
       }

    }

    private void doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorActionPerformed

        
        if(totalTrial<5){
        totalTrial++;
            
            String name=JOptionPane.showInputDialog(this, "enter your name." );
            String password=JOptionPane.showInputDialog(this, "enter your password." );
             if(Doctor.login(name.trim(), password.trim())) {
                 dispose();
                 doctor newFrame = new doctor();
                 newFrame.setVisible(true);
                 this.setVisible(false);
             }
             else{
                 JOptionPane.showMessageDialog(this, "wrong password or name.");
             }
       }else if(totalTrial==5){ 
             lockedTime=new Date();
             JOptionPane.showMessageDialog(this, "wrong password or name ..");
             totalTrial++;
             }
             else{
                 Date time=new Date();//it is in milisecond 
                 long diff=(time.getTime()-lockedTime.getTime())/1000;
                    if(diff>120) totalTrial=0;
                    diff=120-diff;
                    JOptionPane.showMessageDialog(this, "wait for "+ diff +" seconds.");
       }

    }

    private void labtechnicianActionPerformed(java.awt.event.ActionEvent evt) {

        if(totalTrial<5){
            totalTrial++;  
            String name=JOptionPane.showInputDialog(this, "enter your name." );
            String password=JOptionPane.showInputDialog(this, "enter your password." );
             if(LabTechnician.login(name.trim(), password.trim())) {
                 dispose();
                  labtechnician newFrame = new labtechnician();
            newFrame.setVisible(true);
            this.setVisible(false);
             }
             else{
                 JOptionPane.showMessageDialog(this, "wrong password or name.");
             }
       }else if(totalTrial==5){ 
             lockedTime=new Date();
             JOptionPane.showMessageDialog(this, "wrong password or name .");
             totalTrial++;
             }
             else{
                 Date time=new Date();//it is in milisecond 
                 long diff=(time.getTime()-lockedTime.getTime())/1000;
                    if(diff>120) totalTrial=0;
                    diff=120-diff;
                    JOptionPane.showMessageDialog(this, "wait for "+ diff +" seconds.");
       }
    }

    private void receptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receptionistActionPerformed
            
     
 if(totalTrial<5){
        totalTrial++;
            
            String name=JOptionPane.showInputDialog(this, "enter your name." );
            String password=JOptionPane.showInputDialog(this, "enter your password." );
             if(Receptionist .login(name.trim(), password.trim())) {
                 dispose();
                 receptionist newFrame = new receptionist();
                 newFrame.setVisible(true);
                   this.setVisible(false);
             }
             else{
                 JOptionPane.showMessageDialog(this, "wrong password or name.");
             }
       }else if(totalTrial==5){ 
             lockedTime=new Date();
             JOptionPane.showMessageDialog(this, "wrong password or name .");
             totalTrial++;
             }
             else {
     Date time = new Date();//it is in milisecond
     long diff = (time.getTime() - lockedTime.getTime()) / 1000;
     if (diff > 120) totalTrial = 0;
     diff = 120 - diff;
     JOptionPane.showMessageDialog(this, "wait for " + diff + " seconds.");
        }
    }

    private void patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientActionPerformed

              dispose();
        patient newframe=new patient();
        newframe.setVisible(true);
    }

   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Main();
            }
        });
    }

    private javax.swing.JButton admin;
    private javax.swing.JButton doctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton labtechnician;
    private javax.swing.JButton patient;
    private javax.swing.JButton receptionist;

}





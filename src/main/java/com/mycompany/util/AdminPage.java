/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.util;

import com.mycompany.project.Admin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class AdminPage extends javax.swing.JFrame {


    public AdminPage() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        addDoctor = new javax.swing.JButton();
        changepassword = new javax.swing.JButton();
        addLabTech = new javax.swing.JButton();
        addReceptionist = new javax.swing.JButton();
        delDoctor = new javax.swing.JButton();
        delReceptionist = new javax.swing.JButton();
        delLabTech = new javax.swing.JButton();
        getLabTechnicians = new javax.swing.JButton();
        getDoctors = new javax.swing.JButton();
        getReceptionists = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 101, 255));

        addDoctor.setText("addDoctor");
        addDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDoctorActionPerformed(evt);
            }
        });

        changepassword.setText("change password");
        changepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepasswordActionPerformed(evt);
            }
        });

        addLabTech.setText("addLabTech");
        addLabTech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLabTechActionPerformed(evt);
            }
        });

        addReceptionist.setText("addReceptionist");
        addReceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addReceptionistActionPerformed(evt);
            }
        });

        delDoctor.setText("delDoctor");
        delDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delDoctorActionPerformed(evt);
            }
        });

        delReceptionist.setText("delReceptionist");
        delReceptionist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delReceptionistActionPerformed(evt);
            }
        });

        delLabTech.setText("delLabTech");
        delLabTech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delLabTechActionPerformed(evt);
            }
        });

        getLabTechnicians.setText("getLabTechnicians");
        getLabTechnicians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getLabTechniciansActionPerformed(evt);
            }
        });

        getDoctors.setText("getDoctors");
        getDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDoctorsActionPerformed(evt);
            }
        });

        getReceptionists.setText("getReceptionists");
        getReceptionists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getReceptionistsActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Java Projects\\project\\src\\images\\icons8-admin-48.png")); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 153, 255));
        jLabel3.setText("Administrator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addReceptionist, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addLabTech, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(delDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(delReceptionist, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(delLabTech, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(getDoctors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(getLabTechnicians, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(getReceptionists, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(changepassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(back)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back)
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDoctor)
                    .addComponent(delDoctor)
                    .addComponent(getDoctors))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delReceptionist)
                    .addComponent(addReceptionist)
                    .addComponent(getReceptionists))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getLabTechnicians)
                    .addComponent(delLabTech)
                    .addComponent(addLabTech))
                .addGap(34, 34, 34)
                .addComponent(changepassword)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }


    private void addReceptionistActionPerformed(java.awt.event.ActionEvent evt) {

    String name = JOptionPane.showInputDialog(this, "Enter receptionist name:");
    String phoneNumber = JOptionPane.showInputDialog(this, "Enter receptionist phone number:");
    String password = JOptionPane.showInputDialog(this, "Enter receptionist password:");
if (password != null && phoneNumber != null && name!=null) {

    boolean success = Admin.addReceptionist(name, phoneNumber, password);

    if (success) {
        JOptionPane.showMessageDialog(this, "Receptionist added successfully!");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to add receptionist.", "Error", JOptionPane.ERROR_MESSAGE);
    }}
    }//GEN-LAST:event_addReceptionistActionPerformed

    private void addDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDoctorActionPerformed

        
        AddDoctor newFrame=new AddDoctor();
        newFrame.setVisible(true);
    }

    private void delDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delDoctorActionPerformed
    int doctorId = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter doctor ID:"));
if (doctorId!=-1) {

    boolean success = Admin.delDoctor(doctorId);

    if (success) {
        JOptionPane.showMessageDialog(this, "Doctor deleted successfully!");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to delete doctor.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    }
    }
    private void getDoctorsActionPerformed(java.awt.event.ActionEvent evt) {

        
    ResultSet resultSet = Admin.getDoctors();

    if (resultSet != null) {
        try {
            StringBuilder doctorsList = new StringBuilder();
            while (resultSet.next()) {
                int doctorId = resultSet.getInt("id");
                String doctorName = resultSet.getString("name");
                String doctorPhoneNumber = resultSet.getString("phoneNumber");

                doctorsList.append("Doctor ID: ").append(doctorId)
                        .append(", Name: ").append(doctorName)
                        .append(", Phone Number: ").append(doctorPhoneNumber)
                        .append("\n");
            }

            JOptionPane.showMessageDialog(this, "List of Doctors:\n\n" + doctorsList.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(this, "Failed to retrieve doctors.");
    }

    }

    private void addLabTechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLabTechActionPerformed

    String name = JOptionPane.showInputDialog(this, "Enter lab technician name:");
    String phoneNumber = JOptionPane.showInputDialog(this, "Enter lab technician phone number:");
    String password = JOptionPane.showInputDialog(this, "Enter lab technician password:");
if (password != null && phoneNumber != null && name!=null) {

    boolean success = Admin.addLabTech(name, phoneNumber, password);

    if (success) {
        JOptionPane.showMessageDialog(this, "Lab technician added successfully!");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to add lab technician.", "Error", JOptionPane.ERROR_MESSAGE);
    }}
    }

    private void delReceptionistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delReceptionistActionPerformed

    int receptionistId = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter receptionist ID:"));
if(receptionistId!=-1){
    boolean success = Admin.delReceptionist(receptionistId);

    if (success) {
        JOptionPane.showMessageDialog(this, "Receptionist deleted successfully!");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to delete receptionist.", "Error", JOptionPane.ERROR_MESSAGE);
    }

}

    }

    private void delLabTechActionPerformed(java.awt.event.ActionEvent evt) {


    int labTechId = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter lab technician ID:"));
if(labTechId!=-1){
    boolean success = Admin.delLabTech(labTechId);

    if (success) {
        JOptionPane.showMessageDialog(this, "Lab technician deleted successfully!");
    } else {
        JOptionPane.showMessageDialog(this, "Failed to delete lab technician.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    }

    private void getLabTechniciansActionPerformed(java.awt.event.ActionEvent evt) {



    ResultSet resultSet = Admin.getLabTechnicians();

    if (resultSet != null) {
        try {
            StringBuilder labTechniciansList = new StringBuilder();
            while (resultSet.next()) {
                int labTechnicianId = resultSet.getInt("id");
                String labTechnicianName = resultSet.getString("name");
                String labTechnicianPhoneNumber = resultSet.getString("phoneNumber");

                labTechniciansList.append("Lab Technician ID: ").append(labTechnicianId)
                        .append(", Name: ").append(labTechnicianName)
                        .append(", Phone Number: ").append(labTechnicianPhoneNumber)
                        .append("\n");
            }

            JOptionPane.showMessageDialog(this, "List of Lab Technicians:\n\n" + labTechniciansList.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(this, "Failed to retrieve lab technicians.");
    }

    }

    private void getReceptionistsActionPerformed(java.awt.event.ActionEvent evt) {


    ResultSet resultSet = Admin.getReceptionists();

    if (resultSet != null) {
        try {
            StringBuilder receptionistsList = new StringBuilder();
            while (resultSet.next()) {
                int receptionistId = resultSet.getInt("id");
                String receptionistName = resultSet.getString("name");
                String receptionistPhoneNumber = resultSet.getString("phoneNumber");

                receptionistsList.append("Receptionist ID: ").append(receptionistId)
                        .append(", Name: ").append(receptionistName)
                        .append(", Phone Number: ").append(receptionistPhoneNumber)
                        .append("\n");
            }

            JOptionPane.showMessageDialog(this, "List of Receptionists:\n\n" + receptionistsList.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    } else {
        JOptionPane.showMessageDialog(this, "Failed to retrieve receptionists.");
    }

    }

    private void changepasswordActionPerformed(java.awt.event.ActionEvent evt) {

        
            String password= JOptionPane.showInputDialog(this,"please enter another password");
            if(password!=null){
        try {
            if(Admin.changePassword(password))JOptionPane.showMessageDialog(this, "success");
            else JOptionPane.showMessageDialog(this, "falied to save");
            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(AdminPage.class.getName()).log(Level.SEVERE, null, ex);
        } 
            }
    }

    private void backActionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                Main newFrame = new Main();
                newFrame.setVisible(true);
                this.setVisible(false);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage();
            }
        });
    }

    private javax.swing.JButton addDoctor;
    private javax.swing.JButton addLabTech;
    private javax.swing.JButton addReceptionist;
    private javax.swing.JButton back;
    private javax.swing.JButton changepassword;
    private javax.swing.JButton delDoctor;
    private javax.swing.JButton delLabTech;
    private javax.swing.JButton delReceptionist;
    private javax.swing.JButton getDoctors;
    private javax.swing.JButton getLabTechnicians;
    private javax.swing.JButton getReceptionists;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

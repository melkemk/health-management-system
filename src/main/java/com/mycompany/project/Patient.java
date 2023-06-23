/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Patient extends User {
    public static boolean loggedIn=false;
    public static int id;
    private char gender;
    public static String name;
    private int age;
    private String illness;
    private final float appointmentFee = 300;
    public Patient(String name, String phoneNumber, String password) {
        super(name, phoneNumber, password);
    }
    public static  ResultSet viewPrescription() {
     if(Patient.loggedIn){
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "SELECT prescription FROM patient WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }}
    return null;
    }
    
    public static boolean insertPatientData(String name, String phoneNumber, String password, int age, String gender, String habit, String illness) {
    try {
        Connection connection = dbConnection.getConnection();
        String sql = "INSERT INTO patient (name, phoneNumber, password, age, gender, habit, illness) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, name.trim());
        statement.setString(2, phoneNumber.trim());
        statement.setString(3, password.trim());
        statement.setInt(4, age);
        statement.setString(5, String.valueOf(gender));
        statement.setString(6, habit.trim());
        statement.setString(7, illness.trim());
       boolean succeeded = statement.executeUpdate()>0;
if(succeeded)return true;
        statement.close();
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}
        public static  ResultSet viewPatientInformation() {
            if(Patient.loggedIn){
    try {
        Connection connection = dbConnection.getConnection();
        String sql = "SELECT * FROM patient WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        return resultSet;
    } catch (SQLException e) {
        e.printStackTrace();
    }}
    return null;
}    
    public  static boolean login(String username, String password) {
       try {
           name=username;
    Connection connection = dbConnection.getConnection();
    String sql = "SELECT * FROM patient WHERE name = ? AND password = ?";
    PreparedStatement statement = connection.prepareStatement(sql);
    statement.setString(1, username.trim());
    statement.setString(2, password.trim());
    ResultSet resultSet = statement.executeQuery();
    boolean logged = resultSet.next();
    
    if (logged) {
        id = resultSet.getInt("id");
    }
    
    resultSet.close();
    statement.close(); 
    Patient.loggedIn = logged;
    
    return logged;
} catch (SQLException e) {
    e.printStackTrace();
}

return false;
    }

    public void register() {
        // Implementation for logout
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Doctor extends User {
 public  static  int id;
    public Doctor(String name, String phoneNumber, String password) {
        super(name, phoneNumber, password);
    }
    public static  ResultSet viewPatientCase() {
        try {
            System.out.println(id);
            System.out.println(id);
            System.out.println(id);
            Connection connection = dbConnection.getConnection();
            String sql = "SELECT * FROM patient INNER JOIN patientandtheirDoctor ON patient.id = patientandtheirDoctor.patientid WHERE patientandtheirDoctor.doctorid = ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void chooseVisitNecessity(int patientId, boolean necessary) {
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "UPDATE patient SET visitNecessity = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setBoolean(1, necessary);
            statement.setInt(2, patientId);
            statement.executeUpdate();
            statement.close();
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

  public static boolean sendPatientResult(int patientId, String result) {
    try {
        Connection connection = dbConnection.getConnection();
        String sql = "UPDATE patient SET result = ? WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, result);
        statement.setInt(2, patientId);
        int rowsAffected = statement.executeUpdate();
        statement.close();
             
        return rowsAffected > 0;
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}

        public static boolean sendDoctorResponseToLab(int patientId, String result) {
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "UPDATE patientandtheirDoctor SET DoctorResponse = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, result);
            statement.setInt(2, patientId);
            int rowsAffected = statement.executeUpdate();
            statement.close();
             
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static ResultSet viewLabResult(int patientId) {
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "SELECT labResult FROM patientandtheirDoctor WHERE patientid = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, patientId);
            ResultSet resultSet = statement.executeQuery();
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void sendPrescription(int patientId, String prescription) {
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "UPDATE patient SET prescription = ? WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, prescription);
            statement.setInt(2, patientId);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public  static boolean login(String username, String password) {
        try {
            System.out.println("hey");
            Connection connection = dbConnection.getConnection();
            String sql = "SELECT id FROM doctor WHERE name = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username.trim());
            statement.setString(2, password.trim());
            ResultSet resultSet = statement.executeQuery();
            boolean loggedIn = resultSet.next();
           
            if(loggedIn){id= resultSet.getInt("id");
            System.out.println(id);
            resultSet.close();
            statement.close();
            return loggedIn;}
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean changePassword(String password) throws SQLException {
                    Connection connection = dbConnection.getConnection();
                    String sql = "update doctor set password=? where id=?";
                    PreparedStatement statement = connection.prepareStatement(sql);
                    statement.setString(1, password);
                    statement.setInt(2, id);
                    return  statement.executeUpdate()==1;
    }
}

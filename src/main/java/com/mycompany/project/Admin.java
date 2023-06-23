
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin extends User {
    public Admin(String name, String phoneNumber, String password) {
        super(name, phoneNumber, password);
    }

    public static boolean addAdmin(String name, String phoneNumber, String password) {
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "INSERT INTO admin (name, phoneNumber, password) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, phoneNumber);
            statement.setString(3, password);
            int rowsAffected = statement.executeUpdate();
            statement.close();
             
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
    


    public static boolean addDoctor(String name, String phoneNumber, String password, String specialization,String email, String qualification,String experience) {
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "INSERT INTO doctor (name, phoneNumber, password,specialization,email,qualification,experience) VALUES (?, ?, ?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name.trim());       statement.setString(2, phoneNumber.trim());
            statement.setString(3, password.trim());   statement.setString(4, specialization.trim());
            statement.setString(5, email.trim());      statement.setString(6, qualification.trim());
            statement.setString(7, experience.trim());   
            int rowsAffected = statement.executeUpdate();
            statement.close();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean addReceptionist(String name, String phoneNumber, String password) {
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "INSERT INTO receptionist (name, phoneNumber, password) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name.trim());
            statement.setString(2, phoneNumber.trim());
            statement.setString(3, password.trim());
            int rowsAffected = statement.executeUpdate();
            statement.close();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean addLabTech(String name, String phoneNumber, String password) {
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "INSERT INTO labtechnician (name, phoneNumber, password) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, phoneNumber);
            statement.setString(3, password);
            int rowsAffected = statement.executeUpdate();
            statement.close();
               
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean delDoctor(int doctorId) {
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "DELETE FROM doctor WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, doctorId);
            int rowsAffected = statement.executeUpdate();
            statement.close();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean delReceptionist(int receptionistId) {
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "DELETE FROM receptionist WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, receptionistId);
            int rowsAffected = statement.executeUpdate();
            statement.close();
                 
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean delLabTech(int labTechId) {
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "DELETE FROM labtechnician WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, labTechId);
            int rowsAffected = statement.executeUpdate();
            statement.close();
             
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static ResultSet getDoctors() {
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "SELECT * FROM doctor";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ResultSet getReceptionists() {
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "SELECT * FROM receptionist";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ResultSet getLabTechnicians() {
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "SELECT * FROM labtechnician";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean login( String password) {
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "SELECT * FROM admin WHERE  password = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, password);
            ResultSet resultSet = statement.executeQuery();
            boolean loggedIn = resultSet.next();
            resultSet.close();
            statement.close();
            return loggedIn;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean changePassword(String password) throws SQLException {
                    Connection connection = dbConnection.getConnection();
                    String sql = "update admin set password=? where id=1";
                    PreparedStatement statement = connection.prepareStatement(sql);
                    statement.setString(1, password);
                    return  statement.executeUpdate()==1;
    }
}


package com.mycompany.project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class LabTechnician extends User {
static int id;
    public LabTechnician(String name, String phoneNumber, String password) {
        super(name, phoneNumber, password);
    }
    public  static ResultSet viewDoctorsResponse() {
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "SELECT patientid,DoctorResponse FROM  patientandtheirDoctor ";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            return resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static  boolean sendLabResult(int patientId, String labResult) {
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "UPDATE patientandtheirDoctor SET labResult = ? WHERE patientid = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, labResult);
            statement.setInt(2, patientId);
            int rowsAffected = statement.executeUpdate();
            statement.close();
             
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public  static boolean login(String username, String password) {
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "SELECT * FROM labtechnician WHERE name = ? AND password = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            boolean loggedIn = resultSet.next();
           if(loggedIn){
            id= resultSet.getInt("id");
            resultSet.close();
            statement.close();
            return loggedIn;}
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void logOut() {
        // Implementation for logout
    }
}

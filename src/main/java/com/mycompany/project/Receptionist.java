
package com.mycompany.project;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//i have to update the doctor class
public class Receptionist extends User {
    public Receptionist(String name, String phoneNumber, String password) {
        super(name, phoneNumber, password);
    }
    public static  boolean AssignDoctorAndView(int patientId,int docId) {
        try {
            Connection connection = dbConnection.getConnection();
            String  sql="insert into patientandtheirDoctor(doctorid,patientid) values(?,?)";
            PreparedStatement    statements = connection.prepareStatement(sql);
            statements.setInt(1, docId);
            statements.setInt(2,  patientId);
            return statements.executeUpdate()!=-1;
        } catch (SQLException e) {
                    e.getMessage();
        }
        return false;  
    }
    
    public static  ResultSet viewPatientInformation() {
    try {
        Connection connection = dbConnection.getConnection();
        String sql = "SELECT * FROM patient ";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        return resultSet;
    } catch (SQLException e) {
        e.getMessage();
    }
    return null;
}    
    
    public static  ResultSet seeDoctorInformation(){
        try{
            Connection connection = dbConnection.getConnection();
            String sql = "SELECT * FROM doctor";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            return resultSet;
        } catch (SQLException e) {
                    e.getMessage();
        }
        return null;
    }
    public static  ResultSet viewPatientResult(int patientId) {
        try {
            Connection connection = dbConnection.getConnection();
            String sql = "SELECT result FROM patient WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, patientId);
            ResultSet resultSet = statement.executeQuery();
            return resultSet;
        } catch (SQLException e) {
                    e.getMessage();
        }
        
        return null;
    }

    public static  boolean requestLabFee(int patientId,double labFee)  {
         try{
                    Connection connection = dbConnection.getConnection();
                    String  sql="update patient set labfee=?where id=?";
                    PreparedStatement statement = connection.prepareStatement(sql);
                    statement.setDouble(1, labFee);
                    statement.setInt(2, patientId);
                    statement.executeUpdate();
                   return true;
                   }catch(SQLException e){  
                               e.getMessage();

                    }
                   return false;
    }

    public  static boolean requestAppointmentFee(int patientId,double appointmentFee) {
                   try{
                    Connection connection = dbConnection.getConnection();
                    String  sql="update patient set appointmentFee=?where id=?";
                    PreparedStatement statement = connection.prepareStatement(sql);
                    statement.setInt(2, patientId);
                    statement.setDouble(1, appointmentFee);
                    statement.executeUpdate();
                       System.out.println("succeeded");
                   return true;
                   }catch(SQLException e){  
        e.getMessage();
                    }
                   return false;
    }
public static boolean login(String username, String password) {
    Connection connection = dbConnection.getConnection();
    if (connection != null) {
        try {
            String sql = "SELECT * FROM receptionist WHERE name = ? AND password = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, username.trim());
                statement.setString(2, password.trim());
                try (ResultSet resultSet = statement.executeQuery()) {
                    return resultSet.next();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return false;
}


    public void logOut() {
    }
}

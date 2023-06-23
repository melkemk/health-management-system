package com.mycompany.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Message {
    private static int id;
    private String message;

    public Message(int id) {
        this.id = id;
    }

    public boolean save(String message) throws SQLException {
        this.message = message;
        Connection con = dbConnection.getConnection();
        String sql = "INSERT INTO message(patientid, message) VALUES (?, ?)";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1, id);
        statement.setString(2, message);
        return statement.executeUpdate() > 0;
    }

    public  ResultSet fetch() {
        Connection con = dbConnection.getConnection();
        String sql = "SELECT * FROM message WHERE patientid = ? ORDER BY timestamp";
        try {
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, id);
            return statement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

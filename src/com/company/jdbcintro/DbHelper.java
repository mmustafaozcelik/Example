package com.company.jdbcintro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String userName="root";
    private String password ="12345";
    private   String dbUrl ="jdbc:mysql://localhost:3306/world_x";
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    public void showErorMessage(SQLException exception){
        System.out.println("Error" + exception.getMessage());
        System.out.println("Error" + exception.getErrorCode());
    }
}

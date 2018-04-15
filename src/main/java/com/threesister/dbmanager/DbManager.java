/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.threesister.dbmanager;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author biswas
 */
public class DbManager {

    private static String url = "jdbc:mysql://localhost:3306/threesister";
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String username = "root";
    private static String password = "root";
    private static Connection con;

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = (Connection) DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection.");
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found.");
        }
        return con;
    }

    public static void main(String[] args) {
        getConnection();
    }
}


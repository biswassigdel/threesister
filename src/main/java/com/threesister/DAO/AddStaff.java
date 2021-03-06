/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.threesister.DAO;

import com.threesister.dbmanager.DbManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author biswas
 */
public class AddStaff {

    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;
    private static PreparedStatement ps = null;

    public static boolean addStaff(String name, String post, String licenseNo, String mobileNo, String address) {
        try {
            String sql = "INSERT INTO Staff"
                    + "(StaffName, Post, LicenseNo, MobileNo, Address) VALUES"
                    + "(?,?,?,?,?)";
            con = DbManager.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, post);
            ps.setString(3, licenseNo);
            ps.setString(4, mobileNo);
            ps.setString(5, address);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}

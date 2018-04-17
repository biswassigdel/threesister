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
public class TrekkingAreaDao {

    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;
    private static PreparedStatement ps = null;

    public static boolean addTrekkingArea(String trekkingArea, String days, String nights, String routeName) {
        try {
            String sql = "INSERT INTO TrekkingArea"
                    + "(TrekkingAreaName, DurationDay, DurationNight, Route) VALUES"
                    + "(?,?,?,?)";
            con = DbManager.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, trekkingArea);
            ps.setString(2, days);
            ps.setString(3, nights);
            ps.setString(4, routeName);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}

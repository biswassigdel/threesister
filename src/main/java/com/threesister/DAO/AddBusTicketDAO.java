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
public class AddBusTicketDAO {

    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;
    private static PreparedStatement ps = null;

    public static boolean addBusTicket(String name, String travelAgency, String issueDate, String departureDate, String ticketNumber) {
        try {
            String sql = "INSERT INTO BusTicket"
                    + "(Name, TravelAgency, IssueDate, DepartureDate, TicketNumber) VALUES"
                    + "(?,?,?,?,?)";
            con = DbManager.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, travelAgency);
            ps.setString(3, issueDate);
            ps.setString(4, departureDate);
            ps.setString(5, ticketNumber);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}

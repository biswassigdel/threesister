/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.threesister.DAO;

import com.threesister.dbmanager.DbManager;
import com.threesister.entities.UsersEntity;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author biswas
 */
public class UserLogin {

    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    public static boolean checkLogin(String username, String password) {
        try {
            con = DbManager.getConnection();
            stmt = con.createStatement();
            rs = stmt.executeQuery("select username, password from UsersEntity where username ='" + username + "'");
            while (rs.next()) {
                if ((rs.getString(1).equals(username)) && (rs.getString(2).equals(password))) {
                    return true;
                } else {
                    return false;
                }
            }
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

//    public static void main(String[] args) {
//        try {
//            con = DbManager.getConnection();
//            stmt = con.createStatement();
//            rs = stmt.executeQuery("select username, password from UsersEntity");
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
//            }
//            con.close();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//
//    }
}

//    public static EntityManagerFactory getEntityManagerFactory() {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.threesister_threesister_jar_1.0-SNAPSHOTPU");
//        return emf;
//    }
//    private UsersEntity getLogin(String userName, String password) {
//        try {
//            EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.threesister_threesister_jar_1.0-SNAPSHOTPU");
//            EntityManager em = emf.createEntityManager();
//            em.getTransaction().begin();
//            Query query = em.createNamedQuery("UsersEntity.findByUserandPass");
//            query.setParameter("userName", userName);
//            query.setParameter("password", password);
//            System.out.println("===========================" + userName + "    " + password);
//            UsersEntity user = (UsersEntity) query.getSingleResult();
//            return user;
//        } catch (Exception e) {
//            return null;
//        }
//
//    }
//    
//    public boolean valid(String username, String password) {
//        System.out.println("username" + username + "password:" + password);
//        UsersEntity user = getLogin(username, password);
//        if (user != null) {
//            System.out.println("Db Username " + user.getUserName() + " Password " + user.getPassword());
//            return true;
//        }
//        return false;
//    }


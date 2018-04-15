/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.threesister.DAO;

import com.threesister.entities.UsersEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author biswas
 */
public class CreateUser {

    public static void main(String[] args) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("com.threesister_threesister_jar_1.0-SNAPSHOTPU");

        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        UsersEntity user = new UsersEntity();
        user.setUserName("biswas");
        user.setPassword("biswas");
        entitymanager.persist(user);
        entitymanager.getTransaction().commit();

        entitymanager.close();
        emfactory.close();
    }
}

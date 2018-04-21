/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.threesister.views;

/**
 *
 * @author biswas
 */
public class Staff {

    private int id;
    private String name;
    private String post;
    private String licenseNo;
    private String mobileNo;
    private String address;

    public Staff() {
    }

    public Staff(int id, String name, String post, String licenseNo, String mobileNo, String address) {
        this.id = id;
        this.name = name;
        this.post = post;
        this.licenseNo = licenseNo;
        this.mobileNo = mobileNo;
        this.address = address;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

}

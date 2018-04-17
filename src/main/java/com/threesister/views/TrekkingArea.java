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
public class TrekkingArea {
    private int id;
    private String trakkingAreaName;
    private String days;
    private String nights;
    private String route;

    public TrekkingArea(int id, String trakkingAreaName, String days, String nights, String route) {
        this.id = id;
        this.trakkingAreaName = trakkingAreaName;
        this.days = days;
        this.nights = nights;
        this.route = route;
    }

    public TrekkingArea() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTrakkingAreaName() {
        return trakkingAreaName;
    }

    public void setTrakkingAreaName(String trakkingAreaName) {
        this.trakkingAreaName = trakkingAreaName;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getNights() {
        return nights;
    }

    public void setNights(String nights) {
        this.nights = nights;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
    
}

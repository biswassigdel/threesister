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
public class FlightTicket {
    private int id;
    private String name;
    private String travelAgency;
    private String issueDate;
    private String flightDate;
    private String flightTime;
    private String airlines;
    private String ticketNumber;

    public FlightTicket() {
    }

    public FlightTicket(int id, String name, String travelAgency, String issueDate, String flightDate, String flightTime, String airlines, String ticketNumber) {
        this.id = id;
        this.name = name;
        this.travelAgency = travelAgency;
        this.issueDate = issueDate;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.airlines = airlines;
        this.ticketNumber = ticketNumber;
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

    public String getTravelAgency() {
        return travelAgency;
    }

    public void setTravelAgency(String travelAgency) {
        this.travelAgency = travelAgency;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = flightTime;
    }

    public String getAirlines() {
        return airlines;
    }

    public void setAirlines(String airlines) {
        this.airlines = airlines;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    
}

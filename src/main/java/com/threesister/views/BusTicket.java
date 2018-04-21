/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.threesister.views;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author biswas
 */
public class BusTicket {

    private int id;
    private String name;
    private String travelAgency;
    private String issueDate;
    private String departureDate;
    private String ticketNumber;

    public BusTicket(int id, String name, String travelAgency, String issueDate, String departureDate, String ticketNumber) {
        this.id = id;
        this.name = name;
        this.travelAgency = travelAgency;
        this.issueDate = issueDate;
        this.departureDate = departureDate;
        this.ticketNumber = ticketNumber;
    }

    BusTicket() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    @Override
    public String toString() {
        return "BusTicket{" + "id=" + id + ", name=" + name + ", travelAgency=" + travelAgency + ", issueDate=" + issueDate + ", departureDate=" + departureDate + ", ticketNumber=" + ticketNumber + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.travelAgency);
        hash = 67 * hash + Objects.hashCode(this.issueDate);
        hash = 67 * hash + Objects.hashCode(this.departureDate);
        hash = 67 * hash + Objects.hashCode(this.ticketNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BusTicket other = (BusTicket) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.travelAgency, other.travelAgency)) {
            return false;
        }
        if (!Objects.equals(this.issueDate, other.issueDate)) {
            return false;
        }
        if (!Objects.equals(this.departureDate, other.departureDate)) {
            return false;
        }
        if (!Objects.equals(this.ticketNumber, other.ticketNumber)) {
            return false;
        }
        return true;
    }

}

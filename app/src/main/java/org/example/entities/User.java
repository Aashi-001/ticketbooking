package org.example.entities;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    @JsonProperty("name")
    private String name;
    @JsonProperty("password")
    private String password;
    @JsonProperty("hashedpassword")
    private String hashedpassword;
    @JsonProperty("userID")
    private String userID;
    @JsonProperty("bookingList")
    private List<Ticket> bookingList;
    private boolean loggedin = false;

    public User(){}

    public String getUserName(){
        return this.name;
    }

    public String getUserPassword(){
        return this.password;
    }

    public String getUserHashedPassword(){
        return this.hashedpassword;
    }

    public String getUserID(){
        return this.userID;
    }

    public List<Ticket> getBookingList(){
        return this.bookingList;
    }
    
    public void setUserName(String x){
        this.name = x;
    }

    public void setUserPassword(String x){
        this.password = x;
    }

    public void setUserID(String x){
        this.userID = x;
    }

    public void setBookingList(List<Ticket> l){
        this.bookingList = l;
    }

    public void setloggedIn(){
        this.loggedin = true;
    }
}

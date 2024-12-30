package org.example.entities;

import java.util.*;

import java.sql.Time;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ticket {
    @JsonProperty("ticketid")
    private String ticketid;
    @JsonProperty("userID")
    private String userID;
    @JsonProperty("source")
    private Station source;
    @JsonProperty("destination")
    private Station dest;
    @JsonProperty("journeyDate")
    private Date journeyDate;
    @JsonProperty("ofTrain")
    // private Train ofTrain;
    private Train ofTrain;

    public Ticket() {}

    public void displayInfo(){
        System.out.println(ticketid);
        System.out.println(source.getStationName());
        System.out.println(dest.getStationName());
        System.out.println(journeyDate);
        System.out.println(ofTrain.getName());
        Map<Station, Time> mp = ofTrain.getstopTime();
        System.out.println(mp.get(source));
        System.out.println(mp.get(dest));
    }
}

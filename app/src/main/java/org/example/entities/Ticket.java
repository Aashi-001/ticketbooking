package org.example.entities;

import java.util.*;

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
}

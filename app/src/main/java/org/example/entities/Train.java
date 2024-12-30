package org.example.entities;

import java.sql.Time;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


public class Train {
    @JsonProperty("train_name")
    private String trainName;
    @JsonProperty("train_number")
    private Integer trainNumber;
    @JsonProperty("deptdate")
    private Date trainDeptDate;
    @JsonProperty("depttime")
    private Time trainDeptTime;
    @JsonProperty("arrdate")
    private Date trainArrDate;
    @JsonProperty("endtime")
    private Time trainArrTime;
    @JsonProperty("seats")
    private List<List<Boolean>> seatMap;
    @JsonProperty("source")
    private Station Dept;
    @JsonProperty("destination")
    private Station Arrival;
    @JsonProperty("stations")
    @JsonSerialize(keyUsing = StationKeySerializer.class)
    private Map<Station, Time> stopTime;
    @JsonProperty("stops")
    private List<Station> stops;

    public Train() {}

    public String getName(){
        return this.trainName;
    }
    public Integer getNumber(){
        return this.trainNumber;
    }
    public Date getDeptTime(){
        return this.trainDeptDate;
    }
    public Date getArrTime(){
        return this.trainArrDate;
    }
    public Map<Station, Time> getstopTime(){
        return this.stopTime;
    }
}

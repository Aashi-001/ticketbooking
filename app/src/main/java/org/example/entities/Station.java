package org.example.entities;

// import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Station {
    @JsonProperty("station_name")
    private String StationName;
    @JsonProperty("station_id")
    private String StationId; // UMB, NDLS, CDG, DEL
    @JsonProperty("station_master")
    private String StationMaster;
    @JsonProperty("platforms")
    private Integer platforms;

    public Station() {}

    public Station(String x) {
        this.StationId = x;
    }

    public String getStationName() {
        return StationName;
    }

    public void setStationName(String stationName) {
        this.StationName = stationName;
    }

    public String getStationId() {
        return StationId;
    }

    public void setStationId(String stationId) {
        this.StationId = stationId;
    }

    public String getStationMaster() {
        return StationMaster;
    }

    public void setStationMaster(String stationMaster) {
        this.StationMaster = stationMaster;
    }

    public Integer getPlatforms() {
        return platforms;
    }

    public void setPlatforms(Integer platforms) {
        this.platforms = platforms;
    }

    @Override
    public String toString() {
        return this.StationId;
    }

    public void displayInfo(){
        System.out.println(StationName);
        System.out.println(StationId);
        System.out.println(StationMaster);
        System.out.println(platforms);
    }
}

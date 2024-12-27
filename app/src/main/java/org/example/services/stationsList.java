package org.example.services;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.example.entities.Station;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class stationsList {

    private static final String STATIONPATH = "/Users/aashi/Desktop/projects/PRACTICE - CODE/JAVA/IRCTC/app/src/main/java/org/example/localDB/station.json";
    private ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private List<Station> stations_list;

    public stationsList() throws JsonParseException, JsonMappingException, IOException{
        File trains = new File(STATIONPATH);
        stations_list = OBJECT_MAPPER.readValue(trains, new TypeReference<List<Station>>() {});
    }
    public void Print(){
        for (Station station : stations_list) {
            System.out.println("-----------------------");
            station.displayInfo();
            System.out.println("-----------------------");
        }
    }
}

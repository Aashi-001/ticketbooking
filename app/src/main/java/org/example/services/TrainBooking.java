package org.example.services;

import java.io.File;
import java.io.IOException;
// import java.sql.Date;
import java.util.List;

import org.example.entities.Train;
// import org.example.entities.User;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TrainBooking {
    //  private User user;

    private static final String TRAINPATH = "/Users/aashi/Desktop/projects/PRACTICE - CODE/JAVA/IRCTC/app/src/main/java/org/example/localDB/trains.json";
    private ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    private List<Train> trainList;

    public TrainBooking() throws JsonParseException, JsonMappingException, IOException{
        // this.user = u;
        File trains = new File(TRAINPATH);
        // System.out.println(trains);
        trainList = OBJECT_MAPPER.readValue(trains, new TypeReference<List<Train>>() {});
    }

    public void Print() {
        // System.out.println(trainList);
        for (Train train : trainList) {
            System.out.println(train.getName());
        }
        // return true;
    }
}

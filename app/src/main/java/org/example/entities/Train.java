package org.example.entities;

import java.sql.Time;
import java.util.*;

public class Train {
    private String trainName;
    private Integer trainNumber;
    private Date trainDeptDate;
    private Time trainDeptTime;
    private Date trainArrDate;
    private Time trainArrTime;
    private List<List<Boolean>> seatMap;
    private Station Dept;
    private Station Arrival;
    private Map<Station, Time> stopTime;
    private List<Station> stops;
}

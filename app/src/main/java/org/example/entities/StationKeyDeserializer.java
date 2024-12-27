package org.example.entities;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class StationKeyDeserializer extends JsonDeserializer<Station> {
    @Override
    public Station deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String stationId = p.getText();
        return new Station(stationId);
    }
}

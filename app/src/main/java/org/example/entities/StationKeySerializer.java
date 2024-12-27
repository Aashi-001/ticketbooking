package org.example.entities;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

public class StationKeySerializer extends JsonSerializer<Station> {
    @Override
    public void serialize(Station station, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeFieldName(station.getStationId());
    }
}

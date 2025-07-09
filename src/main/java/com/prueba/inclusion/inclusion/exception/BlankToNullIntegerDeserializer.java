package com.prueba.inclusion.inclusion.exception;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;

public class BlankToNullIntegerDeserializer extends JsonDeserializer<Integer> {
    @Override
    public Integer deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        String value = p.getText();
        if (value == null || value.trim().isEmpty()) {
            return null;
        }
        return Integer.valueOf(value);
    }
}
package org.example.exercise;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class MyVerifier {
    public static boolean jsonVerifier(File jsonPath) {

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(new File(jsonPath.toURI()));

            // Get value from "Resource" key
            String resourceValue = jsonNode
                    .get("PolicyDocument")
                    .get("Statement")
                    .get(0)
                    .get("Resource")
                    .asText();

            // Count characters to check if there's asterisk without additional text
            var howManyChars = resourceValue
                    .chars()
                    .count();

            // Count asterisks
            long stars = resourceValue.chars()
                    .filter(c -> c == '*')
                    .count();

            // If there's ONLY ONE ASTERISK WITHOUT ANY ADDITIONAL CHARACTERS then return false value
            if(stars == 1 && howManyChars == stars)
                return false;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return true;
    }
}

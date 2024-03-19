package org.example;

import org.example.exercise.MyVerifier;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void getJsonResourceWithOnlyOneAsterisk_shouldReturnFalse() {
        String path = "src/main/resources/TestFiles/OnlyOneAsterisk.json";
        File file = new File(path).getAbsoluteFile();

        assertEquals(false, MyVerifier.jsonVerifier(file));
    }

    @Test
    public void getJsonResourceWithTextAndOneAsterisk_shouldReturnTrue() {
        String path = "src/main/resources/TestFiles/TextAndOneAsterisk.json";
        File file = new File(path).getAbsoluteFile();

        assertEquals(true, MyVerifier.jsonVerifier(file));
    }

    @Test
    public void getJsonResourceWithTwoAsterisks_shouldReturnTrue() {
        String path = "src/main/resources/TestFiles/TwoAsterisks.json";
        File file = new File(path).getAbsoluteFile();

        assertEquals(true, MyVerifier.jsonVerifier(file));
    }

    @Test
    public void getJsonResourceWithTextAndTwoAsterisks_shouldReturnTrue() {
        String path = "src/main/resources/TestFiles/TextAndTwoAsterisks.json";
        File file = new File(path).getAbsoluteFile();

        assertEquals(true, MyVerifier.jsonVerifier(file));
    }

    @Test
    public void getJsonResourceWithEmptyValue_shouldReturnTrue() {
        String path = "src/main/resources/TestFiles/EmptyValue.json";
        File file = new File(path).getAbsoluteFile();

        assertEquals(true, MyVerifier.jsonVerifier(file));
    }

    @Test
    public void getJsonResourceWithOnlyTextAndNoAsterisks_shouldReturnTrue() {
        String path = "src/main/resources/TestFiles/OnlyTextAndNoAsterisks.json";
        File file = new File(path).getAbsoluteFile();

        assertEquals(true, MyVerifier.jsonVerifier(file));
    }
}
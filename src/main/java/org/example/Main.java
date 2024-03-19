package org.example;

import org.example.exercise.MyVerifier;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File path = new File("InputFile.json")
                .getAbsoluteFile();

        System.out.println(MyVerifier.jsonVerifier(path));
    }
}
package com.logfile.app;

import java.io.*;
import java.util.Scanner;

public class LogFileAnalyzer {

    // These variables will hold our counts
	static int infoCount = 0;
    static int errorCount = 0;
    static int warningCount = 0;

    public static void main(String[] args) throws Exception {
        
        // 1. Created a "Worker" thread for INFO
        Thread infoThread = new Thread(() -> {
            infoCount = countOccurrences("INFO");
        });

        // 2. Created a "Worker" thread for ERROR
        Thread errorThread = new Thread(() -> {
            errorCount = countOccurrences("ERROR");
        });

        // 3. Created a "Worker" thread for WARNING
        Thread warningThread = new Thread(() -> {
            warningCount = countOccurrences("WARNING");
        });

        // Starting all three workers at the same time
        infoThread.start();
        errorThread.start();
        warningThread.start();

        // Waiting for them to finish their jobs
        infoThread.join();
        errorThread.join();
        warningThread.join();

        // Showing the results
        System.out.println("INFO Count: " + infoCount);
        System.out.println("ERROR Count: " + errorCount);
        System.out.println("WARNING Count: " + warningCount);
    }

    // This is  helper method to read the file and count a word
    public static int countOccurrences(String wordToLookFor) {
        int count = 0;
        try (Scanner scanner = new Scanner(new File("logs.txt"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(wordToLookFor)) {
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Could not find logs.txt!");
        }
        return count;
    }
}
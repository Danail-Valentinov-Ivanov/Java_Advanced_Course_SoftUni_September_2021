package exe4_Streams_Files_and_Directories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class prob1_Sum_Lines {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\DANAIL\\Downloads" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        Files.readAllLines(Path.of(path)).stream().map(String::toCharArray)
                .forEach(charArray -> {
                    int sum = 0;
                    for (char e : charArray) {
                        sum += e;
                    }
                    System.out.println(sum);
                });
    }
}

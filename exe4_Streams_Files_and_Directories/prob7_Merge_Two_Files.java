package exe4_Streams_Files_and_Directories;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class prob7_Merge_Two_Files {
    public static void main(String[] args) throws IOException {
        String pathDir1 = "C:\\Users\\DANAIL\\Downloads" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        Path path1 = Paths.get(pathDir1);
        String pathDir2 = "C:\\Users\\DANAIL\\Downloads" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";
        Path path2 = Paths.get(pathDir2);
        List<String> listOutput = new ArrayList<>();
        Files.readAllLines(path1).forEach(line -> listOutput.add(line));
        Files.readAllLines(path2).forEach(line -> listOutput.add(line));
        BufferedWriter writer = new BufferedWriter(new PrintWriter("output.txt"));
        for (String line : listOutput) {
            writer.write(line);
            writer.newLine();
        }
        writer.close();
    }
}

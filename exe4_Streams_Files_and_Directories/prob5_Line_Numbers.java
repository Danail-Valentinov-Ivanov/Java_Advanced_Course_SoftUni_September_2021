package exe4_Streams_Files_and_Directories;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class prob5_Line_Numbers {
    public static void main(String[] args) throws IOException {
        String pathDir = "C:\\Users\\DANAIL\\Downloads" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        Path path = Paths.get(pathDir);
        BufferedWriter writer = new BufferedWriter(new PrintWriter("output.txt"));
        List<String> allLines = Files.readAllLines(path);
        int count = 0;
        for (String line : allLines) {
            writer.write(++count + ". " + line);
            writer.newLine();
        }
        writer.close();
    }
}

package exe4_Streams_Files_and_Directories;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class prob3_ALL_CAPITALS {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\DANAIL\\Downloads" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        List<String> list = Files.readAllLines(Path.of(path));
        for (String line : list) {
            writer.write(line.toUpperCase() + "\n");
        }
        writer.close();
    }
}

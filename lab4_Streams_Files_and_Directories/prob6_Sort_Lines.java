package lab4_Streams_Files_and_Directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class prob6_Sort_Lines {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\DANAIL\\Downloads" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt");
        List<String> lines = Files.readAllLines(path)
                .stream().sorted().collect(Collectors.toList());
        Files.write(Paths.get("output.txt"), lines);
    }
}

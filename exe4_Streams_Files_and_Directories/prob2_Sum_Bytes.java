package exe4_Streams_Files_and_Directories;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class prob2_Sum_Bytes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\DANAIL\\Downloads" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        long sum = 0;
        for (byte character : Files.readAllBytes(Path.of(path))) {
            if (character != 10 && character != 13) {
                sum += character;
            }
        }
        System.out.println(sum);
    }
}

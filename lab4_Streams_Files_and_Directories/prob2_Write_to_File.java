package lab4_Streams_Files_and_Directories;

import java.io.*;
import java.util.Set;

public class prob2_Write_to_File {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\DANAIL\\Downloads" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        //, . ! ?
        String outputPath = "output.txt";
        InputStream input = new FileInputStream(path);
        OutputStream output = new FileOutputStream(outputPath);
        Set<Character> setCharException = Set.of(',', '.', '!', '?');
        int oneByte = input.read();
        while (oneByte != -1) {
            char current = (char) oneByte;
            if (!setCharException.contains(current)) {
                output.write(current);
            }
            oneByte = input.read();
        }
        input.close();
        output.close();
    }
}

package lab4_Streams_Files_and_Directories;

import java.io.*;
import java.util.Set;

public class prob3_Copy_Bytes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\DANAIL\\Downloads" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "output.txt";
        InputStream input = new FileInputStream(path);
        OutputStream output = new FileOutputStream(outputPath);
        PrintStream outPrint = new PrintStream(output);
        int oneByte = input.read();
        while (oneByte != -1) {
            if (oneByte != 10 && oneByte != 32) {
                outPrint.print(oneByte);
            } else {
                outPrint.print((char) oneByte);
            }
            oneByte = input.read();
        }
        input.close();
        output.close();
    }
}

package lab4_Streams_Files_and_Directories;

import java.io.*;
import java.util.Scanner;

public class prob4_Extract_Integers {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\DANAIL\\Downloads" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String outputPath = "output.txt";
        InputStream input = new FileInputStream(path);
        OutputStream output = new FileOutputStream(outputPath);
        PrintStream outPrint = new PrintStream(output);
        Scanner scanner = new Scanner(input);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int oneByte = scanner.nextInt();
                //or
                // int oneByte = Integer.parseInt(scanner.next());
                outPrint.println(oneByte);
            } else {
                scanner.next();
            }
        }
        input.close();
        output.close();
    }
}

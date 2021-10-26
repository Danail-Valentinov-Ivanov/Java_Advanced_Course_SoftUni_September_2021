package lab4_Streams_Files_and_Directories;

import java.io.*;
import java.util.Scanner;

public class prob5_Write_Every_Third_Line {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\DANAIL\\Downloads" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        InputStream input = new FileInputStream(path);
        InputStreamReader inputStreamReader = new InputStreamReader(input);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String outputPath = "output.txt";
        OutputStream output = new FileOutputStream(outputPath);
        PrintWriter printWriter = new PrintWriter(output);
        BufferedWriter bufferedWriter = new BufferedWriter(printWriter);
        String line = bufferedReader.readLine();
        int count = 1;
        while (line != null) {
            if (count % 3 == 0) {
                bufferedWriter.write(line+System.lineSeparator());
            }
            line = bufferedReader.readLine();
            count++;
        }
        input.close();
        bufferedWriter.close();
    }
}

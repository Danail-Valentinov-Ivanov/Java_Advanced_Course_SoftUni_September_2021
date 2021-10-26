package lab4_Streams_Files_and_Directories;

import java.io.File;

public class prob7_List_Files {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\DANAIL\\Downloads" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File e : files) {
                    if (!e.isDirectory()) {
                        System.out.println(e.getName() + ": [" + e.length() + "]");
                    }
                }
            }
        }
    }
}

package exe4_Streams_Files_and_Directories;

import java.io.File;

public class prob8_Get_Folder_Size {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\DANAIL\\Downloads" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");
        File[] files = file.listFiles();
        long totalSize = 0;
        for (File e : files) {
            long size = e.length();
            totalSize += size;
        }
        System.out.println("Folder size: " + totalSize);
    }
}

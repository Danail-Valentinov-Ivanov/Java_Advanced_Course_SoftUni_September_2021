package lab4_Streams_Files_and_Directories;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Deque;

public class prob8_Nested_Folders {
    public static void main(String[] args) {
        File root = new File("C:\\Users\\DANAIL\\Downloads" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        Deque<File> queueDirs = new ArrayDeque<>();
        queueDirs.offer(root);
        int count = 0;
        while (!queueDirs.isEmpty()) {
            File current = queueDirs.poll();
            File[] nestedFiles = current.listFiles();
            for (File e : nestedFiles) {
                if (e.isDirectory()) {
                    queueDirs.offer(e);
                }
            }
            count++;
            System.out.println(current.getName());
        }
        System.out.println(count + " folders");
    }
}

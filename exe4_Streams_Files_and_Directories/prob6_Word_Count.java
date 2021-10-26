package exe4_Streams_Files_and_Directories;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class prob6_Word_Count {
    public static void main(String[] args) throws IOException {
        String pathDir1 = "C:\\Users\\DANAIL\\Downloads" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        Path path1 = Paths.get(pathDir1);
        String pathDir2 = "C:\\Users\\DANAIL\\Downloads" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        Path path2 = Paths.get(pathDir2);
        Map<String, Integer> mapCountWords = new HashMap<>();
        List<String> words = Files.readAllLines(path2);
        String[] wordsArray = words.get(0).split("\\s+");
        List<String> input = Files.readAllLines(path1);
        for (String line : input) {
            String[] arrayLine = line.split("\\s+");
            for (String word : arrayLine) {
                for (String e : wordsArray) {
                    if (e.equals(word)) {
                        if (mapCountWords.containsKey(word)) {
                            mapCountWords.put(word, mapCountWords.get(word) + 1);
                        } else {
                            mapCountWords.put(word, 1);
                        }
                    }
                }
            }
        }
        BufferedWriter writer = new BufferedWriter(new PrintWriter("output.txt"));
        mapCountWords.entrySet().stream().sorted((e2, e1) -> e1.getValue().compareTo(e2.getValue()))
                .forEach(entry -> {
                    try {
                        writer.write(entry.getKey() + " - " + entry.getValue());
                        writer.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
        writer.close();
    }
}

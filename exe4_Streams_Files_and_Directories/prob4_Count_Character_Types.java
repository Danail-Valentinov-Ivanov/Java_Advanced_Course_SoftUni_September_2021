package exe4_Streams_Files_and_Directories;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class prob4_Count_Character_Types {
    public static void main(String[] args) throws IOException {
        String pathDir = "C:\\Users\\DANAIL\\Downloads" +
                "\\04. Java-Advanced-Streams-Files-and-Directories-Resources" +
                "\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        Path path = Paths.get(pathDir);
        List<String> listLines = new ArrayList<>();
        try {
            listLines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, Integer> mapSymbols = new LinkedHashMap<>();
        mapSymbols.put("Vowels", 0);
        mapSymbols.put("Consonants", 0);
        mapSymbols.put("Punctuation", 0);
        for (String line : listLines) {
            for (char symbol : line.toCharArray()) {
                if (isVowel(symbol)) {
                    mapSymbols.put("Vowels", mapSymbols.get("Vowels") + 1);
                } else if (isPonctuation(symbol)) {
                    mapSymbols.put("Punctuation", mapSymbols.get("Punctuation") + 1);
                } else if (symbol == ' ') {

                } else {
                    mapSymbols.put("Consonants", mapSymbols.get("Consonants") + 1);
                }
            }
        }
        BufferedWriter writer = new BufferedWriter(new PrintWriter("output.txt"));
        for (var entry : mapSymbols.entrySet()) {
            writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
        }
        writer.flush();
    }

    private static boolean isPonctuation(char symbol) {
        return symbol == '?' || symbol == ',' || symbol == '.' || symbol == '!';
    }

    private static boolean isVowel(char symbol) {
        return symbol == 'a' || symbol == 'o' || symbol == 'e' || symbol == 'i' || symbol == 'u';
    }
}

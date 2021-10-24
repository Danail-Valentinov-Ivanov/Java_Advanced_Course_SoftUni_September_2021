package exe3_Sets_and_Maps_Advanced;

import java.util.Scanner;
import java.util.TreeMap;

public class prob4_Count_Symbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Character, Integer> mapChars = new TreeMap<>();
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (mapChars.containsKey(currentChar)) {
                mapChars.put(currentChar, mapChars.get(currentChar) + 1);
            } else {
                mapChars.put(currentChar, 1);
            }
        }
        mapChars.entrySet().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue() + " time/s"));
    }
}

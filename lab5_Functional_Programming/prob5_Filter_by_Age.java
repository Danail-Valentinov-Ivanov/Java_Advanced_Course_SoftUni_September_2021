package lab5_Functional_Programming;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Predicate;

public class prob5_Filter_by_Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> mapNames = new LinkedHashMap<>();
        while (input-- > 0) {
            String[] currentLine = scanner.nextLine().split(",\\s+");
            String name = currentLine[0];
            int age = Integer.parseInt(currentLine[1]);
            mapNames.put(name, age);
        }
        String condition = scanner.nextLine();
        int conditionAge = Integer.parseInt(scanner.nextLine());
        Predicate<Integer> predicate = currentAge -> {
            switch (condition) {
                case "older":
                    if (currentAge >= conditionAge) {
                        return true;
                    }
                    break;
                case "younger":
                    if (currentAge <= conditionAge) {
                        return true;
                    }
                    break;
            }
            return false;
        };
        String command = scanner.nextLine();
        for (var entry : mapNames.entrySet()) {
            if (predicate.test(entry.getValue())) {
                switch (command) {
                    case "name age":
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                        break;
                    case "name":
                        System.out.println(entry.getKey());
                        break;
                    case "age":
                        System.out.println(entry.getValue());
                        break;
                }
            }
        }
    }
}

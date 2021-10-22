package lab3_Sets_and_Maps_Advanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class prob4_Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<Double, Integer> mapDigits = new LinkedHashMap<>();
        double[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();
        for (double element : input) {
            if (mapDigits.containsKey(element)) {
                mapDigits.put(element, mapDigits.get(element) + 1);
            } else {
                mapDigits.put(element, 1);
            }
        }
        mapDigits.entrySet().forEach(e -> System.out.printf("%.1f -> %d\n", e.getKey(), e.getValue()));
    }
}

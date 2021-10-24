package exe3_Sets_and_Maps_Advanced;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class prob6_A_Miner_Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> mapResources = new LinkedHashMap<>();
        String input = scanner.nextLine();
        int countInput = 0;
        String resource = "";
        int quantity = 0;
        while (!input.equals("stop")) {
            countInput++;
            if (countInput % 2 == 1) {
                resource = input;
            } else {
                quantity = Integer.parseInt(input);
            }
            if (countInput % 2 == 0) {
                if (!mapResources.containsKey(resource)) {
                    mapResources.put(resource, quantity);
                } else {
                    mapResources.put(resource, mapResources.get(resource) + quantity);
                }
            }
            input = scanner.nextLine();
        }
        mapResources.entrySet().forEach(e -> System.out.println(e.getKey() + " -> " + e.getValue()));
    }
}

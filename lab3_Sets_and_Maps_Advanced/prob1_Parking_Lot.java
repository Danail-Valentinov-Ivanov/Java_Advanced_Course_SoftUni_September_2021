package lab3_Sets_and_Maps_Advanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class prob1_Parking_Lot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String random = scanner.nextLine();
        Set<String> setCarNumbers = new LinkedHashSet<>();
        while (!random.equals("END")) {
            String[] input = random.split(",\\s+");
            String direction = input[0];
            String carNumber = input[1];
            switch (direction) {
                case "IN":
                    setCarNumbers.add(carNumber);
                    break;
                case "OUT":
                    setCarNumbers.remove(carNumber);
                    break;
            }
            random = scanner.nextLine();
        }
        if (!setCarNumbers.isEmpty()) {
            for (String e : setCarNumbers) {
                System.out.println(e);
            }
        } else {
            System.out.println("Parking Lot is Empty");
        }
    }
}

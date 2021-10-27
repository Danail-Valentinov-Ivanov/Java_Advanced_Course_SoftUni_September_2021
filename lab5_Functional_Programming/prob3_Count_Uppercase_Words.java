package lab5_Functional_Programming;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class prob3_Count_Uppercase_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayInput = scanner.nextLine().split("\\s+");
        Predicate<String> isWordUpperCase = e -> {
            boolean isUpper = false;
            if (Character.isUpperCase(e.charAt(0))) {
                isUpper = true;
            }
            return isUpper;
        };
        int count = 0;
        for (String word : arrayInput) {
            if (isWordUpperCase.test(word)) {
                count++;
            }
        }
        System.out.println(count);
        for (String word : arrayInput) {
            if (isWordUpperCase.test(word)) {
                System.out.println(word);
            }
        }
    }
}

package exe5_Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class prob6_Predicate_for_Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputLength = Integer.parseInt(scanner.nextLine());
        String[] inputStr = scanner.nextLine().split("\\s+");
        Predicate<String> predicate = word -> word.length() <= inputLength;
//        for (String word : inputStr) {
//            if (predicate.test(word)) {
//                System.out.println(word);
//            }
//        }
//        or
        Arrays.stream(inputStr).filter(predicate).forEach(e -> System.out.println(e));
    }
}

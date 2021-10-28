package exe5_Functional_Programming;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class prob9_List_of_Predicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        List<Integer> listNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        BiPredicate<List<Integer>, Integer> predicate = (list, i) -> {
            for (Integer element : list) {
                if (i % element != 0) {
                    return false;
                }
            }
            return true;
        };
        for (int i = 1; i <= input; i++) {
            if (predicate.test(listNumbers, i)) {
                System.out.print(i + " ");
            }
        }
    }
}

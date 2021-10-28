package exe5_Functional_Programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class prob8_Custom_Comparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> listNumbers = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        Comparator<Integer> comparator = (first, second) -> {
            if (first % 2 == 0 && second % 2 != 0) {
                return -1;
            } else if (first % 2 != 0 && second % 2 == 0) {
                return 1;
            } else {
                return first.compareTo(second);
            }
        };
        listNumbers.stream().sorted(comparator).forEach(e -> System.out.print(e + " "));
    }
}

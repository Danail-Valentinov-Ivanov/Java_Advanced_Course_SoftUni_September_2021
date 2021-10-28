package exe5_Functional_Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class prob5_Reverse_and_Exclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        List<Integer> listNumbers = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        Collections.reverse(listNumbers);
        Predicate<Integer> predicate = number -> number % num == 0;
        listNumbers.removeIf(predicate);
        listNumbers.forEach(e -> System.out.print(e + " "));
    }
}

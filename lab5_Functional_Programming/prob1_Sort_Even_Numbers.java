package lab5_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class prob1_Sort_Even_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listIntegers = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        List<Integer> listEvenNums = listIntegers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        String firstStr = listEvenNums.stream().map(e -> String.valueOf(e))
                .collect(Collectors.joining(", "));
        System.out.println(firstStr);
        String secondStr = listEvenNums.stream().sorted().map(e -> String.valueOf(e))
                .collect(Collectors.joining(", "));
        System.out.println(secondStr);
    }
}

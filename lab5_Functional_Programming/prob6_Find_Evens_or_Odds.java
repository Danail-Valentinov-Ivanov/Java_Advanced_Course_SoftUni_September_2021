package lab5_Functional_Programming;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class prob6_Find_Evens_or_Odds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listDigits = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        int startNumber = listDigits.get(0);
        int endNumber = listDigits.get(listDigits.size() - 1);
        String condition = scanner.nextLine();
        Predicate<Integer> evenOrOdd = condition.equals("even") ? n -> n % 2 == 0 : n -> n % 2 != 0;
        printNumbers(startNumber, endNumber, evenOrOdd);
    }

    private static void printNumbers(int startNumber, int endNumber, Predicate<Integer> evenOrOdd) {
        System.out.println(IntStream.rangeClosed(startNumber, endNumber).boxed().filter(evenOrOdd)
                .map(e -> String.valueOf(e)).collect(Collectors.joining(" ")));
    }
}

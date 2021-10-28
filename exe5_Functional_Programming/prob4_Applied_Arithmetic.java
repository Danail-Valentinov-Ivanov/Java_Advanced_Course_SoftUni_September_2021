package exe5_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class prob4_Applied_Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> listNumbers = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> add = list -> list.stream().map(number -> number += 1)
                .collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> multiply = list -> list.stream().map(number -> number *= 2)
                .collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> subtract = list -> list.stream().map(number -> number -= 1)
                .collect(Collectors.toList());
        Consumer<List<Integer>> print = list -> list.stream().forEach(number -> System.out.print(number + " "));

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("end")) {
            switch (commandLine) {
                case "add":
                    listNumbers = add.apply(listNumbers);
                    break;
                case "multiply":
                    listNumbers = multiply.apply(listNumbers);
                    break;
                case "subtract":
                    listNumbers = subtract.apply(listNumbers);
                    break;
                case "print":
                    print.accept(listNumbers);
                    System.out.println();
                    break;
            }
            commandLine = scanner.nextLine();
        }
    }
}

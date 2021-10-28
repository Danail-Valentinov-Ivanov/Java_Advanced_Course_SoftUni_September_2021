package exe5_Functional_Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class prob7_Find_the_Smallest_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listNumbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>, Integer> function = list -> list.lastIndexOf(Collections.min(list));
        System.out.println(function.apply(listNumbers));
    }
}

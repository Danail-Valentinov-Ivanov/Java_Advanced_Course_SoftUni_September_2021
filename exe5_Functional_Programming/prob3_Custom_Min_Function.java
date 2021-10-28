package exe5_Functional_Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class prob3_Custom_Min_Function {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> listNumbers = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>, Integer> getMinNum = list -> Collections.min(list);
        System.out.println(getMinNum.apply(listNumbers));
    }
}

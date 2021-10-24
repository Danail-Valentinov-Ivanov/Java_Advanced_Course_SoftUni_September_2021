package exe3_Sets_and_Maps_Advanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class prob2_Sets_of_Elements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int lengthN = input[0];
        int lengthM = input[1];
        LinkedHashSet<Integer> setN = new LinkedHashSet<>();
        LinkedHashSet<Integer> setM = new LinkedHashSet<>();
        LinkedHashSet<Integer> setOutput = new LinkedHashSet<>();
        for (int i = 0; i < lengthN; i++) {
            setN.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int i = 0; i < lengthM; i++) {
            setM.add(Integer.parseInt(scanner.nextLine()));
        }
        for (int e : setN) {
            if (setM.contains(e)) {
                setOutput.add(e);
            }
        }
        setOutput.forEach(e -> System.out.print(e + " "));
        //може да се ползва метода по-долу
        //в първия сет остават само елементите, които ги има във втория
//        setN.retainAll(setM);
//        setN.forEach(e -> System.out.print(e + " "));
    }
}

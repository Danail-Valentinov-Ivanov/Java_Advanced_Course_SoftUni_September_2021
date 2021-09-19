package exe1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class prob1_Reverse_Numbers_with_a_Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (String e : input) {
            stack.push(Integer.parseInt(e));
        }
        for (Integer e : stack) {
            System.out.print(e + " ");
        }
    }
}

package lab1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class prob2_Simple_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stack = new ArrayDeque<>();
        String[] line = scanner.nextLine().split("\\s+");
        for (int i = 0; i < line.length / 2; i++) {
            String currentValue = line[(line.length - 1) - i];
            line[(line.length - 1) - i] = line[i];
            line[i] = currentValue;
        }
        for (String e : line) {
            stack.push(e);
        }
        while (stack.size() > 1) {
            int firstValue = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int secondValue = Integer.parseInt(stack.pop());
            switch (operator) {
                case "+":
                    stack.push(String.valueOf(firstValue + secondValue));
                    break;
                case "-":
                    stack.push(String.valueOf(firstValue - secondValue));
                    break;
            }
        }
        System.out.println(stack.peek());
    }
}

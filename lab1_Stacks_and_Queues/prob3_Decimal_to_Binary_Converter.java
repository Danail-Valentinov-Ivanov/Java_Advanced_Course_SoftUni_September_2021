package lab1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class prob3_Decimal_to_Binary_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int decimalValue = Integer.parseInt(scanner.nextLine());
        if (decimalValue == 0) {
            System.out.println(0);
        } else {
            while (decimalValue != 0) {
                stack.push(decimalValue % 2);
                decimalValue /= 2;
            }
        }
        for (Integer e : stack) {
            System.out.print(e);
        }
    }
}

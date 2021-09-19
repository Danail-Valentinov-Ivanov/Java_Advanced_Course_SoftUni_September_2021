package exe1_Stacks_and_Queues;

import java.util.Scanner;

public class prob6_Recursive_Fibonacci {
    public static long[] arrayFib;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        arrayFib = new long[number + 1];
        System.out.println(fib(number));
    }

    private static long fib(int number) {
        if (number <= 1) {
            return 1;
        }
        if (arrayFib[number] != 0) {
            return arrayFib[number];
        }
        arrayFib[number] = fib(number - 1) + fib(number - 2);
        return arrayFib[number];
    }
}

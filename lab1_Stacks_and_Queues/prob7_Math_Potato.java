package lab1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class prob7_Math_Potato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayNames = scanner.nextLine().split("\\s+");
        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> queueNames = new ArrayDeque<>();
        for (String e : arrayNames) {
            queueNames.offer(e);
        }
        int cycle = 1;
        while (queueNames.size() > 1) {
            for (int i = 1; i < number; i++) {
                queueNames.offer(queueNames.poll());
            }
            if (isPrime(cycle)) {
                System.out.println("Prime " + queueNames.peek());
            } else {
                System.out.println("Removed " + queueNames.poll());
            }
            cycle++;
        }
        System.out.printf("Last is %s\n", queueNames.peek());
    }

    private static boolean isPrime(int cycle) {
        boolean isPrime = false;
        int count = 0;
        for (int i = 1; i <= cycle; i++) {
            if (cycle % i == 0) {
                count++;
                if (count > 2) {
                    break;
                }
            }
        }
        if (count == 2) {
            isPrime = true;
        }
        return isPrime;
    }
}

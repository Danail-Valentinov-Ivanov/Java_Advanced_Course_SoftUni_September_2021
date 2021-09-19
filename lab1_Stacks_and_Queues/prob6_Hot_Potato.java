package lab1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class prob6_Hot_Potato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayNames = scanner.nextLine().split("\\s+");
        int number = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> queueNames = new ArrayDeque<>();
        for (String e : arrayNames) {
            queueNames.offer(e);
        }
        while (queueNames.size() > 1) {
            for (int i = 1; i < number; i++) {
                queueNames.offer(queueNames.poll());
            }
            System.out.printf("Removed %s\n", queueNames.poll());
        }
        System.out.printf("Last is %s\n", queueNames.peek());
    }
}

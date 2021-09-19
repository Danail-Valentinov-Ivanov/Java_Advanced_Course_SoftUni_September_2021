package lab1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class prob5_Printer_Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> printQueue = new ArrayDeque<>();
        String input = scanner.nextLine();
        while (!input.equals("print")) {
            if (!input.equals("cancel")) {
                printQueue.offer(input);
            } else {
                if (printQueue.size() != 0) {
                    System.out.printf("Canceled %s\n", printQueue.poll());
                } else {
                    System.out.println("Printer is on standby");
                }
            }
            input = scanner.nextLine();
        }
        for (String e : printQueue) {
            System.out.println(e);
        }
    }
}

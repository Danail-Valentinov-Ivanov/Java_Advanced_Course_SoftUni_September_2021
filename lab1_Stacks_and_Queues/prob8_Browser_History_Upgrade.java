package lab1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class prob8_Browser_History_Upgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> browser = new ArrayDeque<>();
        ArrayDeque<String> forwardPages = new ArrayDeque<>();
        String input = scanner.nextLine();
        String current = "";
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (!browser.isEmpty()) {
                    forwardPages.addFirst(current);
                    current = browser.pop();
                } else {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                }
            } else if (input.equals("forward")) {
                if (!forwardPages.isEmpty()) {
                    current = forwardPages.poll();
                } else {
                    System.out.println("no next URLs");
                    input = scanner.nextLine();
                    continue;
                }
            } else {
                forwardPages.clear();
                if (!current.equals("")) {
                    browser.push(current);
                }
                current = input;
            }
            System.out.println(current);
            input = scanner.nextLine();
        }
    }
}

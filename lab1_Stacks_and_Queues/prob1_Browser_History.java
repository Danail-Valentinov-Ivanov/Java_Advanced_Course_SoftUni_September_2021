package lab1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class prob1_Browser_History {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> browser = new ArrayDeque<>();
        String input = scanner.nextLine();
        String current = "";
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (!browser.isEmpty()) {
                    current = browser.pop();
                } else {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                }
            } else {
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

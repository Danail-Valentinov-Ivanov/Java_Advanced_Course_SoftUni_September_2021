package exe1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class prob3_Maximum_Element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < numCommands; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String currentCommand = command[0];
            switch (currentCommand) {
                case "1":
                    int addElement = Integer.parseInt(command[1]);
                    stack.push(addElement);
                    break;
                case "2":
                    stack.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(stack));
                    break;
            }
        }
    }
}

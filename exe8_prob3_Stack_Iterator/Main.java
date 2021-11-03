package exe8_prob3_Stack_Iterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        String commandLine = scanner.nextLine();
        while (!commandLine.equals("END")) {
            String[] arrStr = commandLine.split("\\s+");
            String command = arrStr[0];
            switch (command) {
                case "Push":
                    for (int i = 1; i < arrStr.length; i++) {
                        char temp = arrStr[i].charAt(0);
                        String element = "" + temp;
                        stack.push(Integer.parseInt(element));
                    }
                    break;
                case "Pop":
                    try {
                        stack.pop();
                    } catch (Exception e) {
                        System.out.println("No elements");
                    }
                    break;
            }
            commandLine = scanner.nextLine();
        }
        for (int i = 1; i <= 2; i++) {
            for (Integer element : stack) {
                System.out.println(element);
            }
        }
    }
}

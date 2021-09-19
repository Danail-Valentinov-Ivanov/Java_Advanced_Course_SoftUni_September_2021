package exe1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class prob5_Balanced_Parentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");

        ArrayDeque<String> openBrackets = new ArrayDeque<>();
        boolean areBalanced = false;
        for (int index = 0; index < input.length; index++) {
            String currentBracket = input[index];
            if (currentBracket.equals("(") || currentBracket.equals("{") || currentBracket.equals("[")) {
                openBrackets.push(currentBracket);
            } else if (currentBracket.equals(")") || currentBracket.equals("}") || currentBracket.equals("]")) {
                if (openBrackets.isEmpty()) {
                    areBalanced = false;
                    break;
                }
                String lastOpenBracket = openBrackets.pop();
                if (lastOpenBracket.equals("(") && currentBracket.equals(")")) {
                    areBalanced = true;
                } else if (lastOpenBracket.equals("{") && currentBracket.equals("}")) {
                    areBalanced = true;
                } else if (lastOpenBracket.equals("[") && currentBracket.equals("]")) {
                    areBalanced = true;
                } else {
                    areBalanced = false;
                    break;
                }
            }
        }
        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

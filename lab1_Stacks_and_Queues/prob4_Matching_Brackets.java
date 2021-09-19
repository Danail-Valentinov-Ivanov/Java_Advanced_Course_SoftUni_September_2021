package lab1_Stacks_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class prob4_Matching_Brackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        StringBuilder substringExpression = new StringBuilder();
        String[] expression = scanner.nextLine().split("");
        for (int i = 0; i < expression.length; i++) {
            if (expression[i].equals("(")) {
                stack.push(i);
            } else if (expression[i].equals(")")) {
                int startIndex = stack.pop();
                substringExpression.setLength(0);
                for (int j = 0; j <= i - startIndex; j++) {
                    substringExpression.append(expression[startIndex + j]);
                }
                System.out.println(substringExpression);
            }
        }
    }
}

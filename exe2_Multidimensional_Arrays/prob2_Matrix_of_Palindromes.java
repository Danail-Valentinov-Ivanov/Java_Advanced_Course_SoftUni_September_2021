package exe2_Multidimensional_Arrays;

import java.util.Scanner;

public class prob2_Matrix_of_Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//aaa aba
//bbb bcb
//ccc cdc
        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];
        matrix = getMatrix(matrix, scanner);
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] e1 : matrix) {
            for (String e2 : e1) {
                System.out.print(e2 + " ");
            }
            System.out.println();
        }
    }

    private static String[][] getMatrix(String[][] matrix, Scanner scanner) {
        StringBuilder palindrome = new StringBuilder();
        for (int row = 0; row < matrix.length; row++) {
            char firstAndLastChar = (char) (row + 97);
            for (int col = 0; col < matrix[row].length; col++) {
                char middleChar = (char) (row + col + 97);
                palindrome.setLength(0);
                for (int i = 0; i < 3; i++) {
                    if (i == 0) {
                        palindrome.append(firstAndLastChar);
                    } else if (i == 1) {
                        palindrome.append(middleChar);
                    } else {
                        palindrome.append(firstAndLastChar);
                    }
                }
                matrix[row][col] = palindrome.toString();
            }
        }
        return matrix;
    }
}

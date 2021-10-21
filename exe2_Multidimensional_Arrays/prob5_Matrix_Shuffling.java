package exe2_Multidimensional_Arrays;

import java.util.Scanner;

public class prob5_Matrix_Shuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
        String commandLine = scanner.nextLine();
        while (!commandLine.equals("END")) {
            String[] command = commandLine.split("\\s+");
            if (command.length == 5) {
                int row1 = Integer.parseInt(command[1]);
                int col1 = Integer.parseInt(command[2]);
                int row2 = Integer.parseInt(command[3]);
                int col2 = Integer.parseInt(command[4]);
                if (isValidCoordinates(row1, col1, row2, col2, rows, cols) && command[0].equals("swap")) {
                    String tempValue = matrix[row1][col1];
                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = tempValue;
                    printMatrix(matrix);
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }
            commandLine = scanner.nextLine();
        }
        System.out.println();
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] e1 : matrix) {
            for (String e2 : e1) {
                System.out.print(e2 + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValidCoordinates(int row1, int col1, int row2, int col2, int rows, int cols) {
        if ((row1 >= 0 && row1 < rows && col1 >= 0 && col1 < cols)
                && (row2 >= 0 && row2 < rows && col2 >= 0 && col2 < cols)) {
            return true;
        }
        return false;
    }
}

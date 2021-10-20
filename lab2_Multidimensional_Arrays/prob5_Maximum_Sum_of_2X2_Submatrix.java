package lab2_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class prob5_Maximum_Sum_of_2X2_Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] size = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] currentRow = Arrays.stream(scanner.nextLine().split(",\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = currentRow[col];
            }
        }
        int sum = 0;
        int firstRowIndex = 0;
        int firstColIndex = 0;
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                int currentSum = matrix[row][col] + matrix[row + 1][col] + matrix[row][col + 1]
                        + matrix[row + 1][col + 1];
                if (currentSum > sum) {
                    sum = currentSum;
                    firstRowIndex = row;
                    firstColIndex = col;
                }
            }
        }
        for (int row = firstRowIndex; row < firstRowIndex + 2; row++) {
            for (int col = firstColIndex; col < firstColIndex + 2; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}

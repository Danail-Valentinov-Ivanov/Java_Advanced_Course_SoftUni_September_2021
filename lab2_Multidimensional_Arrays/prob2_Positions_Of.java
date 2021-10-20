package lab2_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class prob2_Positions_Of {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//input: 2 3
//       1 2 3
//       4 2 2
//       2
        int[] inputDimension = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rowMatrix = inputDimension[0];
        int colMatrix = inputDimension[1];
        int[][] matrix = new int[rowMatrix][colMatrix];
        for (int row = 0; row < matrix.length; row++) {
            String[] rowElements = scanner.nextLine().split("\\s+");
            for (int col = 0; col < rowElements.length; col++) {
                matrix[row][col] = Integer.parseInt(rowElements[col]);
            }
        }
        int input = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == input) {
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }
    }
}

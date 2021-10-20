package lab2_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class prob8_Wrong_Measurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//3
//1 2 4 4
//4 6 4 3
//8 9 4 2
//1 0
        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rows][];
        int cols = 0;
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
            cols = matrix[row].length;
        }
        int[][] copiedMatrix = new int[rows][cols];
        int rowWrongValue = scanner.nextInt();
        int colWrongValue = scanner.nextInt();
        int wrongValue = matrix[rowWrongValue][colWrongValue];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int sum = 0;
                if (matrix[row][col] == wrongValue) {
                    copiedMatrix[row][col] = wrongValue;
                    if ((row - 1) >= 0) {
                        if (copiedMatrix[row - 1][col] != wrongValue && matrix[row - 1][col] != wrongValue) {
                            sum += matrix[row - 1][col];
                        }
                    }
                    if ((col - 1) >= 0) {
                        if (copiedMatrix[row][col - 1] != wrongValue && matrix[row][col - 1] != wrongValue) {
                            sum += matrix[row][col - 1];
                        }
                    }
                    if ((row + 1) < matrix.length) {
                        if (copiedMatrix[row + 1][col] != wrongValue && matrix[row + 1][col] != wrongValue) {
                            sum += matrix[row + 1][col];
                        }
                    }
                    if ((col + 1) < matrix[row].length) {
                        if (copiedMatrix[row][col + 1] != wrongValue && matrix[row][col + 1] != wrongValue) {
                            sum += matrix[row][col + 1];
                        }
                    }
                    matrix[row][col] = sum;
                }
            }
        }
        for (int[] e : matrix) {
            for (int e2 : e) {
                System.out.print(e2 + " ");
            }
            System.out.println();
        }
    }
}

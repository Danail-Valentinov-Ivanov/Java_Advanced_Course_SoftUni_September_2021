package exe2_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class prob3_Diagonal_Difference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];
        matrix = getMatrixA(matrix, size, scanner);
        int sumPrimaryDiagonal = 0;
        for (int row = 0; row < size; row++) {
            //col = row
            sumPrimaryDiagonal += matrix[row][row];
        }
        int sumSecondaryDiagonal = 0;
        for (int row = size - 1; row >= 0; row--) {
            //col= (size-1)-row
            sumSecondaryDiagonal += matrix[row][size - 1 - row];
        }
        System.out.println(Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal));
    }

    private static int[][] getMatrixA(int[][] matrix, int size, Scanner scanner) {
        for (int row = 0; row < size; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}

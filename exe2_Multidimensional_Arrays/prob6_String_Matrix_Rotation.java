package exe2_Multidimensional_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prob6_String_Matrix_Rotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String substringInput = input.substring(7, input.length() - 1);
        int degreeOfRotation = Integer.parseInt(substringInput);
        int lastDegreeOfRotation = degreeOfRotation % 360;
        List<String> list = new ArrayList<>();
        String currentRow = scanner.nextLine();
        int maxLength = 0;
        while (!currentRow.equals("END")) {
            list.add(currentRow);
            if (currentRow.length() > maxLength) {
                maxLength = currentRow.length();
            }
            currentRow = scanner.nextLine();
        }
        int rowsMatrix = list.size();
        int colsMatrix = maxLength;
        String[][] matrix = new String[rowsMatrix][colsMatrix];
        for (int row = 0; row < rowsMatrix; row++) {
            String[] word = list.get(row).split("");
            for (int col = 0; col < colsMatrix; col++) {
                if (col < word.length) {
                    matrix[row][col] = word[col];
                } else {
                    matrix[row][col] = " ";
                }
            }
        }
        if (lastDegreeOfRotation == 90) {
            for (int col = 0; col < colsMatrix; col++) {
                for (int row = rowsMatrix - 1; row >= 0; row--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }

        } else if (lastDegreeOfRotation == 180) {
            for (int row = rowsMatrix - 1; row >= 0; row--) {
                for (int col = colsMatrix - 1; col >= 0; col--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else if (lastDegreeOfRotation == 270) {
            for (int col = colsMatrix - 1; col >= 0; col--) {
                for (int row = 0; row < rowsMatrix; row++) {
                    System.out.print(matrix[row][col]);

                }
                System.out.println();
            }
        } else {
            for (int row = 0; row < rowsMatrix; row++) {
                for (int col = 0; col < colsMatrix; col++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}

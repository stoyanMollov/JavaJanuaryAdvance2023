package multidimensionalArraysLab_05;

import java.util.Scanner;

public class _02_PositionOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // reading matrices, input from the console.
        String[] rowsAndCols = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);

        // Declaring the matrix
        int[][] matrix = new int[rows][cols];

        // filling the matrix
        for (int row = 0; row < rows; row++) {
            String[] columData = scanner.nextLine().split(" ");

            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(columData[col]);
            }
        }


        boolean isFound = false;
        int search = Integer.parseInt(scanner.nextLine());


        // трябва да обиколим двумерния масив и да проверим дали имаме съвпадения с даденото число.
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (matrix[row][col] == search){
                    isFound = true;
                    System.out.println(row + " " + col);
                }
            }
        }

        if (!isFound){
            System.out.println("not found");
        }
    }
}

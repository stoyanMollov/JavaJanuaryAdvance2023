package multidimensionalArraysLab_05;

import java.util.Scanner;

public class _04_SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsAndCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);

        int[][] data = new int[rows][cols];

        for (int row = 0; row < data.length; row++) {
            String[] colmData = scanner.nextLine().split(", ");

            for (int col = 0; col < data[0].length; col++) {
                data[row][col] = Integer.parseInt(colmData[col]);
            }
        }
        
        int sum = 0;
        for (int[] row : data) {
            for (int cell : row) {
                sum += cell;
            }

        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);

    }
}

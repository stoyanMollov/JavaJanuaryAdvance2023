package multidimensionalArraysLab_05;

import java.util.Scanner;

public class _05_MaximumSumOf2x2Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rowsAndCols = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsAndCols[0]);
        int cols = Integer.parseInt(rowsAndCols[1]);
        int[][] table = new int[rows][cols];

        for (int row = 0; row < table.length; row++) {
            String[] rolDate = scanner.nextLine().split(", ");

            for (int col = 0; col < table[0].length; col++) {
                table[row][col] =  Integer.parseInt(rolDate[col]);
            }
        }

        int maxSumTopLeftRow = -1;
        int maxSumStopLeftCol = -1;
        int maxSum = 0;
        for (int row = 0; row < table.length - 1; row++) {
            for (int col = 0; col < table[row].length - 1; col++) {
                int currentSum = table[row][col] + table[row][col + 1]
                        + table[row + 1][col] + table[row + 1][col + 1];

                if (currentSum > maxSum){
                    maxSum = currentSum;

                    maxSumTopLeftRow = row;
                    maxSumStopLeftCol = col;
                }
            }
        }

        System.out.println(table[maxSumTopLeftRow][maxSumStopLeftCol] + " " + table[maxSumTopLeftRow][maxSumStopLeftCol + 1]);
        System.out.println(table[maxSumTopLeftRow + 1][maxSumStopLeftCol] + " " + table[maxSumTopLeftRow + 1][maxSumStopLeftCol + 1]);
        System.out.println(maxSum);
    }
}

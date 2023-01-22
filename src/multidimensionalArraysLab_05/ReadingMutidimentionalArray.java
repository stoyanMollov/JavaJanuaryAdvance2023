package multidimensionalArraysLab_05;

import java.util.Scanner;

public class ReadingMutidimentionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(parts[0]);
        int cols = Integer.parseInt(parts[1]);

        int[][] data = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] rowNumbers = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                data[i][j] = Integer.parseInt(rowNumbers[j]);
            }
        }

        // printing the multidimensional array

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}

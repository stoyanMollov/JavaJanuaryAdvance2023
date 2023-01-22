package multidimensionalArraysLab_05;

import java.util.Scanner;

public class _03_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrices = new char[rows][cols];

        for (int row = 0; row < firstMatrices.length; row++) {
            String[] input = scanner.nextLine().split("\\s+");

            for (int col = 0; col < firstMatrices[0].length; col++) {
                firstMatrices[row][col] = input[col].charAt(0);
            }
        }

        char[][] secondMatrices = new char[rows][cols];

        for (int row = 0; row < secondMatrices.length; row++) {
            String[] input = scanner.nextLine().split("\\s+");

            for (int col = 0; col < secondMatrices[0].length; col++) {
                secondMatrices[row][col] = input[col].charAt(0);
            }
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (firstMatrices[row][col] == secondMatrices[row][col]){
                    System.out.print(firstMatrices[row][col] + " ");
                }else {
                    System.out.print("*" + " ");
                }
            }
            System.out.println();
        }
    }
}

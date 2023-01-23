package exerciseMultidimensionalArrays;

import java.util.Scanner;

public class _03_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); // брои редове = брой колони
        int[][] matrix = new int[n][n];

        // 1. напълваме матрицата
        fillMatrix(matrix, scanner);

        //2. Сума на числата на главния диагонал.
        int sumPrimary = getSumElementPrimaryDiagonal(matrix);

        //3. сумата на числата на второстепения диагонал
        int sumSecondary = getSumElementsOnSecondaryDiagonal(matrix);
        //4. принтираме абс. стоиност на разликата
        System.out.println(Math.abs((sumPrimary - sumSecondary)));
    }

    private static int getSumElementsOnSecondaryDiagonal(int[][] matrix) {
        int sum = 0; // сума на числата на второстеппения диагонал
        // обхождаме всички елементи
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                int currentElement = matrix[row][col];
                if (col == matrix.length - row - 1){
                    // елемента е на второстиппения диагонал
                    sum += currentElement;
                }
            }
        }
        return sum;
    }

    private static int getSumElementPrimaryDiagonal(int[][] matrix) {
        int sum = 0; // сума на числата на главния диагонал
        // обхождаме всички елементи
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                int currentElement = matrix[row][col];
                if (row == col){
                    // елемента е на главния диагонал
                    sum += currentElement;
                }
            }
        }
        return sum;
    }

    private static void fillMatrix(int[][] matrix, Scanner scanner) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }
}

package exerciseMultidimensionalArrays;

import java.util.Scanner;

public class _01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. входни данни
        String input = scanner.nextLine();
        int n = Integer.parseInt(input.split(", ")[0]); // брой редове е равно на брой колони.
        String pattern = input.split(", ")[1]; // шаблон за попълване A или B.
        int[][] matrix = new int[n][n];

        if (pattern.equals("A")){
            // pattern A -> обхождаме нашата матрица по колони
            fillMatrixPatternA(matrix);
        } else if (pattern.equals("B")) {
            // pattern B -> по колони
            // четна (2,4,6,8) -> от последния към първия.
            fillMatrixPatternB(matrix);
        }
        printMatrix(matrix);
    }

    private static void fillMatrixPatternB(int[][] matrix) {
        int startNumber = 1; // числа за попълване на матрицата
        for (int col = 0; col < matrix.length; col++) {
            if ((col + 1) % 2 ==0){
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = startNumber;
                    startNumber++;
                }
            }else {
                for (int row = 0; row <= matrix.length - 1; row++) {
                   matrix[row][col] = startNumber;
                   startNumber++;
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrixPatternA(int[][] matrix) {

        int startNumber = 1;
        // бр. редове е равен на бр. колони
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] =  startNumber;
                startNumber++;
            }
        }
    }
}

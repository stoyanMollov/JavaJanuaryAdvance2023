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

        
    }
}

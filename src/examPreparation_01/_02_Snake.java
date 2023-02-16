package examPreparation_01;

import java.util.Scanner;

public class _02_Snake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[n][];

        for (int i = 0; i < field.length; i++) {
            field[i] = scanner.nextLine().toCharArray();
        }
        System.out.println();
        
    }
}

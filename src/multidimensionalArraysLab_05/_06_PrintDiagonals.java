package multidimensionalArraysLab_05;

import java.util.Arrays;
import java.util.Scanner;

public class _06_PrintDiagonals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[size][];

        for (int row = 0; row < size; row++) {
            String[] columDate = scanner.nextLine().split(" ");

           // for (int col = 0; col < columDate.length; col++) {
            //    currentRow[col] = Integer.parseInt(columDate[col]);
           // }

            // with Arrays.stream -> правим същото което правим с for цикъла,
            // обхождаме масива и за всеки елемент извършваме операция, и накрая получаваме масив като резултат
            int[] currentRow = Arrays.stream(columDate)
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = currentRow;
        }

   //     for (int row = 0; row < matrix.length; row++) {
   //         for (int col = 0; col < matrix[row].length; col++) {
  //              if (row == col){
  //                  System.out.println(matrix[row][col]);
  //              }
  //          }
 //       }

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();

        for (int row = size - 1, col = 0; col < size; row--,col++) {
            System.out.print(matrix[row][col] + " ");
        }
    }
}

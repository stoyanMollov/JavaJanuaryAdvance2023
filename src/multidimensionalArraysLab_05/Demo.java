package multidimensionalArraysLab_05;

public class Demo {
    public static void main(String[] args) {
        int[][] table = new int[3][2];

//        System.out.println(table.length);
//        System.out.println(table[0].length);

        char[][] array = new char[3][4];

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                String str = ".B..";
                char[] symbols = str.toCharArray();
                array[row][col] = symbols[col];
            }
        }
        System.out.println();

//        for (int i = 0; i < table.length; i++) {
//            for (int j = 0; j < table[0].length; j++) {
//                table[i][j] = i + j;
//            }
//        }
//
//        for (int i = 0; i < table.length; i++) {
//            for (int j = 0; j < table[0].length; j++) {
//                System.out.print(table[i][j] + " ");
//            }
            System.out.println();
        }

    }

package examPreparation_01;

import java.util.Scanner;

public class _02_Snake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[n][];
        int snakeRow = -1, snakeCol = -1;
        int lairFirstRow = -1, lairFirstCol = -1,
            lairSecondRow = -1, lairSecondCol = -1;

        // определяме позицията с S
        for (int i = 0; i < field.length; i++) {
            String row = scanner.nextLine();
            field[i] = row.toCharArray();
            int maybeSnakeCol = row.indexOf('S');
            if (maybeSnakeCol > -1) {
                snakeRow = i;
                snakeCol = maybeSnakeCol;
            }

            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == 'S') {
                    snakeRow = i;
                    snakeCol = j;
                }
            }

            //определяме позицията B
            int maybeLairCol = row.indexOf('B');
            if (maybeLairCol > -1){
                if (lairFirstRow == -1){// проверка ако тази буква не сме е срещали преди.
                    lairFirstCol = i;
                    lairFirstCol = maybeLairCol;
                }else { // ако сме срещали вече буквата.
                    lairSecondRow = i;
                    maybeLairCol = maybeLairCol;
                }
            }
            field[i] = row.toCharArray();
        }

        int foodEaten = 0;
        while (foodEaten < 10){

            String command = scanner.nextLine();
            field[snakeRow][snakeCol] = '.';
            switch (command){
                case "left": snakeCol--; break;
                case "right": snakeCol++; break;
                case "down": snakeRow++; break;
                case "up": snakeRow--; break;
            }

            if (snakeRow < 0 || snakeRow >= n||
                snakeCol < 0 || snakeCol >= n){ // проверка дали сме в границите на полето
                break;
            }
            if(field[snakeRow][snakeCol] == '*'){
                foodEaten++;
            }

            if (snakeRow == lairFirstRow && snakeCol == lairFirstCol){
                // ако сме намерили първата буква, местим змята на посицията на втората буква
                field[snakeRow][snakeCol] = '.';
                snakeRow = lairSecondRow;
                snakeCol = lairSecondCol;
            }else if (snakeRow == lairSecondRow && snakeCol == lairSecondCol){
                field[snakeRow][snakeCol] = '.';
                // ако сме попадмали на позицията на вотрата буква местим змията на позицията на първата буква.
                snakeRow = lairFirstRow;
                snakeCol = lairFirstCol;
             }

                field[snakeRow][snakeCol] = 'S';

            System.out.println();

        }
        
    }
}

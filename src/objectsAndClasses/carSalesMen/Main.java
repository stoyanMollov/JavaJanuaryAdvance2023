package objectsAndClasses.carSalesMen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enginesCount = Integer.parseInt(scanner.nextLine());
        for (int engineCount = 0; engineCount <= enginesCount; engineCount++) {
            //"{Model} {Power} {Displacement} {Efficiency}"

            String[] engineData = scanner.nextLine().split("\\s+");
            //required:
            String model = engineData[0];
            int power = Integer.parseInt(engineData[1]);
            //Optional:
            int displacement = 0;
            String efficiency = null;

            // проверка да ли сами въведени displacement и efficiency;
            if (engineData.length == 4){
                //displacement и efficiency са въведени
                displacement = Integer.parseInt(engineData[2]);
                efficiency = engineData[3];
            }else if (engineData.length == 3){
                if (Character.isDigit(engineData[2].charAt(0))){
                    displacement = Integer.parseInt(engineData[2]);
                }else {
                    efficiency =engineData[2];
                }
            }

            Engin engin = new Engin(model, power, displacement, efficiency);
        }
    }
}

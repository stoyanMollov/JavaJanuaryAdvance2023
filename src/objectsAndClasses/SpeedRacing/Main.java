package objectsAndClasses.SpeedRacing;

import org.w3c.dom.DOMImplementation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCars = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= countCars; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            //"{Model} {FuelAmount} {FuelCostFor1km}"
            String model = data[0];
            int fuelAmount = Integer.parseInt(data[1]);
            double priceFuelPerKm = Double.parseDouble(data[2]);

            //създаваме обект от конструктура.
            Car car = new Car(model, fuelAmount, priceFuelPerKm);
        }
    }
}

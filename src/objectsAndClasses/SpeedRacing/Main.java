package objectsAndClasses.SpeedRacing;

import org.w3c.dom.DOMImplementation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCars = Integer.parseInt(scanner.nextLine());
        Map<String,Car> cars = new LinkedHashMap<>();

        for (int i = 0; i <= countCars; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            //"{Model} {FuelAmount} {FuelCostFor1km}"
            String model = data[0];
            double fuelAmount = Double.parseDouble(data[1]);
            double priceFuelPerKm = Double.parseDouble(data[2]);

            //създаваме обект от конструктура.
            Car car = new Car(model, fuelAmount, priceFuelPerKm);
            cars.put(model,car);
            //TODO: Къде ще съхраняваме въведените коли
        }
        String command = new String(scanner.nextLine());
        while (!command.equals("End")){
            //"Drive {CarModel} {amountOfKm}"
            String carModelToDrive = command.split("\\s+")[1];
            int kmToDrive = Integer.parseInt(command.split("\\s+")[2]);


            //вьимам коя кола ще карам
            Car carToDrive = cars.get(carModelToDrive);
            if (!carToDrive.drive(kmToDrive)){
                System.out.println("Insufficient fuel for the drive");
            }
            command = scanner.nextLine();
        }
        for (Car car : cars.values()) {
            System.out.println(car);
        }
    }
}

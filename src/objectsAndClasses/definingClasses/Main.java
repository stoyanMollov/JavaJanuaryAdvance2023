package objectsAndClasses.definingClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            Car car = new Car();
            car.setBrand(input[0]);
            car.setModel(input[1]);
            car.setHorsePower(Integer.parseInt(input[2]));

            System.out.println(car.carInfo());
        }

        }
        public static void test(){
            Car firstCar = new Car();
            Car secondCar = new Car();

            firstCar.setBrand("Opel");
            firstCar.setModel("Astra");
            firstCar.setHorsePower(90);

            secondCar.setBrand("Shkoda");

            String firstFormat = String.format("The car is: %s %s - %d HP"
                    ,firstCar.getBrand(),firstCar.getMethod(),firstCar.getHorsePower());

            System.out.println(firstCar);
            System.out.println(firstCar.carInfo());
        }
    }

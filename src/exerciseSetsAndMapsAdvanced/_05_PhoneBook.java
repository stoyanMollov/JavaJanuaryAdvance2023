package exerciseSetsAndMapsAdvanced;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> names = new HashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("search")){

            String name = input.split("-")[0];
            String number = input.split("-")[1];
            names.put(name,number);

            input = scanner.nextLine();
        }

        String name = scanner.nextLine();
        while (!name.equals("stop")){

            if (names.containsKey(name)){
                System.out.println(name + " -> " + names.get(name));
            }else {
                System.out.printf("Contact %s does not exist.%n", name);
            }

            name = scanner.nextLine();
        }
    }
}

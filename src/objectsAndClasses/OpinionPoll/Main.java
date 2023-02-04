package objectsAndClasses.OpinionPoll;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Pearson> pearsons = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Pearson pearson = new Pearson(name,age);
            pearsons.add(pearson);
        }
        //филтриране на списъка, само хората над 30 години
        pearsons = pearsons.stream().filter(pearson -> pearson.getAge() > 30).collect(Collectors.toList());

        //сортиране на списъка по имена
        pearsons.sort(Comparator.comparing(pearson -> pearson.getName()));

        // отпечатване
        for (Pearson pearson : pearsons) {
            System.out.println(pearson.toString());
        }
    }
}

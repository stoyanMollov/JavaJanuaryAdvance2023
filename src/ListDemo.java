import java.util.*;

public class ListDemo {
    public static void main(String[] args) {

        Map<String, Integer> names = new HashMap<>();


        names.forEach((key, value) -> System.out.println(key + " - " + value));
    }
}

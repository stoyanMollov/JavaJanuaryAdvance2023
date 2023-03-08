package exerciseSetsAndMapsAdvanced;

import java.util.Scanner;
import java.util.TreeMap;

public class _04_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        TreeMap<Character, Integer> symbolsCount = new TreeMap<>();
        //символ -> бр. срещанията

        for (int index = 0; index < text.length(); index++) {
            char currentSymbol = text.charAt(index);
            //символът вече да съм го срещала
            if (symbolsCount.containsKey(currentSymbol)) {
                int currentCount = symbolsCount.get(currentSymbol);
                symbolsCount.put(currentSymbol, currentCount + 1);
            }//символът да не съм го срещала
            else {
                symbolsCount.put(currentSymbol, 1);
            }
        }
        //символ: бр.срещания time/s
        symbolsCount.forEach((key, value) ->
                System.out.println(key + ": " + value + " time/s"));

    }
}

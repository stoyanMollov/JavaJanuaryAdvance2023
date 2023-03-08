package regularExam;

import java.util.*;

public class _01_ApocalypsePreparation {
    private static final int PATCH = 30;
    private static final int BANDAGE = 40;
    private static final int MEDKIT = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textilesInfo = scanner.nextLine().split(" ");
        Deque<Integer> textiles = new ArrayDeque<>();
        Map<String, Integer> itemsAlphabetic = new TreeMap<>();

        for (String textile : textilesInfo) {
            textiles.offer(Integer.parseInt(textile));
        }

        String[] medicalInfo = scanner.nextLine().split(" ");
        Deque<Integer> medicals = new ArrayDeque<>();
        for (String medical : medicalInfo) {
            medicals.push(Integer.parseInt(medical));
        }

        itemsAlphabetic.put("MedKit", 0);
        itemsAlphabetic.put("Bandage", 0);
        itemsAlphabetic.put("Patch", 0);
        int caountMediKit = 0, countPatch = 0, countBandage = 0;
        int difference = 0;
        while (!textiles.isEmpty() || !medicals.isEmpty()) {

            Integer text = textiles.poll();
            Integer medical = medicals.pop();

            int possibleDish = text + medical;

            if (difference > 0){
                int medicalElement = medicals.pop();
                int result = medicalElement + difference;
                medicals.push(result);
            }

            switch (possibleDish){
                case MEDKIT:
                    caountMediKit++;
                    int name = itemsAlphabetic.put("MedKit", itemsAlphabetic.get("MedKitMedKit") + caountMediKit);
                    break;
                case PATCH:
                    countPatch++;
                    itemsAlphabetic.put("Patch", itemsAlphabetic.get("Patch") + countPatch);
                    break;
                case BANDAGE:
                    countBandage++;
                    itemsAlphabetic.put("Bandage", itemsAlphabetic.get("Bandage") + countBandage);
                    break;
                default:
                    if (possibleDish > MEDKIT){
                        caountMediKit++;
                        difference = possibleDish - MEDKIT;
                    }
                    break;
            }

        }

        if (textiles.isEmpty()){
            System.out.print("Textiles are empty.");
        }
        if (medicals.isEmpty()){
            System.out.println("Medicaments are empty.");
        }
        if (textiles.isEmpty() && medicals.isEmpty()){
            System.out.println("Textiles and medicaments are both empty.");
        }

            if (itemsAlphabetic.get("MedKit") > 0){
                System.out.printf("%s - %d", itemsAlphabetic.keySet(),itemsAlphabetic.get("MedKit"));
        }
        System.out.println();
    }
}

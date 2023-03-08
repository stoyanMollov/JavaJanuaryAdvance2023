package examPreparation_01.christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bag {
    private String color;
    private int capacity;
    private List<Present> data;

    public Bag(String color, int capacity) { //инициализация на полетата
        this.color = color;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public int count(){
        return this.data.size();
    }

    public void add(Present present){
        if (this.count() >= this.capacity){
            return;
        }

        this.data.add(present);
    }

    public boolean remove(String name){
        return this.data.removeIf(p -> p.getName().equals(name));
    }

    public Present heaviestPresent(){

        Present heaviest = this.data.get(0);
        for (Present present : data) {
            if (present.getWeight() > heaviest.getWeight()){
                heaviest = present;
            }
            return present;
        }
//        return this.data.
//                stream()
//                .sorted((l, r) -> Double.compare(r.getWeight(), l.getWeight()))
//                .limit(1)
//                .collect(Collectors.toList())
//                .get(0);
        return null;
    }

    public Present getPresent(String name){
        for (Present present : data) {
            if (present.getName().equals(name)){
                return present;
            }
        }
        return null;
    }

    public String report(){
        String presentsString = this.data
               .stream()
               .map(p -> p.toString())
               .collect(Collectors.joining("\n"));

       return String.format("%s bag contains:\n%s",
                this.color,presentsString);
    }

}

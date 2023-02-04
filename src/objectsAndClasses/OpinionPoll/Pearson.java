package objectsAndClasses.OpinionPoll;

public class Pearson {
    private String name;
    private int age;

    // конструктор
    public Pearson(String name, int age){
        this.name = name;
        this.age = age;
    }
    //getter -> връща стоиност на полето name
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return name + " - " + age;
    }
}

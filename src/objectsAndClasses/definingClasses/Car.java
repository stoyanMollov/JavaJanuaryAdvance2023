package objectsAndClasses.definingClasses;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public static String factoryName = "Berlin";
    private String brand;
    private String model;
    private int horsePower;
    private List<String> parts;

    public String getBrand(){
        return brand;
    }
    public void getBrand(String newBrand){
        brand = newBrand;
    }
    public void setBrand(String newBrand){
        brand = newBrand;
    }
    public String getMethod(){
        return model;
    }
    public void setModel(String newModel){
        model = newModel;
    }
    public int getHorsePower(){
        return horsePower;
    }
    public void setHorsePower(int newHorsePower){
        horsePower = newHorsePower;
    }

    public Car() {
        this.parts = new ArrayList<>();
    }

    public Car(String brand, String model, int horsePower){
        this();

        this.brand = brand;
        this.model = model;
        this.horsePower = horsePower;
    }
    public Car(String brand){

        this(brand, "unknown",-1);
    }

    @Override
    public String toString(){
        return String.format("The car is: %s %s - %d HP."
                ,this.getBrand(),this.getMethod(),this.getHorsePower());
    }

    public int hashCode(){
        return 5;
    }

    public String carInfo(){
        return this.toString();
    }
}


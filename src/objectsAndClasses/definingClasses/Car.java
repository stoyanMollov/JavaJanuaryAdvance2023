package objectsAndClasses.definingClasses;

public class Car {
    private String brand;
    private String model;
    private int horsePower;

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


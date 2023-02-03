package objectsAndClasses.SpeedRacing;

public class Car {
    //полета -> описваме характеристиките на нашия клас.
    private String model;
    private double fuelAmount;
    private double consumptionFuelPerKm;
    private int distanceTraveled;


    //методите -> описват действията които ще ивършва всяка една кола.
    //констуктор -> метод, чрез който ние съдаваме обекти от класа.
    public Car(String model, double fuelAmount, double consumptionFuelPerKm){
        //нов празен обект
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.consumptionFuelPerKm = consumptionFuelPerKm;
        this.distanceTraveled = 0;
    }

    public boolean drive(int kmDrive){
        //1. нужно количество да измине kmDrive
        double needFuel = kmDrive * this.consumptionFuelPerKm;
        if (needFuel <= this.fuelAmount){
            //можем да имнинем нашето разстояние
            this.fuelAmount -= needFuel;
            this.distanceTraveled = kmDrive;
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        //дава обекта под формата на текст
        return String.format("%s %.2f %d",this.model, this.fuelAmount, this.distanceTraveled);
    }
}

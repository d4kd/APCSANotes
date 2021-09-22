
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    //Things a car has:
    private String engine;
    private boolean isAutomatic;
    private int octaneNeeded;
    private double currentFuelLevel;
    private String brand;
    
    //Constructors
    public Car(String engineType, boolean isAutomatic, int octaneRating, 
    double currentFuelLevel, String brand){
        engine = engineType;
        this.isAutomatic = isAutomatic;
        octaneNeeded = octaneRating;
        this.currentFuelLevel = currentFuelLevel;
        this.brand = brand;
    }
    public Car(){
        engine = "V6";
        isAutomatic = true;
        octaneNeeded = 91;
        currentFuelLevel = 15.8;
        brand = "Toyota";
    }
    public Car(String engine){
        this(engine, true, 91, 15.8, "Toyota");
    }
    //Accessor Methods
    public String getEngine(){
        return engine;
    }
    public double getCurrentFuelLevel(){
        return currentFuelLevel;
    }
    public int getOctaneRating(){
        return octaneNeeded;
    }
    public String getBrandl(){
        return brand;
    }
    public boolean isAutomatic(){
        return isAutomatic;
    }
    public void printIsAutomatic(){
        System.out.println("Automatic? " + this.isAutomatic); //Field != ()
        System.out.println("Automatic? " + this.isAutomatic()); //Method == {}
    }
    
    //Mutator Methods
    public void setEngine(String newEngine){
        engine = newEngine;
    }
    public void toggleAutomatic(){
        if (isAutomatic){
            isAutomatic = false;
        } else{
            isAutomatic = true;
        }
    }
    public void refuel(double gasToAdd){
        currentFuelLevel += gasToAdd;
    }
    //Other Methods
    public void drive(){
        currentFuelLevel--;
        System.out.println("You drive and use 1 gallon of fuel");
    }
    public void upgradCar(){
        this.setEngine("V8");
        toggleAutomatic();
        refuel(10);
        drive();
    }
}

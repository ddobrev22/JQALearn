package Homework3;

public class car {
    private int year;
    private double price;
    private boolean isSportCar;
    private int fuelTankCapacity;
    private double freeFuel;
    private String engineFuelOperationSystem;

    public car(int year, double price, boolean isSportCar, int fuelTankCapacity, double freeFuel, String engineFuelOperationSystem) {
        this.year = year;
        this.price = price;
        this.isSportCar = isSportCar;
        this.fuelTankCapacity = fuelTankCapacity;
        this.freeFuel = freeFuel;
        this.engineFuelOperationSystem = engineFuelOperationSystem;
    }

    public void changeЕngineFuelOperationSystem(String newЕngineFuelOperationSystem){
        this.engineFuelOperationSystem = newЕngineFuelOperationSystem;

    }

    public void useFuel(double fuel){
        this.freeFuel = fuel;
    }

    public String toString() {
        return String.format("year %d, price %.2f, isSportCar %b, fuelTankCapacity %d, freeFuel %.2f, engineFuelOperationSys %s", this.year, this.price, this.isSportCar, this.fuelTankCapacity, this.freeFuel, this.engineFuelOperationSystem);
    }


    }

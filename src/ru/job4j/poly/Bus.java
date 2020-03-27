package ru.job4j.poly;

public class Bus implements Transport {

    private int passengersCount;
    private int fuelAmount;

    @Override
    public void go() {
        System.out.println("Bus is going...");
    }

    @Override
    public void passengers(int count) {
        this.passengersCount = count;
        System.out.println("Passengers count is " + count);
    }

    @Override
    public double fillFuel(int amount) {
        this.fuelAmount += amount;
        System.out.println("Fuel amount is " + this.fuelAmount);
        double fuelPrice = 5.55;
        return fuelPrice * amount;
    }
}

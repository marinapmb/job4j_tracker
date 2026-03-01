package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Едем");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Количество пассажиров: " + count);
    }

    @Override
    public int refuel(int fuel) {
        int fuelCost = fuel * 100;
        System.out.println("Стоимость заправки " + fuelCost);
        return fuelCost;
    }
}

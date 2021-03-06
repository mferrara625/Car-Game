package com.company;

public class Car extends Vehicle {

    private int numberOfDoors;
    protected String hornSound;


    public Car(String make, String model, Engine engine, int numberOfDoors, int maxSpeed, int maxPassengers, String hornSound) {
        super(make, model, engine, maxSpeed, maxPassengers);
        this.numberOfDoors = numberOfDoors;
        this.numberOfPassengers = 0;
        this.hornSound = hornSound;


    }

    public void start(){
        engine.isOn = true;
    }

    public void stop(){
        engine.isOn = false;
    }

    public void addPassengers(int numberOfPassengers){
        this.numberOfPassengers += numberOfPassengers;
    }

    public void removePassengers(int numberOfPassengers){
        this.numberOfPassengers -= numberOfPassengers;
    }

    public void drive(int distance){
        distanceTraveled += distance;
    }

    public void beepHorn(){
        System.out.println(hornSound);
    }
}

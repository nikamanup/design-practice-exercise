package designpattern.bridge;

public abstract class Vehicle {
    Transmission transmission;
    public Vehicle(Transmission transmission){
        this.transmission=transmission;
    }
    public abstract void applyTransmission();
}

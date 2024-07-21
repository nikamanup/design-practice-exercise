package designpattern.bridge;

public class Truck extends Vehicle{

    public Truck(Transmission transmission){
        super(transmission);
    }
    @Override
    public void applyTransmission() {
        transmission.applyGear();
    }
    
}

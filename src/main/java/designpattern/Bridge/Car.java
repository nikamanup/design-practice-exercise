package designpattern.Bridge;

public class Car extends Vehicle {

    public Car(Transmission transmission){
        super(transmission);
        
    }
    @Override
    public void applyTransmission() {
        transmission.applyGear();;
    }
    
}

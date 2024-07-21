package designpattern.bridge;

public class BridgeDemoMain {
    public static void main(String[] args) {
        Transmission transmission=new ManualTransmission();
        Vehicle car=new Car(transmission);
        car.applyTransmission();
    }
}

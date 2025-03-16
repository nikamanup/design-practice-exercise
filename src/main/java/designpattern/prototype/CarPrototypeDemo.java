package designpattern.prototype;

public class CarPrototypeDemo {
    public static void main(String[] args) {
        Car basicCar=new BasicCar();
        Car neCar=(Car)basicCar.clone();
        neCar.customizeCar("Red", "ADAS");
    }
}

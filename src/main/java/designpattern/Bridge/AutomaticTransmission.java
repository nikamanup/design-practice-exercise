package designpattern.Bridge;

public class AutomaticTransmission implements Transmission {

    @Override
    public void applyGear() {
        System.out.println("Automatic Transmission applied");
    }
    
}

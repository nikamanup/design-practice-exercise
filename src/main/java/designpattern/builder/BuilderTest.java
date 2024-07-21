package designpattern.builder;

public class BuilderTest {
    public static void main(String[] args) {
        Computer pc= new Computer.ComputerBuilder("500GB","2GB")
                    .setBluetoothEnabled(false).build();
        System.out.println(pc);

        Computer laptop= new Computer.ComputerBuilder("500GB","8GB")
                .setBluetoothEnabled(true).setGraphicsCardEnabled(false).build();
        System.out.println(laptop);

    }
}

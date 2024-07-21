package designpattern.factory;

public class TestFactory {
    public static void main(String[] args) {
        Computer pc=Factory.getComputer("PC","2GB","500GB","2.4GHZ");
        Computer server=Factory.getComputer("Server","2GB","500GB","2.4GHZ");
        System.out.println("Factory OC Config:"+pc);
        System.out.println("Factory OC Config:"+server);
    }
}

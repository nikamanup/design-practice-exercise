package designpattern.prototype;

public class PrototypeDemoTest {
    public static void main(String[] args) {
        PrototypeDemo prototypeDemo=new PrototypeDemo();
        prototypeDemo.loadData();
        PrototypeDemo prototypeDemo1= prototypeDemo.clone();
        prototypeDemo.getEmployeeList().add("test");
        prototypeDemo1.getEmployeeList().add("test1");
        System.out.println("First Object"+prototypeDemo.getEmployeeList());
        System.out.println("Second Object"+prototypeDemo1.getEmployeeList());

    }
}

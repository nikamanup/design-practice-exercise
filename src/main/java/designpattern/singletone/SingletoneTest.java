package designpattern.singletone;

public class SingletoneTest {
    public static void main(String[] args) {
        SingletoneDemo singletoneDemo=SingletoneDemo.getINSTANCE();
        SingletoneDemo singletoneDemo1= (SingletoneDemo) singletoneDemo.clone();
        System.out.println("First Object"+singletoneDemo);
        System.out.println("First Object"+singletoneDemo1);

    }
}

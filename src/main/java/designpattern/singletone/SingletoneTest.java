package designpattern.singletone;

public class SingletoneTest {
    public static void main(String[] args) {
        StaticBlockInitializedSingleton singletoneDemo= StaticBlockInitializedSingleton.getINSTANCE();
        StaticBlockInitializedSingleton singletoneDemo1= (StaticBlockInitializedSingleton) singletoneDemo.clone();
        System.out.println("First Object"+singletoneDemo);
        System.out.println("First Object"+singletoneDemo1);

    }
}

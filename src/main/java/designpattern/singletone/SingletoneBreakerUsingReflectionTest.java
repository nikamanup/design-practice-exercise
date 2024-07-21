package designpattern.singletone;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletoneBreakerTest {

    public static void main(String[] args) {


        EagerInitializationSingletone instanceOne = EagerInitializationSingletone.getInstance();
        EagerInitializationSingletone instanceTwo = null;

        Constructor[] constructors = EagerInitializationSingletone.class.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            constructor.setAccessible(true);
            try {
                instanceTwo = (EagerInitializationSingletone) constructor.newInstance();
            } catch (InstantiationException ex) {
                throw new RuntimeException(ex);
            } catch (IllegalAccessException ex) {
                throw new RuntimeException(ex);
            } catch (InvocationTargetException ex) {
                throw new RuntimeException(ex);
            }
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}

package designpattern.singletone;

public class ProtectFromReflectionSingleton {

    private static ProtectFromReflectionSingleton INSTANCE=new ProtectFromReflectionSingleton();

    private ProtectFromReflectionSingleton(){
        //This is protection against instantiation via reflection
        if(INSTANCE!=null){
            throw  new IllegalStateException("Singletone Already Initialized");
        }
    }

    public static ProtectFromReflectionSingleton getInstance(){
    return INSTANCE;
    }
}

package designpattern.singletone;

public class EagerInitializationSingletone {
    private static final EagerInitializationSingletone instance=new EagerInitializationSingletone();
    private EagerInitializationSingletone(){
        //Below code will prevent from reflection
        //if(instance!=null){
         //   throw  new IllegalStateException("Singletone Already Initialized");
        //}
    }

    public static EagerInitializationSingletone getInstance() {
        return instance;
    }
}

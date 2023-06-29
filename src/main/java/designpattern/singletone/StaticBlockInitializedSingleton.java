package designpattern.singletone;

import java.io.Serializable;

public class StaticBlockInitializedSingleton implements Serializable {

    private static StaticBlockInitializedSingleton INSTANCE;
    static{
        INSTANCE=new StaticBlockInitializedSingleton();
    }

    private StaticBlockInitializedSingleton(){

    }

    public static StaticBlockInitializedSingleton getINSTANCE() {
        if(INSTANCE==null){
            INSTANCE=new StaticBlockInitializedSingleton();

        }
        return INSTANCE;
    }

    public Object clone(){
        return INSTANCE;
    }
}

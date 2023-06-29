package designpattern.singletone;

import java.io.Serializable;

public class SingletoneDemo implements Serializable {

    private static SingletoneDemo INSTANCE;
    static{
        INSTANCE=new SingletoneDemo();
    }

    private SingletoneDemo(){

    }

    public static SingletoneDemo getINSTANCE() {
        if(INSTANCE==null){
            INSTANCE=new SingletoneDemo();

        }
        return INSTANCE;
    }

    public Object clone(){
        return INSTANCE;
    }
}

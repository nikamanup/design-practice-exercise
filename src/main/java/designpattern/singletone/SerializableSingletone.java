package designpattern.singletone;

import java.io.Serializable;

public class SerializableSingletone implements Serializable {
    public static final long seriaLONG=-874879757457979L;
    private SerializableSingletone(){}
    private static class SingletoneHelper{
        private  static final SerializableSingletone instance=new SerializableSingletone();
    }

    public static SerializableSingletone getInstance(){
        return SingletoneHelper.instance;
    }
    protected Object readResolve() {
        return getInstance();
    }
}

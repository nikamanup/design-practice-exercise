package designpattern.singletone;

public class LazilyIinitializedwithInnerClassSingleton {
    private static class SingletoneHelper{
        private  static final LazilyIinitializedwithInnerClassSingleton instance=new LazilyIinitializedwithInnerClassSingleton();
    }

    public LazilyIinitializedwithInnerClassSingleton getInstance(){
        return SingletoneHelper.instance;
    }
}

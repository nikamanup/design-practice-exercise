package designpattern.prototype;

public abstract class Car implements Cloneable {
    protected  String model;
    protected  String color;
    
    public abstract void customizeCar(String color,String accessories);

    @Override
    public Object clone(){
        Object clonObject;
        try {
            clonObject=super.clone();
        } catch (CloneNotSupportedException e) {
                e.printStackTrace();
                clonObject=null;    
        }
        return clonObject;
    }

}

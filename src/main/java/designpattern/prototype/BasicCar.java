package designpattern.prototype;

public class  BasicCar extends Car{
    public BasicCar(){
            model="basic";
            color="white";
    }

    @Override
    public void customizeCar(String color,String accessories) {
       this.color=color;
       System.out.println("Color is:"+this.color +"with accessories:"+accessories); 
       
    }
}
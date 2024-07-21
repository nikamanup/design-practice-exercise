package designpattern.composite;

public class Circle implements Shape{
    @Override
    public void draw(String fillColour) {
        System.out.println("Drawing Circle with color: "+fillColour);
    }
}

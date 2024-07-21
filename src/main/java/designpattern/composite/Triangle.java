package designpattern.composite;

public class Triangle implements Shape{
    @Override
    public void draw(String fillColour) {
        System.out.println("Drawing triangle with color: "+fillColour);
    }
}

package designpattern.composite;

public class CompositeTest {
    public static void main(String[] args) {
        Shape sh1=new Triangle();
        Shape sh2=new Circle();
        Drawing drawing=new Drawing();
        drawing.add(sh1);
        drawing.add(sh2);
        drawing.draw("red");
    }
}

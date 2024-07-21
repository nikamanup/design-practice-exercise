package designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{
    List<Shape> shapes=new ArrayList<>();
    @Override
    public void draw(String fillColour) {
        for (Shape sh :shapes) {
            sh.draw(fillColour);
        }
    }
    public void add(Shape sh){
        shapes.add(sh);
    }
    public void remove(Shape sh){
        shapes.remove(sh);
    }

    public void clear(){
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }
}

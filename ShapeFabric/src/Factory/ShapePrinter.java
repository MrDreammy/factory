package Factory;

import Properties.Colorable;
import Properties.Shape;

public class ShapePrinter {
    public Object printShape;

    public static void printShape (Shape shape){
        if(shape instanceof ShapeFactory.Circle) {
            Colorable.Color color = ((ShapeFactory.Circle) shape).getColor();
            System.out.p
        }
        else if( shape instanceof ShapeFactory.Triangle) {
            System.out.println("Its a triangle");
        }

    }
}

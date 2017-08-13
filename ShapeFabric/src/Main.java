import Factory.ShapeFactory;
import Factory.ShapePrinter;
import Properties.Colorable;
import Properties.Shape;

public class Main {
    public static void main(String [] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape cir = shapeFactory.createCircle(new Colorable.Color(112,123,233));
        cir.draw();
        ShapePrinter.printShape(cir);

    }
}

package Factory;

import Properties.Colorable;
import Properties.Shape;

public class ShapeFactory {
    public void createCircle() {
    }

    public void createTriangle() {
    }

    public class Triangle implements Shape, Colorable {
        private Color color;

        public Triangle(Color color) {

        }

        @Override
        public void draw() {
            System.out.println("Circle");

        }

        @Override
        public Color getColor() {

            return color;
        }

       
    }

    public class Circle implements Shape, Colorable {
        private Color color;

        public Circle(Color color) {

        }

        @Override
        public void draw() {
        System.out.println("Circle");

        }

        @Override
        public Color getColor() {

            return color;
        }

        
    }
    public Shape createCircle(Colorable.Color color) {
        return new Circle(color);
    }

    public Shape createTriangle(Colorable.Color color) {
        return new Triangle(color);
    }
}
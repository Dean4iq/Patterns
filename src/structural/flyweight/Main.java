package structural.flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        List<Shape> shapes = new ArrayList<>();

        shapes.add(shapeFactory.getShape("Circle"));
        shapes.add(shapeFactory.getShape("Circle"));
        shapes.add(shapeFactory.getShape("Point"));
        shapes.add(shapeFactory.getShape("Circle"));
        shapes.add(shapeFactory.getShape("Square"));
        shapes.add(shapeFactory.getShape("Square"));
        shapes.add(shapeFactory.getShape("Circle"));
        shapes.add(shapeFactory.getShape("Point"));
        shapes.add(shapeFactory.getShape("Circle"));

        shapes.forEach(elem ->
                elem.draw(new Random().nextInt(100),
                        new Random().nextInt(100)));

        shapes.forEach(elem -> System.out.println(elem.toString()));
    }
}

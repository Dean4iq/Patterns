package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public Shape getShape(String shapeName) {
        Shape shape = shapes.get(shapeName);

        if (shape == null) {
            if (shapeName.equals("Circle")){
                shape = new Circle();
            } else if (shapeName.equals("Square")){
                shape = new Square();
            } else if (shapeName.equals("Point")){
                shape = new Point();
            }
            shapes.put(shapeName, shape);
        }
        return shape;
    }
}

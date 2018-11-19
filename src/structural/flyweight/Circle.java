package structural.flyweight;

public class Circle implements Shape {
    private int radius = 45;
    @Override
    public void draw(int x, int y) {
        System.out.println("Point. (" + x + "; " + y + "). Radius = " + radius);
    }
}

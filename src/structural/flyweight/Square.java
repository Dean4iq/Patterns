package structural.flyweight;

public class Square implements Shape {
    private int sideLength = 30;
    @Override
    public void draw(int x, int y) {
        System.out.println("Square. (" + x + "; " + y + "). Side length = " + sideLength);
    }
}

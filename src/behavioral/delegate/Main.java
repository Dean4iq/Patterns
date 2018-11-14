package behavioral.delegate;

public class Main {
    public static void main(String[] args) {
        Painter painter = new Painter(new Square());
        painter.draw();

        painter.setGraphics(new Circle());
        painter.draw();
    }
}

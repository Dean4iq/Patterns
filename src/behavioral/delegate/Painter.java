package behavioral.delegate;

public class Painter {
    Graphics graphics;

    public Painter(Graphics graphics) {
        setGraphics(graphics);
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    void draw(){
        graphics.draw();
    }
}

package structural.composite;

public class Main {
    public static void main(String[] args) {
        Composite composite = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.addComponent(new Triangle());
        composite1.addComponent(new Square());
        composite1.addComponent(new Square());
        composite1.addComponent(new Circle());

        composite2.addComponent(new Square());
        composite2.addComponent(new Square());
        composite2.addComponent(new Square());
        composite2.addComponent(new Circle());
        composite2.addComponent(new Circle());

        composite.addComponent(composite2);
        composite.addComponent(composite1);

        composite.draw();
    }
}

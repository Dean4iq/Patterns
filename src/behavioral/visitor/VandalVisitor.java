package behavioral.visitor;

public class VandalVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Stole the engine!");
    }

    @Override
    public void visit(BodyElement engine) {
        System.out.println("Broke the body");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Smoked inside the car");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Ripped " + wheel.getName() + " wheel");
    }
}

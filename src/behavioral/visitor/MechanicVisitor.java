package behavioral.visitor;

public class MechanicVisitor implements Visitor {
    @Override
    public void visit(EngineElement engine) {
        System.out.println("Checked engine");
    }

    @Override
    public void visit(BodyElement engine) {
        System.out.println("Polished body");
    }

    @Override
    public void visit(CarElement car) {
        System.out.println("Cleaned the car");
    }

    @Override
    public void visit(WheelElement wheel) {
        System.out.println("Checked " + wheel.getName() + " wheel");
    }
}

package behavioral.visitor;

public interface Visitor {
    void visit(EngineElement engine);
    void visit(BodyElement engine);
    void visit(CarElement car);
    void visit(WheelElement wheel);
}

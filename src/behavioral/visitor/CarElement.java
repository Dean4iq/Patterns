package behavioral.visitor;

import java.util.Arrays;

public class CarElement implements Element {
    Element[] elements;

    public CarElement() {
        this.elements = new Element[]{
                new WheelElement("1"), new WheelElement("2"),
                new WheelElement("3"), new WheelElement("4"),
                new BodyElement(),
                new EngineElement()
        };
    }

    @Override
    public void accept(Visitor visitor) {
        Arrays.stream(elements).forEach(elem->elem.accept(visitor));
        visitor.visit(this);
    }
}

package behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        Element car = new CarElement();
        car.accept(new MechanicVisitor());
        System.out.println("================");
        car.accept(new VandalVisitor());
    }
}

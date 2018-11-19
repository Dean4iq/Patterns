package structural.bridge;

public class Coupe extends Car {
    public Coupe(Make make) {
        super(make);
    }

    @Override
    void showType() {
        System.out.println("Coupe");
    }
}

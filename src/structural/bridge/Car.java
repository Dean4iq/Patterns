package structural.bridge;

public abstract class Car {
    private Make make;

    public Car(Make make) {
        this.make = make;
    }

    abstract void showType();

    void showDetails(){
        showType();
        make.setMake();
    }
}

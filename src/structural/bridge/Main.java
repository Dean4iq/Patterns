package structural.bridge;

public class Main {
    public static void main(String[] args) {
        Car car = new Sedan(new Volkswagen());
        car.showDetails();
    }
}

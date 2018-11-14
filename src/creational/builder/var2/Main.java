package creational.builder.var2;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setCarBuilder(new VolkswagenCarBuilder());

        Car car = director.buildCar();
        System.out.println(car.toString());
    }
}

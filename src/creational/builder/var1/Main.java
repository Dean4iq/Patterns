package creational.builder.var1;

public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .buildManufacturer("Mercedes")
                .buildTransmission(Transmission.AUTO)
                .buildMaxSpeed(240)
                .build();

        System.out.println(car.toString());
    }
}

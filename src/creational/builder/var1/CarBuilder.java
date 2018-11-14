package creational.builder.var1;

public class CarBuilder {
    String manufacturer = "Tesla";
    Transmission transmission = Transmission.AUTO;
    int maxSpeed = 220;

    CarBuilder buildManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
        return this;
    }

    CarBuilder buildTransmission(Transmission transmission){
        this.transmission = transmission;
        return this;
    }

    CarBuilder buildMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
        return this;
    }

    Car build(){
        Car car = new Car();

        car.setManufacturer(manufacturer);
        car.setTransmission(transmission);
        car.setMaxSpeed(maxSpeed);

        return car;
    }
}

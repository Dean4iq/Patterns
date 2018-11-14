package creational.builder.var2;

import creational.builder.var2.Transmission;

public class VolkswagenCarBuilder extends CarBuilder {
    @Override
    void buildManufacturer() {
        car.setManufacturer("Volkswagen XX");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(280);
    }
}

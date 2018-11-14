package creational.builder.var2;

public class MercedesCarBuilder extends CarBuilder {
    @Override
    void buildManufacturer() {
        car.setManufacturer("Mercedes ZZ");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(230);
    }
}

package creational.builder.var2;

public class Director {
    CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    Car buildCar(){
        carBuilder.createCar();
        carBuilder.buildManufacturer();
        carBuilder.buildTransmission();
        carBuilder.buildMaxSpeed();

        return carBuilder.getCar();
    }
}

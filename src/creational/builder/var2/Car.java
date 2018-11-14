package creational.builder.var2;

public class Car {
    String manufacturer;
    Transmission transmission;
    int maxSpeed;

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

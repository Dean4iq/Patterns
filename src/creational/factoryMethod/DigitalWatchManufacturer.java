package creational.factoryMethod;

public class DigitalWatchManufacturer implements WatchManufacturer {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}

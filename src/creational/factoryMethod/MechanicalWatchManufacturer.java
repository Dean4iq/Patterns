package creational.factoryMethod;

public class MechanicalWatchManufacturer implements WatchManufacturer {
    @Override
    public Watch createWatch() {
        return new MechanicalWatch();
    }
}

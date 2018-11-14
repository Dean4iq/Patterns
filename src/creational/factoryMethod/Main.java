package creational.factoryMethod;

public class Main {
    public static void main(String[] args) {
        WatchManufacturer watchManufacturer = getWatchmanufacturer("Mechanical");
        Watch watch = watchManufacturer.createWatch();
        watch.showTime();
    }

    public static WatchManufacturer getWatchmanufacturer(String watchType){
        if (watchType.equals("Mechanical")){
            return new MechanicalWatchManufacturer();
        } else if (watchType.equals("Digital")){
            return new DigitalWatchManufacturer();
        }
        throw new RuntimeException("Wrong argument " + watchType);
    }
}

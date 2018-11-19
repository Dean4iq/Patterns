package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        MeteoStation meteoStation = new MeteoStation();

        meteoStation.addObserver(new ConsoleObserver());
        meteoStation.addObserver(new FileObserver());

        meteoStation.setMeasurements(-4, 740);

        try{
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        meteoStation.setMeasurements(-3, 780);
    }
}

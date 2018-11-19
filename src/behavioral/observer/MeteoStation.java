package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements Observed{
    private int temperature;
    private int pressure;
    List<Observer> observerList = new ArrayList<>();

    public void setMeasurements(int temperature, int pressure){
        this.temperature = temperature;
        this.pressure = pressure;

        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(elem->elem.handleEvent(temperature, pressure));
    }
}

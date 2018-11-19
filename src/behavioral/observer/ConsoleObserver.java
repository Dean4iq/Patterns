package behavioral.observer;

import java.util.Date;

public class ConsoleObserver implements Observer {
    @Override
    public void handleEvent(int temp, int pressure) {
        System.out.println(new Date().toString() + ". Weather conditions: temp = " + temp + "; pressure = " + pressure + ".");
    }
}

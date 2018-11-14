package creational.factoryMethod;

import java.util.Date;

public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("Digital: " + new Date().toString());
    }
}

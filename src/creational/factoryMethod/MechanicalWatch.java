package creational.factoryMethod;

import java.util.Date;

public class MechanicalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("Mechanical: " + new Date().toString());
    }
}

package creational.abstract_factory;

public class EnTouchpad implements Touchpad {
    @Override
    public void track(int axisX, int axisY) {
        System.out.println("Scrolled for X: " + axisX + ", for Y: " + axisY);
    }
}

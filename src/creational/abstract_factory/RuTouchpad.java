package creational.abstract_factory;

public class RuTouchpad implements Touchpad {
    @Override
    public void track(int axisX, int axisY) {
        System.out.println("Перемещение по оси Х: " + axisX + ", по оси Y: " + axisY);
    }
}

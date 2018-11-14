package creational.abstract_factory;

public class RuMouse implements Mouse {

    @Override
    public void click() {
        System.out.println("Щелчок мышью");
    }

    @Override
    public void doubleClick() {
        System.out.println("Двойной щелчок мышью");
    }

    @Override
    public void scroll(int direction) {
        if (direction > 0){
            System.out.println("Прокрутка вверх");
        } else if(direction <0){
            System.out.println("Прокрутка вниз");
        } else {
            System.out.println("Прокруткки нету");
        }
    }
}

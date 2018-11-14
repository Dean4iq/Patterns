package creational.abstract_factory;

public class RuKeyboard implements Keyboard {
    @Override
    public void printKey() {
        System.out.println("Нажата кнопка");
    }

    @Override
    public void printKeys() {
        System.out.println("Введено слово");
    }
}

package creational.abstract_factory;

public class EnKeyboard implements Keyboard {
    @Override
    public void printKey() {
        System.out.println("Key pressed");
    }

    @Override
    public void printKeys() {
        System.out.println("Word inputted");
    }
}

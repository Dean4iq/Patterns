package creational.abstract_factory;

public class Main {
    public static void main(String[] args) {
        DeviceFactory deviceFactory = getDeviceFactoryByLang("RU");

        Mouse mouse = deviceFactory.getMouse();
        Keyboard keyboard = deviceFactory.getKeyboard();
        Touchpad touchpad = deviceFactory.geTouchpad();

        mouse.click();
        mouse.doubleClick();
        mouse.scroll(12);

        keyboard.printKey();
        keyboard.printKeys();

        touchpad.track(13,56);
    }

    private static DeviceFactory getDeviceFactoryByLang(String language){
        if (language.equals("EN")){
            return new EnDeviceFactory();
        } else if (language.equals("RU")){
            return new RuDeviceFactory();
        }
        throw new RuntimeException("Unsupported language:" + language);
    }
}

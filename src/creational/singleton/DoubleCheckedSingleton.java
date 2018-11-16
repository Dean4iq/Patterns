package creational.singleton;

public final class DoubleCheckedSingleton {
    private static volatile DoubleCheckedSingleton _instance = null;

    private DoubleCheckedSingleton() {}

    public static synchronized DoubleCheckedSingleton getInstance() {
        if (_instance == null)
            synchronized (DoubleCheckedSingleton.class) {
                if (_instance == null)
                    _instance = new DoubleCheckedSingleton();
            }
        return _instance;
    }
}

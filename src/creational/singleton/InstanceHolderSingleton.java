package creational.singleton;

public final class InstanceHolderSingleton {
    private InstanceHolderSingleton() {}

    private static class Holder {
        private static final InstanceHolderSingleton _instance = new InstanceHolderSingleton();
    }

    public static InstanceHolderSingleton getInstance() {
        return Holder._instance;
    }
}

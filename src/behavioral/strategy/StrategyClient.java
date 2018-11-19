package behavioral.strategy;

public class StrategyClient {
    private Sorting strategy;

    public void executeStrategy(int[] array) {
        strategy.sort(array);
    }

    public void setStrategy(Sorting strategy) {
        this.strategy = strategy;
    }
}

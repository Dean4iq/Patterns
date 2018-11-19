package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        StrategyClient strategyClient = new StrategyClient();

        int[] array = {-2, -1, -2, 3, 6, 12, -5, 0, 6, 0, 111, 234, 9, 3, 1};
        strategyClient.setStrategy(new BubbleSort());
        strategyClient.executeStrategy(array);

        array = new int[]{-2, -1, -2, 3, 6, 12, -5, 0, 6, 0, 111, 234, 9, 3, 1};
        strategyClient.setStrategy(new InsertionSort());
        strategyClient.executeStrategy(array);

        array = new int[]{-2, -1, -2, 3, 6, 12, -5, 0, 6, 0, 111, 234, 9, 3, 1};
        strategyClient.setStrategy(new SelectionSort());
        strategyClient.executeStrategy(array);
    }
}

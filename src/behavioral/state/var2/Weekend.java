package behavioral.state.var2;

public class Weekend implements Activity {
    private int count = 0;

    @Override
    public void doSomething(Human context) {
        if (count < 3) {
            System.out.println("Relaxing");
            count++;
        } else {
            context.setState(new Work());
        }
    }
}

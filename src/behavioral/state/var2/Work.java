package behavioral.state.var2;

public class Work implements Activity {
    @Override
    public void doSomething(Human context) {
        System.out.println("WORKING");
        context.setState(new Weekend());
    }
}

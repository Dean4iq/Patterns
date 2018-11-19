package behavioral.state.var2;

public class Human {
    private Activity state;

    public void setState(Activity state) {
        this.state = state;
    }

    void doSomething(){
        state.doSomething(this);
    }
}

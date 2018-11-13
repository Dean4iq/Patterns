package task.task1;

public class Human {
    private State state;

    public void getState() {
        state.getState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void nextState(State state) {
        setState(this.state.nextState(state));
    }
}

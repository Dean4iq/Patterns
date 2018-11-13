package task.task1;

public interface State {
    void getState();
    State nextState(State state);
}

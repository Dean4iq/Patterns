package task.task3;

public interface State {
    void shoot();
    void getStatus();
    void setWeapon(Weapon weapon);
    void setEmpty(boolean empty);
    State nextState(State state);
}

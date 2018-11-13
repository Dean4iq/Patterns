package task.task3;

public class Fighter {
    private State state;

    public void getState() {
        state.getStatus();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void shoot(){
        state.shoot();
    }

    public void selectWeapon(Weapon weapon){
        state.setWeapon(weapon);
    }

    public void setEmpty(boolean empty){
        state.setEmpty(empty);
    }

    public void nextState(State state){
        setState(this.state.nextState(state));
    }
}

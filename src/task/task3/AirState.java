package task.task3;

public class AirState extends StateImpl {
    AirState() {
        setCanShoot(true);
    }

    @Override
    public void getStatus() {
        System.out.println("Looking for enemies");
    }

    @Override
    public State nextState(State state) {
        if (state instanceof LandState) {
            System.out.println("Approaching for landing");
            return state;
        } else if (state instanceof AirState) {
            System.out.println("Looking for another position");
            return this;
        }
        return null;
    }
}

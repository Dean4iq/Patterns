package task.task3;

public class LandState extends StateImpl {
    LandState(){
        setCanShoot(false);
    }

    @Override
    public void getStatus() {
        System.out.println("Waiting on land");
    }

    @Override
    public State nextState(State state) {
        if (state instanceof AirState){
            System.out.println("Taking off");
            return state;
        } else if (state instanceof LandState){
            System.out.println("Waiting for permission to take off");
            return this;
        }
        return null;
    }
}

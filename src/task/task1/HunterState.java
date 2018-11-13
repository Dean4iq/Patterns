package task.task1;

public class HunterState implements State {
    @Override
    public void getState() {
        System.out.println("Chasing the animal");
    }

    @Override
    public State nextState(State state) {
        if (state instanceof HunterState) {
            System.out.println("Need to be quiet...");
            return this;
        } else if (state instanceof MushroomerState) {
            System.out.println("Animal hss gone, I see the mushroom meadow");
            return new MushroomerState();
        } else if (state instanceof FishermanState) {
            System.out.println("Standing at the river! Lucky me, I have a fishing rod");
            return new FishermanState();
        }
        return null;
    }
}

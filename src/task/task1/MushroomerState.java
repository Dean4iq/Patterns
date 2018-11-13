package task.task1;

public class MushroomerState implements State {
    @Override
    public void getState() {
        System.out.println("Gathering mushrooms in a mushroom meadow");
    }

    @Override
    public State nextState(State state) {
        if (state instanceof MushroomerState) {
            System.out.println("Still picking mushrooms...");
            return this;
        } else if (state instanceof FishermanState) {
            System.out.println("Standing at the river. Enough of mushrooms!");
            return new FishermanState();
        } else if (state instanceof HunterState) {
            System.out.println("Spotted the animal! Where is my gun?");
            return new HunterState();
        }
        return null;
    }
}

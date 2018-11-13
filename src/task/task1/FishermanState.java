package task.task1;

public class FishermanState implements State {
    @Override
    public void getState() {
        System.out.println("Fishing at the river");
    }

    @Override
    public State nextState(State state) {
        if (state instanceof FishermanState) {
            System.out.println("Still fishing...");
            return this;
        } else if (state instanceof MushroomerState) {
            System.out.println("Going for mushrooms");
            return new MushroomerState();
        } else if (state instanceof HunterState) {
            System.out.println("Spotted the animal! Where is my gun?");
            return new HunterState();
        }
        return null;
    }
}
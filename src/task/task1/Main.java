package task.task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new FishermanState());
        human.getState();

        for (int i = 0; i < 10; i++) {
            int randState = new Random().nextInt(3) + 1;
            if (randState == 1) {
                human.nextState(new FishermanState());
                human.getState();
            } else if (randState == 2) {
                human.nextState(new MushroomerState());
                human.getState();
            } else if (randState == 3) {
                human.nextState(new HunterState());
                human.getState();
            }
            System.out.println("==================================");
        }
    }
}

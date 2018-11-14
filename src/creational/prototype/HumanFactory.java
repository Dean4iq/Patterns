package creational.prototype;

public class HumanFactory {
    Human human;

    public HumanFactory(Human human) {
        setPrototpe(human);
    }

    public void setPrototpe(Human human) {
        this.human = human;
    }

    Human makeCopy() {
        return (Human) human.copy();
    }
}

package behavioral.memento;

public class Game {
    private String level;
    private int myScore;

    public void set(String level, int myScore) {
        this.level = level;
        this.myScore = myScore;
    }

    public void load(Save save) {
        this.level = save.getLevel();
        this.myScore = save.getMyScore();
    }

    public Save save() {
        return new Save(level, myScore);
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", myScore=" + myScore +
                '}';
    }
}

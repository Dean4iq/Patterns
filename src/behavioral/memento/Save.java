package behavioral.memento;

public class Save {
    private final String level;
    private final int myScore;

    public Save(String level, int myScore) {
        this.level = level;
        this.myScore = myScore;
    }

    public String getLevel() {
        return level;
    }

    public int getMyScore() {
        return myScore;
    }
}

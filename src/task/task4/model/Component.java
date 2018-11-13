package task.task4.model;

import java.util.Arrays;

public enum Component {
    SALT("1"),
    PEPPER("2"),
    CHILI("3"),
    FISH("4"),
    CHICKEN("5"),
    BEAF("6"),
    BROCCOLI("7"),
    PORK("8"),
    ONION("9"),
    LETTUCE("10"),
    CARROT("11");

    String position;

    Component(String position){
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public static Component getComponent(String number){
        return Arrays.stream(Component.values()).filter(elem -> elem.getPosition().equals(number)).findFirst().get();
    }
}

package creational.prototype;

public class Main {
    public static void main(String[] args) {
        Human origin = new Human(19, "Antony");
        System.out.println(origin + " " + origin.hashCode());

        Human copy = (Human)origin.copy();
        System.out.println(copy + " " + copy.hashCode());

        HumanFactory factory = new HumanFactory(copy);
        Human factoryHumanCopy = factory.makeCopy();
        System.out.println(factoryHumanCopy + " " + factoryHumanCopy.hashCode());

        factory.setPrototpe(new Human(95, "Stan"));
        Human excelsiorCopy = factory.makeCopy();
        System.out.println(excelsiorCopy + " " + excelsiorCopy.hashCode());
    }
}

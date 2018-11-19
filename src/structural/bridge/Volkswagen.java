package structural.bridge;

public class Volkswagen implements Make {
    @Override
    public void setMake() {
        System.out.println("Volkswagen");
    }
}

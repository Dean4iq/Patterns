package behavioral.chainOfResponsibility.var1;

public class ConsoleLogger extends Logger {
    public ConsoleLogger(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("Console: " + message);
    }
}

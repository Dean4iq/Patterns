package behavioral.chainOfResponsibility.var1;

public class Main {
    public static void main(String[] args) {
        Logger smsLogger = new SMSLogger(Level.WARNING);
        Logger fileLogger = new FileLogger(Level.DEBUG);
        Logger consoleLogger = new ConsoleLogger(Level.INFO);

        smsLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        smsLogger.writeMessage("System started", Level.INFO);
        smsLogger.writeMessage("Connected to DB", Level.DEBUG);
        smsLogger.writeMessage("Something happened", Level.WARNING);
        smsLogger.writeMessage("System crushed", Level.ERROR);
    }
}

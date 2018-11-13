package task.task6;

public class MechnicalWatchFactory implements IWatchFactory {
    @Override
    public IWatch createWatch() {
        return new MechanicalWatch();
    }
}

package task.task6;

public class ElectronicWatchFactory implements IWatchFactory{
    @Override
    public IWatch createWatch() {
        return new ElectronicWatch();
    }
}

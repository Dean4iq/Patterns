package task.task6;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IWatch> watchList = new ArrayList<>();

        try {
            IWatchFactory watchFactory = createWatchFactory(new MechanicalWatch());

            watchList.add(watchFactory.createWatch());
            watchList.add(watchFactory.createWatch());
        } catch (OperationNotSupportedException e) {
            e.printStackTrace();
        }

        try {
            IWatchFactory watchFactory = createWatchFactory(new ElectronicWatch());

            watchList.add(watchFactory.createWatch());
        } catch (OperationNotSupportedException e) {
            e.printStackTrace();
        }

        watchList.stream().forEach(elem-> System.out.println(elem.getClass().getName()));
    }

    private static IWatchFactory createWatchFactory(IWatch watch) throws OperationNotSupportedException {
        if (watch instanceof ElectronicWatch){
            return new ElectronicWatchFactory();
        } else if (watch instanceof MechanicalWatch){
            return new MechnicalWatchFactory();
        }
        throw new OperationNotSupportedException();
    }
}

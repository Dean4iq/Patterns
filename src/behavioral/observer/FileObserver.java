package behavioral.observer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class FileObserver implements Observer {
    @Override
    public void handleEvent(int temp, int pressure) {
        File file;

        try {
            //C:/User/AppData/Local/Temp
            file = File.createTempFile("Weather", ".txt");
            PrintWriter printWriter = new PrintWriter(file);

            printWriter.print(new Date().toString() + ". Weather conditions: temp = " + temp + "; pressure = " + pressure + ".");
            printWriter.println();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

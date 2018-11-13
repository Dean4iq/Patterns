package task.task4;

import task.task4.controller.Controller;
import task.task4.view.View;

class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new View());
        controller.processUser();
    }
}

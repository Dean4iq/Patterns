package task.task4.controller;

import task.task4.model.Component;
import task.task4.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private View view;

    public Controller(View view) {
        this.view = view;
    }

    private List<Component> chooseComponents(){
        Scanner scanner = new Scanner(System.in);
        List<Component> componentList = new ArrayList<>();
        String input;

        view.getOnScreen(view.CHOOSE_YOU_CONPONENTS);
        Arrays.stream(Component.values())
                .forEach(elem->view.getOnScreen(elem.getPosition() + " - " + elem.name()));
        view.getOnScreen(view.TYPE_TO_END);

        while (!(input = scanner.nextLine()).equals("0")){
            componentList.add(Component.getComponent(input));
        }

        return componentList;
    }

    private void printChosenComponents(List<Component> components){
        view.getOnScreen(view.CHOSEN_COMPONENTS);
        components.stream().forEach(elem->view.getOnScreen(elem.name()));
    }

    public void processUser(){
        List<Component> components = chooseComponents();
        printChosenComponents(components);
    }
}

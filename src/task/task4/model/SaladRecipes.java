package task.task4.model;

import java.util.ArrayList;
import java.util.List;

public abstract class SaladRecipes {
    private List<Component> components;

    SaladRecipes(){
        components = new ArrayList<>();
    }

    abstract void setComponents();
}

package smartcomponents.composite;

import java.util.ArrayList;
import java.util.List;

import smartcomponents.SmartComponent;

public abstract class Composite extends SmartComponent {
    private List<SmartComponent> smartcomponents;

    public Composite(String name) {
        super(name); smartcomponents = new ArrayList<>();
    }

    public void addComponent(SmartComponent smartcomponent) {
        smartcomponents.add(smartcomponent);
    }

    public List<SmartComponent> getComponents() {
        return smartcomponents;
    }
}

package smartcomponents.composite.categories;

import smartcomponents.SmartComponent;
import smartcomponents.composite.Composite;

public class House extends Composite {
    public House(String name) { super(name); }

    @Override public void turnOn() {
        System.out.println("Turning On Smart Components in " + getName());
        for (SmartComponent comp : this.getComponents()) comp.turnOn();
    }

    @Override public void turnOff() {
        System.out.println("Turning Off Smart Components in " + getName());
        for (SmartComponent comp : this.getComponents()) comp.turnOff();
    }
}

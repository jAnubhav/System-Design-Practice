package smartcomponents.categories;

import smartcomponents.SmartComponent;

public class SmartFan extends SmartComponent {
    public SmartFan(String name) { super(name); }

    @Override public void turnOn() {
        System.out.println("Turning On " + getName());
    }

    @Override public void turnOff() {
        System.out.println("Turning Off " + getName());
    }
}

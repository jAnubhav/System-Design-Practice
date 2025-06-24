package smartcomponents.categories;

import smartcomponents.SmartComponent;

public class AirConditioner extends SmartComponent {
    public AirConditioner(String name) { super(name); }

    @Override public void turnOn() {
        System.out.println("Turning On " + getName());
    }

    @Override public void turnOff() {
        System.out.println("Turning Off " + getName());
    }
}

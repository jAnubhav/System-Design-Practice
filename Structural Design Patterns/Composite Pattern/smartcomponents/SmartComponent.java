package smartcomponents;

public abstract class SmartComponent {
    private String name;

    public SmartComponent(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public abstract void turnOn();
    public abstract void turnOff();
}

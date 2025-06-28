package vehicles;

public abstract class Vehicle {
    public String name;

    Vehicle(String name) {
        this.name = name;
    }

    public abstract void start(); 
    public abstract void stop();
}
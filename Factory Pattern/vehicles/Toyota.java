package vehicles;

public class Toyota extends Vehicle {
    public Toyota(String name) { super(name); }
    
    @Override
    public void start() {
        System.out.println("Toyota Vehicle is Starting");
    }
    
    @Override
    public void stop() {
        System.out.println("Toyota Vehicle is Stopping");
    }
}
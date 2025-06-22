package vehicles;

public class Honda extends Vehicle {
    public Honda(String name) { super(name); }

    @Override
    public void start() {
        System.out.println("Honda Vehicle is Starting");
    }

    @Override
    public void stop() {
        System.out.println("Honda Vehicle is Stopping");
    }
}

import factories.HondaFactory;
import factories.VehicleFactory;

import vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new HondaFactory();
        Vehicle vehicle = null;

        if (factory instanceof HondaFactory) {
            vehicle = factory.createVehicle("Honda City");
        };

        System.out.println(vehicle.name);
    }
}
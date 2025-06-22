package factories;

import vehicles.Vehicle;
import vehicles.Toyota;

public class ToyotaFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String name) {
        return new Toyota(name);
    }
}


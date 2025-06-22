package factories;

import vehicles.Vehicle;
import vehicles.Honda;

public class HondaFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String name) {
        return new Honda(name);
    }
}
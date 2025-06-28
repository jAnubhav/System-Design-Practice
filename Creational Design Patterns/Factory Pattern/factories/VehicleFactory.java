package factories;

import vehicles.Vehicle;

public interface VehicleFactory {
    Vehicle createVehicle(String name);
}

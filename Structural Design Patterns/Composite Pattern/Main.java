import smartcomponents.categories.AirConditioner;
import smartcomponents.categories.SmartFan;
import smartcomponents.composite.categories.House;
import smartcomponents.composite.categories.Room;

public class Main {
    public static void main(String[] args) {
        AirConditioner ac1 = new AirConditioner("AC1"); 
        AirConditioner ac2 = new AirConditioner("AC2");
        AirConditioner ac3 = new AirConditioner("AC3"); 
        AirConditioner ac4 = new AirConditioner("AC4");

        SmartFan sf1 = new SmartFan("SF1"), sf2 = new SmartFan("SF2");
        SmartFan sf3 = new SmartFan("SF3"), sf4 = new SmartFan("SF4");

        Room room1 = new Room("R1"), room2 = new Room("R2");
        Room room3 = new Room("R3"), room4 = new Room("R4");

        room1.addComponent(ac1); room1.addComponent(sf1);
        room2.addComponent(ac2); room2.addComponent(sf2);

        room3.addComponent(ac3); room3.addComponent(sf3);
        room4.addComponent(ac4); room4.addComponent(sf4);

        House house1 = new House("H1"), house2 = new House("H2");

        house1.addComponent(room1); house1.addComponent(room2);
        house2.addComponent(room3); house2.addComponent(room3);

        house1.turnOn(); house1.turnOff(); house2.turnOn(); house2.turnOff();
    }
}
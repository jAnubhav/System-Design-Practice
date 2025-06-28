import cars.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
            .setBrand("Tesla")
            .setColor("Black")
            .setEngine("Electric")
            .setSeats(2).buildCar();
            
        System.out.println(car);
    }   
}
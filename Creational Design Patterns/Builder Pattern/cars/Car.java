package cars;

public class Car {
    public int wheels, seats;
    public String engine, brand, color;

    private Car(CarBuilder builder) {
        this.wheels = builder.wheels;
        this.seats = builder.seats;
        this.engine = builder.engine;
        this.color = builder.color;
        this.brand = builder.brand;
    }

    public static class CarBuilder {
        private int wheels = 4, seats = 5;
        private String engine = "I4", color = "White", brand;

        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels; return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats; return this;
        }

        public CarBuilder setEngine(String engine) {
            this.engine = engine; return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color; return this;
        }

        public CarBuilder setBrand(String brand) {
            this.brand = brand; return this;
        }

        public Car buildCar() {
            return new Car(this);
        }
    }
}
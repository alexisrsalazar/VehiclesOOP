public class Car extends Vehicle {
    public Car(int numWheels, String color, String model, String brand, String year, Engine engine) {
        super(numWheels, color, model, brand, year, engine);
    }

    @Override
    public String needSpecialLicense() {
        return "Cars don't need special License";
    }

    @Override
    public String traction() {
        return null;
    }

    @Override
    public String transmission() {
        return null;
    }

    @Override
    public String pedals() {
        return "Car has foot pedals";
    }

    @Override
    public String accelerationTime() {
        return "The car accelerate with " + getMotor().getPower() + " horsepower";
    }

    @Override
    public String energyType() {
        return "Car use " + getFuelType();
    }
}

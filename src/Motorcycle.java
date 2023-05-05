public class Motorcycle extends Vehicle {
    public Motorcycle(int numWheels, String color, String model, String brand, String year, Engine engine) {
        super(numWheels, color, model, brand, year, engine);
    }

    @Override
    public String needSpecialLicense() {
        return "Motorcycle need a license for 2 wheels vehicles";
    }

    @Override
    public String traction() {
        return "Motorcycles only has traction with 1 wheel";
    }

    @Override
    public String transmission() {
        return "Motorcycles has light weight transmision";
    }

    @Override
    public String pedals() {
        return "Motorcycle has hand pedals";
    }

    @Override
    public String accelerationTime() {
        return "The motorcycle accelerate with " + getMotor().getPower() + " horsepower";
    }

    @Override
    public String energyType() {
        return "Motorcycle use" + getFuelType();
    }
}

public class Truck extends Vehicle{
    public Truck(int numWheels, String color, String model, String brand, String year, Engine engine) {
        super(numWheels, color, model, brand, year, engine);
    }

    @Override
    public String needSpecialLicense() {
        return "Trucks need high weight specialized license";
    }

    @Override
    public String traction() {
        return "Truck has traction with 4 wheels";
    }

    @Override
    public String transmission() {
        return "Truck has a heavy duty transmission";
    }

    @Override
    public String pedals() {
        return "Truck has foot pedals";
    }

    @Override
    public String accelerationTime() {
        return "The truck accelerate with " + getMotor().getPower() + " horsepower";
    }

    @Override
    public String energyType() {
        return "Truck use " + getFuelType();
    }

}

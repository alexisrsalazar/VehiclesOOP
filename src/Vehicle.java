

public abstract class Vehicle {
    private int numWheels;
    private String color;
    private String model;
    private String brand;
    private String year;
    private Engine engine;

    public Vehicle(int numWheels, String color, String model, String brand, String year, Engine engine) {
        this.numWheels = numWheels;
        this.color = color;
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.engine = engine;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Engine getMotor() {
        return engine;
    }

    public void setMotor(Engine engine) {
        this.engine = engine;
    }

    public String getFuelType(){
        return engine.getMotorType();
    }



    public abstract String needSpecialLicense();
    public abstract String traction();
    public abstract String transmission();
    public abstract String pedals();
    public abstract String accelerationTime();
    public abstract String energyType();



}

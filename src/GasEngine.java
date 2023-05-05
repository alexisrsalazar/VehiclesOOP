public class GasEngine extends Engine{
    public GasEngine motorcycleEngine;
    public GasEngine(String motorType, int power, int numCylinders, double displacement, boolean supercharged) {
        super(motorType, power, numCylinders, displacement, supercharged);
    }
    public void fuelType(){
        System.out.println("Gas engine use " + getMotorType());
    }

}

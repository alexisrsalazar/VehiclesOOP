public class ElectricEngine extends Engine{
    public ElectricEngine(String motorType, int power, int numCylinders, int displacement, boolean supercharged) {
        super(motorType, power, numCylinders, displacement, supercharged);
    }

    public void battery(){
        System.out.println("Electric motors contains batteries");
    }


}

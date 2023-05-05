

public class Engine {
    private String motorType;
    private int power;
    private int numCylinders;
    private double displacement;
    private boolean supercharged;
    private boolean engineState;



    public Engine(String motorType, int power, int numCylinders, double displacement, boolean supercharged) {
        this.motorType = motorType;
        this.power = power;
        this.numCylinders = numCylinders;
        this.displacement = displacement;
        this.supercharged = supercharged;
        this.engineState = false;
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        if(isSupercharged()){
            this.power = power + 50;
        } else {
            this.power = power;
        }
    }

    public int getNumCylinders() {
        return numCylinders;
    }

    public void setNumCylinders(int numCylinders) {
        this.numCylinders = numCylinders;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public boolean isSupercharged() {
        return supercharged;
    }

    public void setSupercharged(boolean supercharged) {
        this.supercharged = supercharged;
    }

    public boolean getEngineState() {
        return engineState;
    }

    public boolean setEngineState(boolean engineState) {
        if(!engineState==this.engineState){
            this.engineState = engineState;
            return true;
        }else{
            return false;
        }
    }

    public String startEngine(){
        if(setEngineState(true)){
            return "Engine started";
        }else {
            return "Engine already started";
        }
    }

    public String stopEngine(){
        if(setEngineState(false)){
            return "Engine stopped";
        }else {
            return "Engine already stopped";
        }
    }
}

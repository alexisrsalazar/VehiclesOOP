public class Main {
    public static void main(String[] args) {
        ElectricEngine electric = new ElectricEngine("electric", 400, 0, 0, false);
        Car Tesla = new Car(4, "red", "Model S","Tesla", "2023", electric);
        System.out.println(Tesla.accelerationTime());
        System.out.println(Tesla.pedals());
        System.out.println(Tesla.energyType());

        GasEngine truckEngine = new GasEngine("Diesel", 220, 8,5.7,true);
        Truck Ram = new Truck(6, "white","Ram", "Dodge","2015",truckEngine);
        System.out.println(Ram.accelerationTime());
        System.out.println(Ram.needSpecialLicense());
        System.out.println(Ram.energyType());

        GasEngine motorcycleEngine = new GasEngine("Gas", 15,1,0.150, false);
        Motorcycle Suzuki = new Motorcycle(2, "blue", "Suzuki 150", "Suzuki", "2008", motorcycleEngine);
        System.out.println(Suzuki.accelerationTime());
        System.out.println(Suzuki.transmission());
        System.out.println(Suzuki.traction());

    }
}

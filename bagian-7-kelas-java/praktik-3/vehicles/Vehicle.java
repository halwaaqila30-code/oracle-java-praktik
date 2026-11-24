package vehicles;

public class Vehicle {
    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    private String chassisNo;
    private String model;

    public Vehicle(String model) {
        numVehicles++;
        this.chassisNo = "ch" + numVehicles;
        this.model = model;
        System.out.println("Vehicle manufactured");
    }

    public String getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static String getMake() {
        return MAKE;
    }

    public static void setMake(String make) {
        MAKE = make;
    }

    public static class Engine extends Vehicle {
        private static final String MAKE = "Predicter";
        private static final int CAPACITY = 1600;

        public Engine(String model) {
            super(model);
        }

        public static String getEngineMake() {
            return MAKE;
        }

        public static int getCapacity() {
            return CAPACITY;
        }
    }

    @Override
    public String toString() {
        return "The vehicle is manufactured by: " + MAKE + "\n"
                + "The model type is " + model + "\n"
                + "The chassis number is " + chassisNo + "\n"
                + "Engine make: " + Engine.getEngineMake() + ", capacity: " + Engine.getCapacity() + "cc";
    }
}
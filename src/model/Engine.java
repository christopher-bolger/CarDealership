package model;

public class Engine {
    private final float averageKmPerFuelUnit;
    private final String make;
    private final String model;
    private final String serialNumber;
    private final String yearOfManufacture;

    // 'String... args' basically means there's going to be a String array called 'args' of an arbitrary length
    // I could also have put String[] args
    // It also has to be the last variable in a method declaration
    public Engine(float averageKmPerFuelUnit, String... args){
        if(averageKmPerFuelUnit > 0)
            this.averageKmPerFuelUnit = averageKmPerFuelUnit;
        else this.averageKmPerFuelUnit = -1;
        if(args != null && args.length == 4){
            make = args[0];
            model = args[1];
            serialNumber = args[2];
            yearOfManufacture = args[3];
        }else{
            make = "NULL/ENGINE_MAKE";
            model = "NULL/ENGINE_MODEL";
            serialNumber = "NULL/ENGINE_SERIALNUMBER";
            yearOfManufacture = "NULL/ENGINE_YEAROFMANUFACTURE";
        }
    }

    public float getAverageKmPerFuelUnit() {
        return averageKmPerFuelUnit;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public String toString() {
        return "averageKmPerFuelUnit = " + averageKmPerFuelUnit +
                ", make = '" + make + '\'' +
                ", model = '" + model + '\'' +
                ", serialNumber = '" + serialNumber + '\'' +
                ", yearOfManufacture = '" + yearOfManufacture + '\'';
    }
}

package model;

public class Engine {
    private final float distancePerUnitFuel;
    private final String make;
    private final String model;
    private final String type;
    private final String serialNumber;
    private final String yearOfManufacture;

    // 'String... args' basically means there's going to be a String array called 'args' of an arbitrary length
    // I could also have put String[] args
    // It also has to be the last variable in a method declaration
    public Engine(float distancePerUnitFuel, String... args){
        if(distancePerUnitFuel > 0)
            this.distancePerUnitFuel = distancePerUnitFuel;
        else this.distancePerUnitFuel = -1;
        if(args != null && args.length == 5){
            make = args[0];
            model = args[1];
            type = args[2];
            serialNumber = args[3];
            yearOfManufacture = args[4];
        }else{
            make = "NULL/ENGINE_MAKE";
            model = "NULL/ENGINE_MODEL";
            type = "NULL/ENGINE_TYPE";
            serialNumber = "NULL/ENGINE_SERIALNUMBER";
            yearOfManufacture = "NULL/ENGINE_YEAROFMANUFACTURE";
        }
    }

    public float getDistancePerUnitFuel() {
        return distancePerUnitFuel;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getType(){
        return type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    @Override
    public String toString() {
        return "distancePerUnitFuel = " + distancePerUnitFuel +
                ", make = '" + make + '\'' +
                ", model = '" + model + '\'' +
                ", type = '" + type + '\'' +
                ", serialNumber = '" + serialNumber + '\'' +
                ", yearOfManufacture = '" + yearOfManufacture + '\'';
    }
}

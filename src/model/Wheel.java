package model;

public class Wheel {
    private final String type;
    private final double diameter;
    private final float tireWidth = 0.2f;
    private double tyreDistance = -1;

    public Wheel(String type, double diameter){
        if(type != null && !type.isEmpty())
            this.type = type;
        else this.type = "NULL/WHEEL_TYPE";
        if(diameter > 0) {
            this.diameter = diameter;
            //distance tyre travels in a single rotation = circumference = d * pi
            tyreDistance = diameter * Math.PI;
        }
        else this.diameter = -1;
    }

    public String getType() {
        return type;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getTyreDistance(){
        return tyreDistance;
    }

    @Override
    public String toString() {
        return "type = '" + type + '\'' +
                ", diameter = " + diameter;
    }
}

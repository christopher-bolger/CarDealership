package model;

public class Car {
    private Wheel wheel;
    private Body body;
    private Engine engine;

    public Car(Wheel wheel, Body body, Engine engine){
        if(wheel != null)
            this.wheel = wheel;
        else this.wheel = new Wheel("NULL/CAR_WHEEL", 0);
        if(body != null)
            this.body = body;
        else this.body = new Body("NULL/CAR_BODY", 0,0,0,0,0, false);
        if(engine != null)
            this.engine = engine;
        else this.engine = new Engine(0, "NULL/CAR_ENGINE", "", "", "", "");
    }

    public double drivableDistance(float unitsOfFuel){
        return (unitsOfFuel * engine.getDistancePerUnitFuel()) / wheel.getTyreDistance();
    }

    public float getVolume(){
        return body.getHeight() * body.getLength() * body.getWidth();
    }

    public float getFootprint(){
        return body.getWidth() * body.getLength();
    }

    public String toString(){
        return "";
    }
}

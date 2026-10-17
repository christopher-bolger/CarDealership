package model;

public class Car {
    private Wheel wheel;
    private Body body;
    private Engine engine;
    private float fuel;
    private float range;

    public Car(Wheel wheel, Body body, Engine engine){
        if(wheel != null)
            this.wheel = wheel;
        else this.wheel = new Wheel();
        if(body != null)
            this.body = body;
        else this.body = new Body();
        if(engine != null)
            this.engine = engine;
        else this.engine = new Engine();
        fuel = range = 0;
    }

    public

}

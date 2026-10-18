package model;

public class Order {
    private final Customer customer;
    private final Body body;
    private final Engine engine;
    private final Wheel wheel;
    private Car car;
    private boolean isOrderComplete = false;

    public Order(Customer customer, Body body, Engine engine, Wheel wheel){
        if(customer != null)
            this.customer = customer;
        else this.customer = new Customer("NULL/ORDER_CUSTOMER");
        if(body != null)
            this.body = body;
        else this.body = new Body("NULL/ORDER_BODY", 0,0,0,0,0, false);
        if(engine != null)
            this.engine = engine;
        else this.engine = new Engine(0, "NULL/ORDER_ENGINE", "", "", "", "");
        if(wheel != null)
            this.wheel = wheel;
        else this.wheel = new Wheel("NULL/ORDER_WHEEL", 0);
    }

    public Car completeOrder(){
        if(isOrderComplete)
            return car;
        car = new Car(wheel, body, engine);
        customer.setCar(car);
        isOrderComplete = true;
        return car; //could recursively call this function
    }

    public boolean isOrderComplete(){
        return isOrderComplete;
    }
}

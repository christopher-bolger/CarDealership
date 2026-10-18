package model;

public class Order {
    private final Customer customer;
    private final String orderDate;
    private final Body body;
    private final Engine engine;
    private final Wheel wheel;
    private boolean isOrderComplete = false;

    public Order(Customer customer, String orderDate, Body body, Engine engine, Wheel wheel){
        if(customer != null)
            this.customer = customer;
        else this.customer = new Customer("NULL/ORDER_CUSTOMER");
        if(orderDate != null && !orderDate.isEmpty())
            this.orderDate = orderDate;
        else this.orderDate = "NULL/ORDER_ORDERDATE";
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
            return customer.getCar();
        customer.setCar(new Car(wheel, body, engine));
        isOrderComplete = true;
        return customer.getCar(); //could also recursively call this method
    }

    public boolean isOrderComplete(){
        return isOrderComplete;
    }

    @Override
    public String toString() {
        return "customer = " + customer +
                ", orderDate = " + orderDate +
                ", body = " + body +
                ", engine = " + engine +
                ", wheel = " + wheel +
                ", isOrderComplete = " + isOrderComplete;
    }
}

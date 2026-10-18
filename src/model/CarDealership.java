package model;

import java.util.ArrayList;
import java.util.List;

public class CarDealership {
    private final String name;
    private final List<Customer> customers = new ArrayList<>(List.of(
            new Customer("Janet"),
            new Customer("Maeve"),
            new Customer("John"),
            new Customer("Derek")
    ));
    private final List<Body> bodies = new ArrayList<>(List.of(
            new Body("Coupe", 1.423f, 2.037f, 4.299f, 344.0f, 5, false),
            new Body("Coupe_RHD", 1.423f, 2.037f, 4.299f, 344.0f, 5, true),
            new Body("People Carrier", 1.85f, 1.9f, 4.9f, 550f, 7, false),
            new Body("Sedan", 1.45f, 1.85f, 4.9f, 400f, 5, false),
            new Body("City", 1.46f, 1.48f, 3.4f, 120f, 4, false),
            new Body("City_RHD", 1.46f, 1.48f, 3.4f, 120f, 4, true),
            new Body("Pickup", 1.95f, 2.0f, 5.1f, 1100f, 3, false)
    ));
    private final List<Wheel> wheels = new ArrayList<>(List.of(
            new Wheel("Steel", 16),
            new Wheel("Steel", 18),
            new Wheel("Cast Alloy", 14),
            new Wheel("Cast Alloy", 16),
            new Wheel("Cast Alloy", 18),
            new Wheel("Chrome", 14),
            new Wheel("Chrome", 16)
    ));
    private final List<Engine> engines = new ArrayList<>(List.of(
            new Engine(20, "Renault", "1.5 DCi", "KJSEOF9873", "2010"),
            new Engine(18, "BMW", "i118D", "WIU4YRTI34", "2016"),
            new Engine(2, "Ford", "5.4L V8", "4TUEHISWASE", "2005"),
            new Engine(9, "Suzuki", "2.2L V6 T", "8Y94T37WHUF", "2020"),
            new Engine(14, "BMW", "i318D", "3E458IRTDO", "2018")
    ));
    private final List<Order> orders = new ArrayList<>(List.of(
            new Order(customers.getFirst(), "March 2026", bodies.getFirst(), engines.getFirst(), wheels.getFirst()),
            new Order(customers.getLast(), "February 2026", bodies.getLast(), engines.getLast(), wheels.getLast())
    ));

    public CarDealership(String name) {
        if(name != null && !name.isEmpty())
            this.name = name;
        else this.name = "NULL/CARDEALERSHIP_NAME";
        orders.get(1).completeOrder();
    }

    public boolean AddCustomer(Customer customer) {
        if (customer != null && !customers.contains(customer))
            return customers.add(customer);
        return false;
    }

    public boolean AddBody(Body body) {
        if(body != null && !bodies.contains(body))
            return bodies.add(body);
        return false;
    }

    public boolean AddWheel(Wheel wheel) {
        if(wheel != null && !wheels.contains(wheel))
            return wheels.add(wheel);
        return false;
    }

    public boolean AddEngine(Engine engine) {
        if(engine != null && !engines.contains(engine))
            return engines.add(engine);
        return false;
    }

    public boolean AddOrder(Order order) {
        if(order != null && !orders.contains(order))
            return orders.add(order);
        return false;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Body> getBodies() {
        return bodies;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public List<Engine> getEngines() {
        return engines;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public boolean isOrderCompeleted(int index) {
        if(orders.isEmpty() || index <  0 || index >= orders.size())
            return false;
        return orders.get(index).isOrderComplete();
    }

    public Car setOrderCompleted(int index) {
        if(orders.isEmpty() || index <  0 || index >= orders.size())
            return null;
        return orders.get(index).completeOrder();
    }

    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                ", customers = " + customers +
                ", bodies = " + bodies +
                ", wheels = " + wheels +
                ", engines = " + engines +
                ", orders = " + orders;
    }
}

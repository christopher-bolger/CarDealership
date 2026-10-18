package model;

public class Customer {
    private String name;
    private Order order;
    private Car car;

    public Customer(String name){
        if(name == null || name.isEmpty())
            this.name = "NULL/CUSTOMER_NAME";
        else this.name = name;
    }

    public void setOrder(Order order){
        if(order != null)
            this.order = order;
    }

    public Order getOrder(){
        return order;
    }

    public void setCar(Car car){
        if(car != null) {
            this.car = car;
            this.order = null;
        }
    }

    public Car getCar(){
        return car;
    }

    public void setName(String name){
        if(name != null && !name.isEmpty())
            this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        //customer details
        sb.append("Customer Name: ").append(name).append('\n');
        //order details
        if(order != null) sb.append(order);
        else sb.append("Customer has no order!");
        sb.append('\n');
        //car details
        if(car != null) sb.append(car);
        else sb.append("Customer has not received a car!");
        return sb.toString();
    }
}

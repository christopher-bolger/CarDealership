package model;

import java.util.ArrayList;
import java.util.List;

public class CarDealership {
    private final List<Order> orders = new ArrayList<>();
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
}

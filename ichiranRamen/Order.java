package ichiranRamen;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    private Ramen ramen;
    private List<RamenDecorator> extras;
    private double totalPrice;
    private String orderId;

    public Order(Ramen ramen) {
        this.ramen = ramen;
        this.extras = new ArrayList<>();
        this.orderId = UUID.randomUUID().toString();
        calculateTotalPrice();
    }

    public void addExtra(RamenDecorator extra) {
        this.extras.add(extra);
        calculateTotalPrice();
    }

    private void calculateTotalPrice() {
        this.totalPrice = ramen.getPrice();
        for (RamenDecorator extra : extras) {
            this.totalPrice += extra.getPrice();
        }
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public String getOrderId() {
        return this.orderId;
    }
    
    // Include a method to print the order summary
    public String printOrderSummary() {
        StringBuilder summary = new StringBuilder();
        summary.append("Order ID: ").append(orderId).append("\n")
               .append(ramen.getDescription()).append("\n");
        for (RamenDecorator extra : extras) {
            summary.append(extra.getDescription()).append("\n");
        }
        summary.append("Total Price: ").append(totalPrice);
        return summary.toString();
    }
}

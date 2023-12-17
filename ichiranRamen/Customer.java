package ichiranRamen;

public class Customer implements OrderObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Order order) {
        System.out.println("Customer " + this.name + ", your order with ID " + order.getOrderId() + " is ready!");
    }
}

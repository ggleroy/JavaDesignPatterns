package ichiranRamen;

import java.util.ArrayList;
import java.util.List;

public class OrderNotifier {
    private List<OrderObserver> observers;

    public OrderNotifier() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(OrderObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Order order) {
        for (OrderObserver observer : observers) {
            observer.update(order);
        }
    }
}

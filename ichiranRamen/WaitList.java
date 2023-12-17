package ichiranRamen;

import java.util.ArrayList;
import java.util.List;

public class WaitList {
    private static WaitList instance;
    private List<Order> orders;

    private WaitList() {
        orders = new ArrayList<>();
    }
    
    public static WaitList getInstance() {
        if(instance == null) {
            instance = new WaitList();
        }
        return instance;
    }

    public void addOrder(Order order) {
        if (order != null) {
            orders.add(order);
        }
    }
    
    // Método para remover pedidos da lista
    public void removeOrder(Order order) {
        orders.remove(order);
    }
    
    // Método para obter a lista de pedidos
    public List<Order> getOrders() {
        return new ArrayList<>(orders); // Retorna uma cópia para evitar manipulação externa
    }
    
    // Método para notificar que um pedido está pronto
    public void orderReady(String orderId) {
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                // Implemente a lógica de notificação aqui
                break;
            }
        }
    }
}

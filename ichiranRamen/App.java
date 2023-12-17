package ichiranRamen;

public class App {
    public static void main(String[] args) {
        RamenFactory ramenFactory = new RamenFactory();
        OrderNotifier notifier = new OrderNotifier();

        // Criando um pedido
        Ramen ramen = ramenFactory.getRamen("medium");
        Order order = new Order(ramen);
        order.addExtra(new ExtraMeat(ramen));

        // Adicionando o cliente como observador
        Customer customer = new Customer("John Doe");
        notifier.addObserver(customer);

        // Simula pedido sendo preparado
        System.out.println(order.printOrderSummary());
        // Notifica o cliente que o pedido está pronto
        notifier.notifyObservers(order);
    }
}

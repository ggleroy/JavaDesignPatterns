import controller.CreditCardAlgorithm;
import controller.PaypalAlgorithm;
import controller.ShoppingCart;
import model.Product;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product("123", 25);
        Product shirt = new Product("987", 15);

        cart.addProduct(pants);
        cart.addProduct(shirt);

        //payment decision
        cart.pay(new PaypalAlgorithm("g@leroy.com","password"));

        cart.pay(new CreditCardAlgorithm("guilherme","5158 9400"));

    }
}
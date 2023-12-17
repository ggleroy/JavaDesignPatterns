package factory1;

public class Main {
    public static void main(String[] args) {
        GiftFactory factory = new GiftFactory();
        GiftStore store = new GiftStore(factory);

        // Order a book gift
        Gift bookGift = store.orderGift("book");
        System.out.println("Ordered a book gift: " + bookGift.getClass().getSimpleName());

        // Try to order an unknown gift to see the exception
        try {
            Gift unknownGift = store.orderGift("toy");
            System.out.println("Ordered an unknown gift: " + unknownGift.getClass().getSimpleName());
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        System.out.println(bookGift.isPackaged());
    }
}

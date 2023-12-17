package factory1;

public class GiftFactory {
    public Gift createGift(String giftType) {
        Gift gift = null;

        if (giftType.equals("book")) {
            gift = new BookGift();
        } else {
            throw new IllegalArgumentException("Unknown gift type" + giftType);
        }
        return gift;
    }
}
   

package factory;

public class GiftStore {

    private GiftFactory factory;

    public GiftStore(GiftFactory factory) {
        this.factory = factory;
    }

    public Gift orderGift(String giftType) {
        Gift gift = factory.createGift(giftType);
        gift.separate();
        gift.packageGift();
        return gift;
    }
}
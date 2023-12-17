package factory2;

public class KnifeStore {
    private KnifeFactory factory;
    
    public KnifeStore(KnifeFactory factory) {
        this.factory = factory;
    }

    public Knife orderKnife(String knifeType) {
        Knife knife;

        knife = factory.createKnife(knifeType);

        knife.sharpen();
        knife.polish();
        knife.packageKnife();

        return knife;
    }
}

package factory3;

public class BudgetKnifeStore extends KnifeStore{

    Knife createKnife(String knifeType) {
        if (knifeType.equals("steak")) {
            return new BudgetSteakKnife();
        } else return null;
    }
    
}

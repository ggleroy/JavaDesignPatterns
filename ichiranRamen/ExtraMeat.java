package ichiranRamen;

public class ExtraMeat extends RamenDecorator {
    private Ramen ramen;

    public ExtraMeat(Ramen ramen) {
        this.ramen = ramen;
    }

    @Override
    public String getDescription() {
        return ramen.getDescription() + ", extra meat";
    }

    @Override
    public double getPrice() {
        return ramen.getPrice() + 4.00;
    }
    
    
}
